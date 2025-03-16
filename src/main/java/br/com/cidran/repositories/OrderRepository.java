package br.com.cidran.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cidran.entities.Order;

// O JpaRepository pede a entidade(User) e o datatype do Id(Long).
public interface OrderRepository extends JpaRepository<Order, Long>{
	/* Basta isso para poder fazer operações no DB. Ao extender
	 * JpaRepository, vc já herda todas os métodos necessários.
	 */
}
