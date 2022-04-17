package ma.enset.jpausersroles;

import ma.enset.jpausersroles.Service.UserService;
import ma.enset.jpausersroles.entities.Role;
import ma.enset.jpausersroles.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class JpaUsersRolesApplication {

    public static void main(String[] args) {

        SpringApplication.run(JpaUsersRolesApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserService userService){
       return args -> {
           User u = new User();
           u.setUsername("u1");
           u.setPassword("test");
           userService.addNewUser(u);

           User u2 = new User();
           u2.setUsername("admin");
           u2.setPassword("test");
           userService.addNewUser(u2);

           Stream.of("STUDENT","USER","ADMIN").forEach(r->{
               Role r1=new Role();
               r1.setRoleName(r);
               userService.addNewRole(r1);
           });

           userService.addRoleToUser("u1","STUDENT");
           userService.addRoleToUser("u1","USER");
           userService.addRoleToUser("admin","USER");
           userService.addRoleToUser("admin","ADMIN");

           try {
               User user= userService.authenticate("u1","test");
               System.out.println(user.getUserID());
               System.out.println(user.getUsername());
               System.out.println("Roles=>");
               user.getRoles().forEach(r->{
                   System.out.println("Role=>"+r);
               });
           }catch(Exception e){
                e.printStackTrace();
           }
       };
    }
}
