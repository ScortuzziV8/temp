package v8.com.timesheet.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "position")
public class PositionModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    @Column(nullable = false)
    private String positionName;
    @OneToMany(mappedBy = "position", fetch = FetchType.LAZY)
    private Set<UserModel> users = new HashSet<>();
}
