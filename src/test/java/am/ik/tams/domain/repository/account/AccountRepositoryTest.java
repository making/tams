package am.ik.tams.domain.repository.account;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import am.ik.tams.common.uuid.UuidGenerator;
import am.ik.tams.domain.model.Account;
import am.ik.tams.domain.model.AccountStatus;
import am.ik.tams.domain.model.Credentials;
import am.ik.tams.domain.model.CredentialsStatus;
import am.ik.tams.domain.model.Role;

import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml" })
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class AccountRepositoryTest {
    @Autowired
    protected JdbcTemplate jdbcTemplate;

    @Autowired
    protected AccountRepository accountRepository;

    private DateTime now = new DateTime();

    @Before
    @Rollback(value = false)
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFindByNameLike01() {
        System.out.println(accountRepository.findAll());

        UuidGenerator uuidGenerator = new UuidGenerator();
        Credentials credentials = new Credentials("u001", "xxxx", "test@example.com", CredentialsStatus.ACTIVATED, null, now
                .toDate(), now.toDate(), 0L);
        Account account = new Account(uuidGenerator.generateUuid(), "Taro", "Yamada", new LocalDate(1980, 1, 1)
                .toDate(), AccountStatus.ACTIVATED, credentials, Arrays
                .asList(Role.USER), now.toDate(), now.toDate(), 0L);
        accountRepository.saveAndFlush(account);
    }
}
