package ma.enset.ecomapi.Repositories;

import ma.enset.ecomapi.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    
}
