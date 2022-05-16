package ma.enset.ecomapi.web;

import ma.enset.ecomapi.Repositories.ProductRepository;
import ma.enset.ecomapi.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ProductRestController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path="/products")
    public List<Product> productList(){
        return productRepository.findAll();
    }

    @GetMapping(path = "/products/{id}")
    public Product getProducts(@PathVariable(name="id") String id){
        return productRepository.findById(id).get();
    }

    @PostMapping(path = "/products")
    public Product saveProduct(@RequestBody Product product){
        product.setId(UUID.randomUUID().toString());
       return productRepository.save(product);
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@RequestBody Product product,@PathVariable String id){
        product.setId(id);
        return productRepository.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable String id){
        productRepository.deleteById(id);

    }

}
