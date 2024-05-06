package guru.springframework.apifirstserver.controllers;

import com.reminetworks.apifirst.model.Order;
import guru.springframework.apifirstserver.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import static guru.springframework.apifirstserver.controllers.OrderController.*;

/**
 * @author Donald F. Coffin, REMI Networks
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping(BASE_URL)
public class OrderController {

	public static final String BASE_URL = "/v1/orders";

	private final OrderService orderService;

	@GetMapping
	public ResponseEntity<List<Order>> listOrders(){
		return ResponseEntity.ok(orderService.listOrders());
	}

	@GetMapping("/{orderId}")
	public ResponseEntity<Order> getProductById(@PathVariable("orderId") UUID orderId) {
		return ResponseEntity.ok(orderService.getOrderById(orderId));
	}
}