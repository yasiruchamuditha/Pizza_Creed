package lk.nibm.ead2.web.controller;

import lk.nibm.ead2.web.model.BasketItem;
import lk.nibm.ead2.web.service.IBasketService;
import lk.nibm.ead2.web.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BasketRestController {

    @Autowired
    IBasketService service;

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/basket",method = RequestMethod.GET)
    @ResponseBody
    public List<BasketItem> getProducts(){
        return service.findAll();
    }





}
