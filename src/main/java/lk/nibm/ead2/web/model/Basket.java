package lk.nibm.ead2.web.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "BASKET")
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID")
    private String id;

    @OneToMany(mappedBy = "basket")
    private List<BasketItem> basketItems;

    @OneToMany(mappedBy = "basket")
    private List<Order> orders;

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

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}
