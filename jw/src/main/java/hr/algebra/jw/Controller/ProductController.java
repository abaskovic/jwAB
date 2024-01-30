package hr.algebra.jw.Controller;

import hr.algebra.jw.Model.Product;
import hr.algebra.jw.Services.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductsRepository productsRepository;
    @GetMapping("/admin/products")
    public String showProductList(Model model){
        List<Product> products = productsRepository.findAll();
        model.addAttribute("products",products);
        return "admin/products";
    }
}