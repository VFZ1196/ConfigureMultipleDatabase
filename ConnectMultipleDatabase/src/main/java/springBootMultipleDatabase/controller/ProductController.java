package springBootMultipleDatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springBootMultipleDatabase.model.product.Product;
import springBootMultipleDatabase.repository.product.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/product")
	public Product saveRecordAfterCheck(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@GetMapping("/product")
	public List<Product> getAllRecords() {
		return productRepository.findAll();
	}

}
