package guru.springframework.apifirstserver.bootstrap;

import com.reminetworks.apifirst.model.Address;
import com.reminetworks.apifirst.model.Customer;
import com.reminetworks.apifirst.model.Name;
import com.reminetworks.apifirst.model.PaymentMethod;
import guru.springframework.apifirstserver.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Donald F. Coffin, Green Button Alliance, Inc.
 **/
@RequiredArgsConstructor
@Component
public class DataLoader implements CommandLineRunner {

	private final CustomerRepository customerRepository;

	@Override
	public void run(String... args) throws Exception {

		Address address1 = Address.builder()
				.addressLine1("1234 W Some Street")
				.city("Some City")
				.state("FL")
				.zip("33701")
				.build();

		Customer customer1 = Customer.builder()
				.name(Name.builder()
						.firstName("John")
						.lastName("Thompson")
						.build())
				.billToAddress(address1)
				.shipToAddress(address1)
				.email("john@springframework.guru")
				.phone("800-555-1212")
				.paymentMethods(List.of(PaymentMethod.builder()
								.displayName("My Card")
								.cardNumber(12341234)
								.expiryMonth(12)
								.expiryYear(26)
								.cvv(123)
						.build()))
				.build();

		Address address2 = Address.builder()
				.addressLine1("1234 W Some Street")
				.city("Some City")
				.state("FL")
				.zip("33701")
				.build();

		Customer customer2 = Customer.builder()
				.name(Name.builder()
						.firstName("Jim")
						.lastName("Smith")
						.build())
				.billToAddress(address1)
				.shipToAddress(address1)
				.email("jim@springframework.guru")
				.phone("800-555-1212")
				.paymentMethods(List.of(PaymentMethod.builder()
						.displayName("My Other Card")
						.cardNumber(1234888)
						.expiryMonth(12)
						.expiryYear(26)
						.cvv(456)
						.build()))
				.build();

		customerRepository.save(customer1);
		customerRepository.save(customer2);
	}
}
