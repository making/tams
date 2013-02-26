package am.ik.tams.app.account.model;

import java.io.Serializable;
import java.util.Date;

import am.ik.tams.domain.model.CredentialsStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CredentialsResource implements Serializable {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    private String userId;

    private String email;

    private String password;

    private CredentialsStatus status;

    private Date lockedAt;

    private Date createdAt;

    private Date updatedAt;

    private Long version;
}
