package hr.algebra.jw.Controller;

import hr.algebra.jw.Dto.UserDto;
import hr.algebra.jw.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class ShopController {


    @GetMapping("/shop")
    public String showRegistrationForm() {
        return "shop";
    }



}
