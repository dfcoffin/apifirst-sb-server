package guru.springframework.apifirstserver.repositories;

import com.reminetworks.apifirst.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * @author Donald F. Coffin, REMI Networks
 **/
public interface CustomerRepository extends CrudRepository<Customer, UUID> {
}
