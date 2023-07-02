package lk.nibm.ead2.web.controller;

import lk.nibm.ead2.web.model.Product;
import lk.nibm.ead2.web.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    //request for load home page
    @RequestMapping("home")
    public String showHome(){
        return "home";
    }

    //GUI Table request for list all products
    @GetMapping("/product")
    public String showProductPage(Model model) {
        List<Product> listProduct = productService.listAll();
        model.addAttribute("listProduct",listProduct);
        System.out.println("Get / ");
        return "product";
    }

    //GUI Table request for load new_product page
    @GetMapping("/new_product")
    public String add(Model model)
    {
        model.addAttribute("product", new Product());
        return "new_product";
    }

    //GUI Table request for save new product
    @RequestMapping(value = "/saves", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product std){
        productService.saveProducts(std);
        return "redirect:product";
    }

    //GUI Table method for update/edit products
    @RequestMapping("/edits/{id}")
    public ModelAndView showEditPage(@PathVariable(name = "id") Long id){
        ModelAndView mav = new ModelAndView("new_product");
        Product std = productService.get(id);
        mav.addObject("product",std);
        return mav;
    }

    //GUI Table method for delete products
    @RequestMapping("/deletes/{id}")
    public String deleteProduct(@PathVariable(name = "id") Long id){
        productService.deleteProducts(id);
        return "home";
    }
}
