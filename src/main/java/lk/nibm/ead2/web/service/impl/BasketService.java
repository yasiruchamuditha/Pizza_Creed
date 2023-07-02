package lk.nibm.ead2.web.service.impl;

import lk.nibm.ead2.web.model.Basket;
import lk.nibm.ead2.web.repository.BasketItemRepository;
import lk.nibm.ead2.web.repository.BasketRepository;
import lk.nibm.ead2.web.service.IBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
@Service
public class BasketService implements IBasketService {
    @Autowired
    private BasketRepository basketRepository;

    //method for create new basket method 01
    @Override
    public Basket createBasket(Basket basket1) {
        Basket createdBasket = basketRepository.save(basket1);
        //return createdBasket.getId();
        return createdBasket;
    }

    //method for create new basket method 02
    @Override
    public Basket createBasket() {
        Basket basket = new Basket();
        return basketRepository.save(basket);
    }
    //method for read all baskets
    @Override
    public List<Basket> findallBaskets() {
        return basketRepository.findAll();
    }


}
