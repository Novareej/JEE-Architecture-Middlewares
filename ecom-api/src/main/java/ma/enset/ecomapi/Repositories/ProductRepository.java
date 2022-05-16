package ma.enset.ecomapi.Repositories;

import ma.enset.ecomapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {


}
