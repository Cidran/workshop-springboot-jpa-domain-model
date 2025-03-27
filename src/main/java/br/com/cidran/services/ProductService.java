package br.com.cidran.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cidran.entities.Product;
import br.com.cidran.repositories.ProductRepository;

@Service // Registra a classe como componente do spring, permitindo a Injeção de Dependência
public class ProductService {

	@Autowired
	private ProductRepository ProductRepository;
	
	public List<Product> findAll(){
		return ProductRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = ProductRepository.findById(id);
		return obj.get();
	}
}
