package br.com.emiron.usermanagement.controller;

import br.com.emiron.usermanagement.domain.User;
import br.com.emiron.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository repository;

    @Autowired
    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/{username}")
    public List<User> findByUsername(@PathVariable final String username){
     return Collections.unmodifiableList(repository.findByUsernameContaining(username));
    }

    @GetMapping
    public List<User> findAll(){
        return Collections.unmodifiableList((List<User>)repository.findAll());
    }

    @PostMapping
    public void create(@RequestBody final User user){
        repository.save(user);
    }

    @PutMapping
    public void update(@RequestParam final User user){
        repository.save(user);
    }




}
