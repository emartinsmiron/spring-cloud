package br.com.emiron.usermanagement.repository;

import br.com.emiron.usermanagement.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByUsernameContaining(final String username);

    Optional<User> findByUsername(final String username);
}
