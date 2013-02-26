package am.ik.tams.app.accounts.logic;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;

import am.ik.tams.app.account.logic.AccountLogic;
import am.ik.tams.app.account.model.AccountResource;
import am.ik.tams.domain.model.Account;

@Component
public class AccountsLogic {
    @Inject
    private AccountLogic accountLogic;

    public Collection<AccountResource> createAccountResources(
            Collection<Account> accounts) {
        return Collections2.transform(accounts,
                new Function<Account, AccountResource>() {
                    public AccountResource apply(Account account) {
                        return accountLogic.createAccountResource(account);
                    }
                });
    }
}
