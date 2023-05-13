package lk.nibm.ead2.web.service.impl;

import lk.nibm.ead2.web.model.BasketItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasketItemService {

    private List<BasketItem> items = new ArrayList<>();

    public List<BasketItem> getItems() {
        return items;
    }

    public void setItems(List<BasketItem> items) {
        this.items = items;
    }

    public void clear() {
        items.clear();
    }

    public BasketItem addItem(BasketItem item) {
        return item;
    }

    public void removeItem(int index) {
        items.remove(index);
    }

    public double getTotal() {
        double total = 0;
        for (BasketItem item : items) {
            total += item.getQuantity() * item.getProduct().getPrice();
        }
        return total;
    }
}
