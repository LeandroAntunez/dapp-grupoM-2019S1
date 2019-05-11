package ar.edu.unq.desapp.eventeando.backend;

import ar.edu.unq.desapp.eventeando.backend.model.User;
import ar.edu.unq.desapp.eventeando.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class EventeandoApplication implements CommandLineRunner {

    private final
    UserRepository userRepository;

    @Autowired
    public EventeandoApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(EventeandoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        userRepository.save(new User(1L, "Albert", "Wesker", "albert.wesker@gmail.com", LocalDate.of(1978,5,6), new BigDecimal(("00.00"))));
    }

}