package lk.nibm.ead2.web.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Integer> productsList = new ArrayList<Integer>();

    public Cart() {
        super();
    }

    public List<Integer> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Integer> productsList) {
        this.productsList = productsList;
    }

    public String addToCart(int id){
        productsList.add(id);
        return "Product added successfully !";}

    public List<Integer> readCart(){return productsList;}

    public Boolean checkProductById(int id){
        Boolean msg = false;

        for (int i=0;i<productsList.size();i++){
            if(productsList.get(i).equals(id)){
                msg = true;
                break;}}
        return msg;}


    public void clear(){
        productsList.clear();
    }
}
