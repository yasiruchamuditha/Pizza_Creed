package lk.nibm.ead2.web.service.impl;

import lk.nibm.ead2.web.model.BasketItem;
import lk.nibm.ead2.web.repository.BasketItemRepository;
import lk.nibm.ead2.web.repository.ProductRepository;
import lk.nibm.ead2.web.service.IBasketItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
@Service
public class BasketItemService implements IBasketItemService {

    public Double cost = 0.0;

    @Autowired
    private BasketItemRepository basketItemRepository;

    @Autowired
    private ProductRepository productRepository;

    //method for save new Basket Item
    @Override
    public String saveBasket(BasketItem basketItem) {
        basketItemRepository.save(basketItem);
        return "New Basket Item Added";
    }

    //method for get all basket Items
    @Override
    public List<BasketItem> getAllBaskets() {
        return basketItemRepository.findAll();
    }

    //method for cost zero
    @Override
    public void clearCart() {
        cost=0.0;
    }

    //delete basket Items by Id
    @Override
    public boolean deleteBasketById(Long basketId) {
        Optional<BasketItem> basketOptional = basketItemRepository.findById(basketId);
        if (basketOptional.isPresent()) {
            BasketItem basket = basketOptional.get();
            basketItemRepository.delete(basket);
            return true;
        }
        return false;
    }

    //delete all basket Items (clear cart)
    @Override
    public boolean deleteAllBasketItems() {
        try {
            basketItemRepository.deleteAll();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
