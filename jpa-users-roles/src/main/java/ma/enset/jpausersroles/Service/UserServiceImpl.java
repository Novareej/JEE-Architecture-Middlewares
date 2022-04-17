package ma.enset.jpausersroles.Service;

import lombok.AllArgsConstructor;
import ma.enset.jpausersroles.Repositories.RoleRepository;
import ma.enset.jpausersroles.Repositories.UserRepository;
import ma.enset.jpausersroles.entities.Role;
import ma.enset.jpausersroles.entities.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Override
    public User addNewUser(User user) {
        user.setUserID(UUID.randomUUID().toString());

        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) {

        return roleRepository.save(role);
    }

    @Override
    public User findUserByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }

    @Override
    public Role findRoleByRoleName(String roleName) {
        return roleRepository.findByRoleName(roleName);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user=this.findUserByUserName(username);
        Role role=this.findRoleByRoleName(roleName);
        if(user.getRoles()!=null) {
            user.getRoles().add(role);
            role.getUsers().add(user); //Bidirectionnel


        }
        //userRepository.save(user);
    }

    @Override
    public User authenticate(String userName, String passwd) {
        User user=userRepository.findByUsername(userName);
        if(user==null) throw new RuntimeException("Wrong credentials");
        if(user.getPassword().equals(passwd)){
            return user;
        }
        throw new RuntimeException("Wrong credentials");
    }
}
