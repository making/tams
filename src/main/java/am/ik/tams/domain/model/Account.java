package am.ik.tams.domain.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
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
public class Account implements Serializable {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 32)
    private String accountId;

    @Column(length = 50, nullable = true)
    private String firstName;

    @Column(length = 50, nullable = true)
    private String lastName;

    @Column
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Credentials credentials;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Version
    private long version;
}
