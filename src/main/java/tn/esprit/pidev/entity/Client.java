package tn.esprit.pidev.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client extends  User{
    Long serialNumberC;
    String lienSite;
    @Enumerated(EnumType.STRING)
    ClientType clientType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="client")
    List<Offer> offers;
    @ManyToMany(cascade = CascadeType.ALL)
    List<Evenement>evenements;
    @ManyToOne
    Pack pack;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="clienti")
    List<Interview>interviews;
}
