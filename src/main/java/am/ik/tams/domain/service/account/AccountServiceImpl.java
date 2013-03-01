package am.ik.tams.domain.service.account;

import java.util.List;

import javax.inject.Inject;

import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import am.ik.tams.common.uuid.UuidGenerator;
import am.ik.tams.domain.model.Account;
import am.ik.tams.domain.repository.account.AccountRepository;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Inject
    protected AccountRepository accountRepository;

    protected UuidGenerator uuidGenerator = new UuidGenerator();

    @Transactional(readOnly = true)
    public Account getAccount(String accountId) {
        return accountRepository.findOne(accountId);
    }

    @Transactional(readOnly = true)
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    public Account createAccount(Account account) {
        String accountId = uuidGenerator.generateUuid();
        DateTime now = new DateTime();
        account.setAccountId(accountId);
        account.setCreatedAt(now.toDate());
        account.setUpdatedAt(now.toDate());
        account.setPasswordUpdatedAt(now.toDate());
        accountRepository.save(account);
        return account;
    }
}
