package springBootMultipleDatabase.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springBootMultipleDatabase.model.product.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
