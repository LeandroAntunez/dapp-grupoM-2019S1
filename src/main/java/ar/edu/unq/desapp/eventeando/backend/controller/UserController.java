package ar.edu.unq.desapp.eventeando.backend.controller;

import ar.edu.unq.desapp.eventeando.backend.model.User;
import ar.edu.unq.desapp.eventeando.backend.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping({"/api/v1"})
public class UserController {

    private final UserRepository repository;

    UserController(UserRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List findAll(){
        return repository.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<User> findById(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public User create(@Valid @RequestBody User user){
        return repository.save(user);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<User> update(@PathVariable("id") long id,
                                          @RequestBody User user){
        return repository.findById(id)
                .map(record -> {
                    record.setName(user.getName());
                    record.setSurname(user.getSurname());
                    record.setEmail(user.getEmail());
                    record.setBirthdate(user.getBirthdate());
                    User updated = repository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

}
