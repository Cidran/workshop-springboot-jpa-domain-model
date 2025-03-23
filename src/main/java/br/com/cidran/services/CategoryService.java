package br.com.cidran.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cidran.entities.Category;
import br.com.cidran.repositories.CategoryRepository;

@Service // Registra a classe como componente do spring, permitindo a Injeção de Dependência
public class CategoryService {

	@Autowired
	private CategoryRepository CategoryRepository;
	
	public List<Category> findAll(){
		return CategoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = CategoryRepository.findById(id);
		return obj.get();
	}
}
