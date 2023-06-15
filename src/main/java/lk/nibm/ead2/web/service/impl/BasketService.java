package lk.nibm.ead2.web.service.impl;
import lk.nibm.ead2.web.model.BasketItem;
import lk.nibm.ead2.web.repository.BasketItemRepository;
import lk.nibm.ead2.web.repository.BasketRepository;
import lk.nibm.ead2.web.service.IBasketService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class BasketService implements IBasketService {

    @Autowired
    BasketItemRepository basketItemRepository;

    @Override
    public List<BasketItem> findAll() {
        List<BasketItem> basketItems = basketItemRepository.findAll();
        return basketItems.stream().map(s->{
            BasketItem dto = new BasketItem();
            BeanUtils.copyProperties(s,dto);
            return dto;
        }).collect(Collectors.toList());
    }


}
