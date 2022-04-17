package ma.enset.jpausersroles.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="USERS")
@Data @NoArgsConstructor @AllArgsConstructor
public class User {
    @Id
    private String userID;
    @Column(name="USER_NAME",unique = true,length = 20)

    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    @ManyToMany(mappedBy = "users", fetch = FetchType.EAGER)
    //Pour chaque chargement de User, il y aura un chargement automatique de roles
    private List<Role> roles= new ArrayList<>(); // Eviter NullPointerException
}
