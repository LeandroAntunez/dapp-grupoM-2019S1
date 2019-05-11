package ar.edu.unq.desapp.eventeando.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor // (Lomblok) automatically creates a class construtor with all arguments (properties).
@NoArgsConstructor // (Lomblok) automatically creates an empty class construtor with all arguments (properties).
@Entity
@Table(name = "users")
@Data // (Lomblok) creates toString, equals, hashCode, getters and setters.
public class User {

    // FIELDS

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 2, message = "First Name should have at least 2 characters")
    private String name;

    @NotNull
    @Size(min = 2, message = "Surname should have at least 2 characters")
    private String surname;

    @Email
    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    private LocalDate birthdate;

    @NotNull
    private BigDecimal currentBalance;

    // METHODS

    void depositMoneyWithCash(BigDecimal anAmount) {
        this.setCurrentBalance(this.getCurrentBalance().add(anAmount));
    }

    void depositMoneyWithCreditCard(BigDecimal anAmount) {
        this.setCurrentBalance(this.getCurrentBalance().add(anAmount));
    }
}