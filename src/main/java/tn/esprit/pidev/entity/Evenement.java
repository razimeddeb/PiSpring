package tn.esprit.pidev.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Evenement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEvenement;
    String nom;
    LocalDate dateEvenement;
    String description;
    @ManyToOne
    Admin admin;
    @ManyToMany(mappedBy="evenements", cascade = CascadeType.ALL)
    List<Client>clients;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="evenement")
    List<Pack>packs;
}
