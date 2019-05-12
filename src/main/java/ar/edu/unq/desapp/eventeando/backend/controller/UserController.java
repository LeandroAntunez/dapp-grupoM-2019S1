package ar.edu.unq.desapp.eventeando.backend.controller;

import ar.edu.unq.desapp.eventeando.backend.model.User;
import ar.edu.unq.desapp.eventeando.backend.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends AbstractController<User> {

    public UserController(UserRepository repo) {
        super(repo);
    }
}
