package mongodb.controllers;

import mongodb.documents.User;
import mongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by juliochrisostomo on 20/08/17.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> list() {
        return userRepository.findAll();
    }

    @PostMapping
    public void post(@RequestBody User user) {
        userRepository.save(user);
    }

}
