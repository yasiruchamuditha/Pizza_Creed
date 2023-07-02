package lk.nibm.ead2.web.repository;

import lk.nibm.ead2.web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public interface UserRepository  extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
