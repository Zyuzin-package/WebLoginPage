package login.controllers;

import jakarta.validation.Valid;
import login.dao.dataBase.UserDao;
import login.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String start(Model model,@ModelAttribute("user") User user) {
        return "loginPage/loginPage";
    }

    @PostMapping
    public String login(@ModelAttribute("user") User user) {
//        if(bindingResult.hasErrors()){
//            System.out.println("Error!");
//            return "loginPage/loginPage";
//        }
        System.out.println(user.getUserName() + "|" + user.getPassword());
        return "redirect:/login";
    }
}
