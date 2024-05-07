package guru.springframework.apifirstserver.repositories;

import com.reminetworks.apifirst.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * @author Donald F. Coffin, REMI Networks
 **/
public interface ProductRepository extends CrudRepository<Product, UUID> {
}
