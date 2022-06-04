package ma.enset.ecomapi;

import ma.enset.ecomapi.Repositories.CategoryRepository;
import ma.enset.ecomapi.Repositories.ProductRepository;
import ma.enset.ecomapi.entities.Category;
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
    public CommandLineRunner start(ProductRepository productRepository, CategoryRepository categoryRepository){
        return args -> {
            Stream.of("Computers","Printers","SmartPhones").forEach(name->{
                Category category = new Category();
                category.setName(name);
                categoryRepository.save(category);
            });
            categoryRepository.findAll().forEach(cat->{
                for(int i=0;i<=5;i++){
                    Product product=new Product();
                    product.setId(UUID.randomUUID().toString());
                    product.setPrice(Math.random()*5555);
                    product.setQuantity(1+Math.random()*89);
                    product.setName(cat.getName()+"-"+i);
                    product.setCategory(cat);
                    productRepository.save(product);
                }
            });
        };
    }
}
