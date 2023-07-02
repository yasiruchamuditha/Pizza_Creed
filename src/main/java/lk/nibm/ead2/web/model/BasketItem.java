package lk.nibm.ead2.web.model;

import jakarta.persistence.*;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
@Entity
@Table(name = "BASKET_ITEM")
public class BasketItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Quantity")
    private Long Quantity;

    @Column(name = "Product_ID")
    private Long Product_ID;

    @ManyToOne
    private Basket basket;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantity() {
        return Quantity;
    }

    public void setQuantity(Long quantity) {
        Quantity = quantity;
    }

    public Long getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(Long product_ID) {
        Product_ID = product_ID;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

}
