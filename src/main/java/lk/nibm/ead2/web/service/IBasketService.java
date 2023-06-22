package lk.nibm.ead2.web.service;

import lk.nibm.ead2.web.model.Basket;

import java.util.List;

public interface IBasketService {
    Basket createBasket(Basket basket1);
    List<Basket> findallBaskets();
    Basket createBasket();

}
