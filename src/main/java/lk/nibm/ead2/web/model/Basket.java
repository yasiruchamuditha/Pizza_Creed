package lk.nibm.ead2.web.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
@Entity
@Table(name = "BASKET")
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID")
    private String id;
    @OneToMany(mappedBy = "basket")
    private List<BasketItem> basketItems;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<BasketItem> getBasketItems() {
        return basketItems;
    }

    public void setBasketItems(List<BasketItem> basketItems) {
        this.basketItems = basketItems;
    }

}
