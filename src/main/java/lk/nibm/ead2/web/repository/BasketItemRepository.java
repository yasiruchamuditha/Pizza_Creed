package lk.nibm.ead2.web.repository;

import lk.nibm.ead2.web.model.BasketItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
@Repository
public interface BasketItemRepository extends JpaRepository<BasketItem,Long> {
}
