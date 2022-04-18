package ma.enset.mvcsecurityetudiants.Security.service;

import ma.enset.mvcsecurityetudiants.Security.entities.AppRole;
import ma.enset.mvcsecurityetudiants.Security.entities.AppUser;

public interface SecurityService {
    AppUser saveNewUser(String username,String password, String rePwd);
    AppRole saveNewRole(String roleName, String description);
    void addRoleToUser(String username, String roleName);
    void removeRoleFromUser(String username, String roleName);
    AppUser loadUserByUsername(String username);
}