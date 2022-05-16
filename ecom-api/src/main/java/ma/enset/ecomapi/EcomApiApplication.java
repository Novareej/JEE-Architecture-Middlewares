package ma.enset.ecomapi;

import ma.enset.ecomapi.Repositories.ProductRepository;
import ma.enset.ecomapi.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class EcomApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcomApiApplication.class, args);


    }

    @Bean
    public CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            Stream.of("Computer","Printer","SmartPhone").forEach(name->{
                productRepository.save(
                        new Product(
                                UUID.randomUUID().toString(),
                                name,Math.random()*8000,
                        Math.random()*100)
                );
            });
        };
    }
}
