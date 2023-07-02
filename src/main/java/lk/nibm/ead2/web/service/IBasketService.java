package lk.nibm.ead2.web.service;

import lk.nibm.ead2.web.model.Basket;

import java.util.List;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public interface IBasketService {
    Basket createBasket(Basket basket1);
    List<Basket> findallBaskets();
    Basket createBasket();

}
