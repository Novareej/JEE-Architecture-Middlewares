package ma.enset.jpausersroles.Repositories;

import ma.enset.jpausersroles.entities.Role;
import ma.enset.jpausersroles.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByRoleName(String roleName);

}
