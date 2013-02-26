package am.ik.tams.app.accounts.controller;

import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import am.ik.tams.app.account.logic.AccountLogic;
import am.ik.tams.app.account.model.AccountResource;
import am.ik.tams.app.accounts.logic.AccountsLogic;
import am.ik.tams.domain.model.Account;
import am.ik.tams.domain.service.account.AccountService;

@Controller
@RequestMapping("accounts")
public class AccountsController {
    @Inject
    protected AccountService accountService;

    @Inject
    private AccountLogic accountLogic;

    @Inject
    protected AccountsLogic accountsLogic;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Collection<AccountResource>> getAccounts() {
        List<Account> accounts = accountService.getAccounts();
        Collection<AccountResource> resource = accountsLogic
                .createAccountResources(accounts);
        return new ResponseEntity<Collection<AccountResource>>(resource, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<AccountResource> postAccounts(
            @RequestBody AccountResource resource) {
        Account account = accountLogic.createAccount(resource);
        accountService.createAccount(account);
        AccountResource accountResource = accountLogic
                .createAccountResource(account);
        return new ResponseEntity<AccountResource>(accountResource, HttpStatus.CREATED);
    }
}
