package com.ivoyant.springProject.controllers;

import com.ivoyant.springProject.models.AppUsers;
import com.ivoyant.springProject.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Objects;

@Controller
public class MVCController {

    private UserService userService;

    @Autowired
    public MVCController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/helloWorld")
    public String helloWorld(Model model){
        model.addAttribute("message","Hello from vivek");
        return "helloWorld";
    }

    @GetMapping("/test/api")
    public String test(Model model){
        model.addAttribute("page","This is test API Page");
        model.addAttribute("desc","This is rendering from spring MVC");
        return "test";
    }

    @GetMapping("/test/end/point")
    public String endPoint(Model model){
        model.addAttribute("pagg2","This is new page end point");
        model.addAttribute("des","This is new page end point");
        return "endpoint";
    }

    @GetMapping("/register")
    public String showRegister(Model model){
        model.addAttribute("user",new AppUsers());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute AppUsers user,RedirectAttributes redirectAttributes){
        userService.save(user);
        redirectAttributes.addFlashAttribute("message","Registration Successful! Please Login");
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginPage(Model model, RedirectAttributes redirectAttributes, HttpSession session){
        AppUsers user = (AppUsers) session.getAttribute("user");
        if(Objects.nonNull(user)){
            model.addAttribute("user",user);
            return "redirect:/dashboard";
        }
        model.addAttribute("user",new AppUsers());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") AppUsers user,RedirectAttributes redirectAttributes,HttpSession session){
        AppUsers validUser = userService.validateUser(user.getEmail(),user.getPassword());
        if(Objects.nonNull(validUser)){
            redirectAttributes.addFlashAttribute("message","Login Successful");
            session.setAttribute("user",validUser);
            return "redirect:/dashboard";
        }else {
            redirectAttributes.addFlashAttribute("error","Invalid email or password. Please try again");
            return "redirect:/login";
        }
    }

    @GetMapping("/dashboard")
    public String showDashBoard(Model model,HttpSession session,RedirectAttributes redirectAttributes){
        AppUsers user = (AppUsers) session.getAttribute("user");
        if(Objects.nonNull(user)){
            return "redirect:/login";
        }
        model.addAttribute("user",user);
        return "dashboard";
    }

    @PostMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if(session!=null){
            session.invalidate();
        }
        return "redirect:/login";
    }
}

