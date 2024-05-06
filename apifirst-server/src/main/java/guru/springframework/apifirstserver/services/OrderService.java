package guru.springframework.apifirstserver.services;

import com.reminetworks.apifirst.model.Order;

import java.util.List;
import java.util.UUID;

/**
 * @author Donald F. Coffin, REMI Networks
 **/
public interface OrderService {
	List<Order> listOrders();

	Order getOrderById(UUID orderId);
}