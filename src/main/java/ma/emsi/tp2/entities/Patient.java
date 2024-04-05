package ma.emsi.tp2.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    private boolean malade;

    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(columnDefinition = "int default 0") // Ajout de la valeur par défaut
    private int score;

    // Constructeur par défaut
    public Patient() {
    }
}
