package guru.springframework.apifirstserver.services;

import com.reminetworks.apifirst.model.Product;
import guru.springframework.apifirstserver.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.StreamSupport;

/**
 * @author Donald F. Coffin, REMI Networks
 **/
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;

	@Override
	public List<Product> listProducts() {
		return StreamSupport.stream(productRepository.findAll().spliterator(), false)
				.toList();
	}

	@Override
	public Product getProductById(UUID productId) {
		return productRepository.findById(productId).orElseThrow();
	}

}