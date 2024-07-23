package v8.com.timesheet.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import v8.com.timesheet.enums.Seniority;

import java.io.Serializable;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column
    private String seniority;
    @Column
    private String phone;
    @Column(nullable = false)
    private String creationDate;
    @Column
    private String updateDate;
    @Column
    private String comments;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position_id", nullable = false)
    private PositionModel position;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acessProfile_id", nullable = false)
    private AcessProfileModel acessProfile;
    @Column(nullable = false)
    private Boolean active;

}
