package lk.nibm.ead2.web.service.impl;

import lk.nibm.ead2.web.model.Basket;
import lk.nibm.ead2.web.repository.BasketRepository;
import lk.nibm.ead2.web.service.IBasketService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BasketService implements IBasketService {

    @Autowired
    BasketRepository basketRepository;


    @Override
    public Basket save(Basket basket) {
        Basket dto = null;
        if(basket.getId() == null){
            dto = new Basket();
        }else{
            Optional<Basket> optionalBasket = basketRepository.findById(basket.getId());
            if(optionalBasket.isPresent()){
                dto = optionalBasket.get();
            }
        }
        BeanUtils.copyProperties(basket,dto);
        dto = basketRepository.save(dto);
        basket.setId(dto.getId());
        return basket;
    }
}
