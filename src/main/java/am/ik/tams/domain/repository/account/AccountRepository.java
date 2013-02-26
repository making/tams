package am.ik.tams.domain.repository.account;

import org.springframework.data.jpa.repository.JpaRepository;

import am.ik.tams.domain.model.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

}
