package lk.nibm.ead2.web.controller;

import lk.nibm.ead2.web.model.Basket;
import lk.nibm.ead2.web.service.IBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BasketRestController {

    @Autowired
    IBasketService service;

    @RequestMapping(value = "/basket",method = RequestMethod.POST)
    @ResponseBody
    public Basket createBasket(@RequestBody Basket basket){
        return service.save(basket);
    }
}
