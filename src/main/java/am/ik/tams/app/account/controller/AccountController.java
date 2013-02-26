package am.ik.tams.app.account.controller;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import am.ik.tams.app.account.logic.AccountLogic;
import am.ik.tams.app.account.model.AccountResource;
import am.ik.tams.domain.model.Account;
import am.ik.tams.domain.service.account.AccountService;

@Controller
@RequestMapping("accounts")
public class AccountController {
    @Inject
    protected AccountService accountService;

    @Inject
    protected AccountLogic accountLogic;

    @RequestMapping(value = "{accountId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<AccountResource> getAccount(
            @PathVariable("accountId") String accountId) {
        Account account = accountService.getAccount(accountId);
        AccountResource resource = accountLogic.createAccountResource(account);
        return new ResponseEntity<AccountResource>(resource, HttpStatus.OK);
    }
}
