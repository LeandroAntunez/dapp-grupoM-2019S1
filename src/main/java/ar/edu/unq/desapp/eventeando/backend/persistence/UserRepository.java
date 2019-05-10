package ar.edu.unq.desapp.eventeando.backend.persistence;

import ar.edu.unq.desapp.eventeando.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// A generic DAO (Data Access Object)
public interface UserRepository extends JpaRepository<User, Long> {
}
