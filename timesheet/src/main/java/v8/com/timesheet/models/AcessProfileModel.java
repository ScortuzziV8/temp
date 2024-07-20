package v8.com.timesheet.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "AcessProfile")
@Getter
@Setter
public class AcessProfileModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    @Column(nullable = false)
    private String AcessProfile;
    @OneToMany(mappedBy = "acessProfile", fetch = FetchType.LAZY)
    private Set<UserModel> users = new HashSet<>();
}
