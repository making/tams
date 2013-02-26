package am.ik.tams.domain.service.account;

import java.util.List;

import am.ik.tams.domain.model.Account;

public interface AccountService {

    Account getAccount(String accountId);

    List<Account> getAccounts();

    Account createAccount(Account account);
}
