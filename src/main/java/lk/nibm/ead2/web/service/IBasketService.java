package lk.nibm.ead2.web.service;

import lk.nibm.ead2.web.model.Basket;
import lk.nibm.ead2.web.model.BasketItem;

import java.util.List;

public interface IBasketService {

    List<BasketItem> findAll();

}