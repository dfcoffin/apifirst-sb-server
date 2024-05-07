package guru.springframework.apifirstserver.services;

import com.reminetworks.apifirst.model.Product;

import java.util.List;
import java.util.UUID;

/**
 * @author Donald F. Coffin, REMI Networks
 **/
public interface ProductService {
	List<Product> listProducts();

	Product getProductById(UUID productId);
}
