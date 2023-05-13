package lk.nibm.ead2.web.repository;

import lk.nibm.ead2.web.model.BasketItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketItemRepository extends JpaRepository<BasketItem,Long> {
}
