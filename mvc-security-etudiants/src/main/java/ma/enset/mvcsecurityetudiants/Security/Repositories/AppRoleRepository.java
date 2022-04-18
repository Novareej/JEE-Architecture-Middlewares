package ma.enset.mvcsecurityetudiants.Security.Repositories;


import ma.enset.mvcsecurityetudiants.Security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findByRoleName(String roleName);
}