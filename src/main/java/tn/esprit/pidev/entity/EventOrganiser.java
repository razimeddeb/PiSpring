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
public class EventOrganiser extends User{

    Long serialNumberE;
    @ManyToMany(cascade = CascadeType.ALL)
    List<CallForTender>callForTenders;

}
