package tn.esprit.pidev.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Participant extends User{
    LocalDate birth_date;
    @Enumerated(EnumType.STRING)
    ParticipantType type;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="participant")
    List<Interview> interviews;



}
