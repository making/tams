package am.ik.tams.domain.repository.account;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import am.ik.tams.common.uuid.UuidGenerator;
import am.ik.tams.domain.model.Account;
import am.ik.tams.domain.model.AccountStatus;
import am.ik.tams.domain.model.PasswordStatus;
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
        Account account = new Account(uuidGenerator.generateUuid(), "Taro", "Yamada", new LocalDate(1980, 1, 1)
                .toDate(), AccountStatus.ACTIVATED, "u001", "xxxx", "test@example.com", PasswordStatus.ACTIVATED, now
                .toDate(), now.toDate(), Arrays.asList(Role.USER), now.toDate(), now
                .toDate(), 0L);
        accountRepository.saveAndFlush(account);
    }
}
