package lk.nibm.ead2.web.service.impl;

import lk.nibm.ead2.web.model.BasketItem;
import lk.nibm.ead2.web.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private List<Order> orders = new ArrayList<>();


    public void getTotal(BasketItem item){
        this.orders = (List<Order>) item;
    }
}
