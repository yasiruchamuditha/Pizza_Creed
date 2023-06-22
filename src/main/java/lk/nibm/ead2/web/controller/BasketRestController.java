package lk.nibm.ead2.web.controller;

import lk.nibm.ead2.web.model.Basket;
import lk.nibm.ead2.web.model.BasketItem;
import lk.nibm.ead2.web.service.impl.BasketItemService;
import lk.nibm.ead2.web.service.impl.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Basket")
@CrossOrigin
public class BasketRestController {

    @Autowired
    private BasketItemService basketItemService;
    @Autowired
    private BasketService basketService;

    //method for create new basket method 01
    @PostMapping("/createBasket")
    public String Create(@RequestBody Basket basket1){
        Basket createdBasket = basketService.createBasket(basket1);
        return "New Basket Created"+" Basket ID : "+createdBasket.getId();
        //return createdBasket;
    }

    //method for create new basket method 02
    @PostMapping
    public ResponseEntity<Basket> createBasket() {
        Basket createdBasket = basketService.createBasket();
        return ResponseEntity.ok(createdBasket);
    }

    //read all basket list
    @GetMapping ("/ReadAllBasket")
    public List<Basket> findAll(){
        return basketService.findallBaskets();
    }

    //add new basket Item to basket
    @PostMapping("/addBasketItem")
    public String add(@RequestBody BasketItem basketItem){
        basketItemService.saveBasket(basketItem);
        return "New Basket Item Added;";
    }

    //read all basket Items from basket
    @GetMapping("/readBasketItem")
    public List<BasketItem> read(){
        return basketItemService.getAllBaskets();
    }

    //delete basket Item by id
    @DeleteMapping("/deleteById/{basketId}")
    public ResponseEntity<String> deleteBasketById(@PathVariable("basketId") Long basketId) {
        boolean deleted = basketItemService.deleteBasketById(basketId);
        if (deleted) {
            return ResponseEntity.ok("Basket deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //delete all basket Items (clear cart)
    @DeleteMapping("/clearCart")
    public ResponseEntity<String> deleteAllBasketItems() {
        boolean deleted = basketItemService.deleteAllBasketItems();
        if (deleted) {
            return ResponseEntity.ok("All basket items deleted successfully");
        } else {
            return ResponseEntity.noContent().build();
        }
    }

}
