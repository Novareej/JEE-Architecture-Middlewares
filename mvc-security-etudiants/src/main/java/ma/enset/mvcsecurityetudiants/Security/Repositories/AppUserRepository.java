package ma.enset.mvcsecurityetudiants.Security.Repositories;

import ma.enset.mvcsecurityetudiants.Security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String> {
    AppUser findByUsername(String username);
}