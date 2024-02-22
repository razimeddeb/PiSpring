package tn.esprit.pidev.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pack implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPack;
    @Enumerated(EnumType.STRING)
    TypePack typePack;
    String dsecription;
    Long price;
    String salle;
    @JsonIgnore
    @ManyToOne
    Evenement evenement;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="pack")
    List<Client>clients;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "pack")
    List<Booth>booths;



}
