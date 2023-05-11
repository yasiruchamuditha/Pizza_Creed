package lk.nibm.ead2.web.model;

import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @OneToMany(mappedBy = "product")
    private List<BasketItem> basketItems;

    @Column(name = "Name")
    private @NotBlank String Name;

    @Column(name = "Size")
    private @NotBlank String Size;

    @Column(name = "Price")
    private @NotBlank Double Price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public List<BasketItem> getBasketItems() {
        return basketItems;
    }

    public void setBasketItems(List<BasketItem> basketItems) {
        this.basketItems = basketItems;
    }

}
