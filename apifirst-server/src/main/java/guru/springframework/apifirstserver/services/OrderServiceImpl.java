package guru.springframework.apifirstserver.services;

import com.reminetworks.apifirst.model.Order;
import guru.springframework.apifirstserver.repositories.OrderRepository;
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
public class OrderServiceImpl implements OrderService {

	private final OrderRepository orderRepository;

	@Override
	public List<Order> listOrders() {
		return StreamSupport.stream(orderRepository.findAll().spliterator(), false)
				.toList();
	}

	@Override
	public Order getOrderById(UUID orderId) {
		return orderRepository.findById(orderId).orElseThrow();
	}
}