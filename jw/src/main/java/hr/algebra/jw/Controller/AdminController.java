package hr.algebra.jw.Controller;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class AdminController {
    @GetMapping("/admin/category")
    public String userPage() {
        return "admin/category";
    }

}
