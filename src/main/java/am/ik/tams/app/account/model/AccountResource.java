package am.ik.tams.app.account.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import am.ik.tams.domain.model.AccountStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResource implements Serializable {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    private String accountId;

    private String firstName;

    private String lastName;

    private Date birthDate;

    private AccountStatus status;

    private CredentialsResource credentials;

    private Collection<String> roles;
    
    private Date createdAt;

    private Date updatedAt;

    private long version;

}
