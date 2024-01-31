package hr.algebra.jw.Controller;

import hr.algebra.jw.Model.Product;
import hr.algebra.jw.Repositories.ProductRepository;
import hr.algebra.jw.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;

    @GetMapping("")
    public String showProducts(Model model) {


        List<Product> products = productRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));

        Map<Long, Integer> productQuantities;
        productQuantities = new HashMap<>();

        for (Product product : products) {
            productQuantities.put(product.getId(), 1);
        }

        model.addAttribute("products", products);
        model.addAttribute("productQuantities", productQuantities);

        System.out.println(productQuantities);
        System.out.println(products);

        return "shop/index";
    }
}



