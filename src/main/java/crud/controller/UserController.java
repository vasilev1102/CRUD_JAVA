package crud.controller;

import crud.model.User;
import crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

   /* @GetMapping(value = "/")
    public String getListUsers(Model model){
        model.addAttribute("users",userService.listUsers());
        return "index";
    }*/
    @GetMapping(value = "/users")
    public String getUsers(Model model){
        List<User> us = userService.listUsers();
        for (User user:us) {
            System.out.println(user.getId());
        }
        model.addAttribute("users",userService.listUsers());
        return "index";
    }


    @GetMapping(value = "/{id}")
    public String getUser(@PathVariable("id") int id,Model model){
            model.addAttribute("user",userService.getUserById(id));
        List<User> us = userService.listUsers();
        for (User user:us) {
            System.out.println(user.getId());
        }
        return "user";
    }




}
