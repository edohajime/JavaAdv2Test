package com.samsung.javaadv2test.controller;

import com.samsung.javaadv2test.repositories.models.User;
import com.samsung.javaadv2test.services.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login () {
        return "Auth/login";
    }

    @GetMapping("/register")
    public String register(final Model model) {
        model.addAttribute("newuser", new User());
        return "Auth/register";
    }

    @PostMapping("/register")
    public String CreateAccount(@ModelAttribute User user, final Model model) {
        User tmpUser = userService.getUserByUsername(user.getUsername());
        if (tmpUser == null) {
            if (user.getPassword().equals(user.getConfirmPassword())) {
                user.setPassword(passwordEncoder.encode(user.getPassword()));
                userService.createUser(user);
                return "redirect:/login";
            } else {
                model.addAttribute("error", "Confirm_password_is_not_match");
            }
        } else {
            model.addAttribute("error", "Username_is_already_in_use");
        }
        model.addAttribute("newuser", user);
        return "redirect:/register";
    }

}
