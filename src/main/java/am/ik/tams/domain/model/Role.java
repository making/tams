package am.ik.tams.domain.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Role implements Serializable {

    public static final Role USER = new Role("USER", null, null, 0L);

    public static final Role ADMIN = new Role("ADMIN", null, null, 0L);

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 32)
    private String roleName;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Version
    private long version;
}
