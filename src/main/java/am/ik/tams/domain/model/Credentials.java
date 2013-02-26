package am.ik.tams.domain.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Credentials implements Serializable {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 128)
    private String userId;

    @Column(length = 128, unique = true, nullable = false)
    private String email;

    @Column(length = 256)
    private String password;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CredentialsStatus status;


    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lockedAt;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Version
    private long version;
}
