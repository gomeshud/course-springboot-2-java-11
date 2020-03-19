package com.example.couse.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.couse.entities.Category;
import com.example.couse.entities.Order;
import com.example.couse.entities.User;
import com.example.couse.entities.enums.OrderStatus;
import com.example.couse.repositories.CategoryRepository;
import com.example.couse.repositories.OrderRepository;
import com.example.couse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null,"Eletronics");
		Category cat2 = new Category(null,"Books");
		Category cat3 = new Category(null,"Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		Order o1 = new Order(null, Instant.parse("2020-03-18T20:30:29Z"),OrderStatus.PAID,u1);
		Order o2 = new Order(null, Instant.parse("2020-03-18T21:40:49Z"), OrderStatus.WAITING_PAYMANT ,u2);
		Order o3 = new Order(null, Instant.parse("2020-03-18T22:25:29Z"), OrderStatus.WAITING_PAYMANT ,u1);
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
}