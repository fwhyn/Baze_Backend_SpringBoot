package om.fwhyn.bac.baze.spring.repository;

import om.fwhyn.bac.baze.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}