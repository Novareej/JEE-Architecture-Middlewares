package ma.enset.jpausersroles.Repositories;

import ma.enset.jpausersroles.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
