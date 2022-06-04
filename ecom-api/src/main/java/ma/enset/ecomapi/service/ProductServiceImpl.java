package ma.enset.ecomapi.service;

import ma.enset.ecomapi.Repositories.ProductRepository;
import ma.enset.ecomapi.dtos.ProductDTO;
import ma.enset.ecomapi.entities.Category;
import ma.enset.ecomapi.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl {
    @Autowired
    private ProductRepository productRepository;
    public ProductDTO save(ProductDTO productDTO){
        Product product=new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        Category category= new Category();
        category.setId(productDTO.getCategory().getId());
        category.setName(productDTO.getCategory().getName());
        product.setCategory(category);
        Product savedProduct = productRepository.save(product);

    }

}
