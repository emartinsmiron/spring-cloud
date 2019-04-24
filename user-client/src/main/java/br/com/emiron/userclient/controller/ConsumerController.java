package br.com.emiron.userclient.controller;

import br.com.emiron.userclient.client.UserService;
import br.com.emiron.userclient.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {

    private UserService userService;

    @Autowired
    public ConsumerController(final UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users")
    public List<User> getUsers(){
        return userService.findAll();
    }

}
