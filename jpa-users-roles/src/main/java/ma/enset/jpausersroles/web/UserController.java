package ma.enset.jpausersroles.web;

import ma.enset.jpausersroles.Service.UserService;
import ma.enset.jpausersroles.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    @GetMapping("/users/{username}")
    public User user(@PathVariable String username){
        User user=userService.findUserByUserName(username);
        return user;
    }
}
