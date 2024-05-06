package guru.springframework.apifirstserver.repositories;

import com.reminetworks.apifirst.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * @author Donald F. Coffin, REMI Networks
 **/
public interface OrderRepository extends CrudRepository<Order, UUID> {
}
