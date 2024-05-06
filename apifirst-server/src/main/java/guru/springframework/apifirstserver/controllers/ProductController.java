package guru.springframework.apifirstserver.controllers;

import com.reminetworks.apifirst.model.Product;
import guru.springframework.apifirstserver.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import static guru.springframework.apifirstserver.controllers.ProductController.*;

/**
 * @author Donald F. Coffin, REMI Networks
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping(BASE_URL)
public class ProductController {
	public static final String BASE_URL = "/v1/products";

	private final ProductService productService;

	@GetMapping
	public ResponseEntity<List<Product>> listProducts(){
		return ResponseEntity.ok(productService.listProducts());
	}

	@GetMapping("/{productId}")
	public ResponseEntity<Product> getProductById(@PathVariable("productId") UUID productId) {
		return ResponseEntity.ok(productService.getProductById(productId));
	}
}