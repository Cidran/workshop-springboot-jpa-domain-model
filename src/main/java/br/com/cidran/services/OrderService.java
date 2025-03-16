package br.com.cidran.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cidran.entities.Order;
import br.com.cidran.repositories.OrderRepository;

@Service // Registra a classe como componente do spring, permitindo a Injeção de
			// Dependência
public class OrderService {

	@Autowired
	private OrderRepository OrderRepository;

	public List<Order> findAll() {
		return OrderRepository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = OrderRepository.findById(id);
		return obj.get();
	}
}
