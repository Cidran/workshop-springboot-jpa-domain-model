package br.com.cidran.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cidran.entities.User;

// O JpaRepository pede a entidade(User) e o datatype do Id(Long).
public interface UserRepository extends JpaRepository<User, Long>{
	/* Basta isso para poder fazer operações no DB. Ao extender
	 * JpaRepository, vc já herda todas os métodos necessários.
	 */
}
