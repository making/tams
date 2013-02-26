package am.ik.tams.app.account.logic;

import org.springframework.stereotype.Component;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;

import am.ik.tams.app.account.model.AccountResource;
import am.ik.tams.app.account.model.CredentialsResource;
import am.ik.tams.domain.model.Account;
import am.ik.tams.domain.model.Credentials;
import am.ik.tams.domain.model.Role;

@Component
public class AccountLogic {
    public AccountResource createAccountResource(Account account) {
        AccountResource resource = new AccountResource();
        resource.setAccountId(account.getAccountId());
        resource.setBirthDate(account.getBirthDate());
        resource.setCreatedAt(account.getCreatedAt());
        resource.setFirstName(account.getFirstName());
        resource.setLastName(account.getLastName());
        resource.setRoles(Collections2.transform(account.getRoles(),
                new Function<Role, String>() {
                    public String apply(Role role) {
                        return role.getRoleName();
                    }
                }));
        resource.setStatus(account.getStatus());
        resource.setUpdatedAt(account.getUpdatedAt());
        resource.setVersion(account.getVersion());

        Credentials credentials = account.getCredentials();
        CredentialsResource credentialsResource = new CredentialsResource();
        resource.setCredentials(credentialsResource);

        credentialsResource.setCreatedAt(credentials.getCreatedAt());
        credentialsResource.setEmail(credentials.getEmail());
        credentialsResource.setLockedAt(credentials.getLockedAt());
        credentialsResource.setPassword(credentials.getPassword());
        credentialsResource.setStatus(credentials.getStatus());
        credentialsResource.setUpdatedAt(credentials.getUpdatedAt());
        credentialsResource.setUserId(credentials.getUserId());
        credentialsResource.setVersion(credentials.getVersion());
        return resource;
    }

    public Account createAccount(AccountResource resource) {
        Account account = new Account();
        account.setBirthDate(resource.getBirthDate());
        account.setFirstName(resource.getFirstName());
        account.setLastName(resource.getLastName());
        account.setRoles(Collections2.transform(resource.getRoles(),
                new Function<String, Role>() {
                    public Role apply(String roleName) {
                        Role role = new Role();
                        role.setRoleName(roleName);
                        return role;
                    }
                }));
        account.setStatus(resource.getStatus());
        Credentials credentials = new Credentials();
        CredentialsResource credentialsResource = resource.getCredentials();
        account.setCredentials(credentials);

        credentials.setEmail(credentialsResource.getEmail());
        credentials.setLockedAt(credentialsResource.getLockedAt());
        credentials.setPassword(credentialsResource.getPassword());
        credentials.setStatus(credentialsResource.getStatus());
        credentials.setUserId(credentialsResource.getUserId());
        return account;
    }
}
