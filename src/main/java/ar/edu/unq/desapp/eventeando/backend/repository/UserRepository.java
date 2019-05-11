package ar.edu.unq.desapp.eventeando.backend.repository;

import ar.edu.unq.desapp.eventeando.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}