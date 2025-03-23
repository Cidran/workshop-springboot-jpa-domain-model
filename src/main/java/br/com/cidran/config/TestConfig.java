package br.com.cidran.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.cidran.entities.Category;
import br.com.cidran.entities.Order;
import br.com.cidran.entities.User;
import br.com.cidran.entities.enums.OrderStatus;
import br.com.cidran.repositories.CategoryRepository;
import br.com.cidran.repositories.OrderRepository;
import br.com.cidran.repositories.UserRepository;

/*
 * Classe responsável por fazer o Database Seeding em test profile.
 */

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner { // CommandLineRunner executa no start da aplicação tudo que fica
														// dentro do método run()

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		// Mocks de users
		User u1 = new User(null, "Fulano", "fulano@gmail.com", "(99) 9 9999-9999", "123456");
		User u2 = new User(null, "Ciclano", "ciclano@gmail.com", "(88) 8 8888-8888", "abcdef");
		
		//Mocks de orders
		Order o1 = new Order(null, Instant.parse("2024-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2024-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2024-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}

}
