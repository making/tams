package am.ik.tams.app.account.logic;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;

import am.ik.tams.app.account.model.AccountResource;
import am.ik.tams.domain.model.Account;
import am.ik.tams.domain.model.Role;

@Component
public class AccountLogic {

    private static final String[] IGNORED = { "roles" };

    public AccountResource createAccountResource(Account account) {
        AccountResource resource = new AccountResource();
        BeanUtils.copyProperties(account, resource, IGNORED);
        resource.setRoles(Collections2.transform(account.getRoles(),
                new Function<Role, String>() {
                    public String apply(Role role) {
                        return role.getRoleName();
                    }
                }));
        return resource;
    }

    public Account createAccount(AccountResource resource) {
        Account account = new Account();
        BeanUtils.copyProperties(resource, account, IGNORED);
        account.setRoles(Collections2.transform(resource.getRoles(),
                new Function<String, Role>() {
                    public Role apply(String roleName) {
                        Role role = new Role();
                        role.setRoleName(roleName);
                        return role;
                    }
                }));
        return account;
    }
}
