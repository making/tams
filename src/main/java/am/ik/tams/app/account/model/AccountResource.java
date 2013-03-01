package am.ik.tams.app.account.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import am.ik.tams.common.json.DateDeserializer;
import am.ik.tams.common.json.DateSerializer;
import am.ik.tams.domain.model.AccountStatus;
import am.ik.tams.domain.model.PasswordStatus;

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

    @JsonSerialize(using = DateSerializer.class)
    @JsonDeserialize(using = DateDeserializer.class)
    private Date birthDate;

    private AccountStatus accountStatus;

    private String userId;

    private String email;

    private String password;

    private PasswordStatus passwordStatus;

    private Date passwordLockedAt;

    private Date passwordUpdatedAt;

    private Collection<String> roles;

    private Date createdAt;

    private Date updatedAt;

    private long version;

}
