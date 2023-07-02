package lk.nibm.ead2.web.service;

import lk.nibm.ead2.web.model.BasketItem;

import java.util.List;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public interface IBasketItemService {

    //List<BasketItem> findAll();

    //save basket items
    String saveBasket(BasketItem basketItem);

    //get all baskets items
    List<BasketItem> getAllBaskets();

    void clearCart();

   //delete basket item by id
    boolean deleteBasketById(Long basketId);

    //method for delete all basket item
    boolean deleteAllBasketItems();
}