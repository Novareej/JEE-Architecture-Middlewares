package ma.enset.jpaassoc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaAssocApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaAssocApplication.class, args);
	}
	@Bean
	CommandLineRunner start(){

		return args -> {


		};
	}
}
