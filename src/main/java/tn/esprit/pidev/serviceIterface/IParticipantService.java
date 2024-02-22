package tn.esprit.pidev.serviceIterface;

import org.springframework.stereotype.Service;
import tn.esprit.pidev.entity.Pack;
import tn.esprit.pidev.entity.Participant;

import java.util.List;

@Service
public interface IParticipantService {
    Participant addParticipant(Participant participant);
    List<Participant> retriveParticipants();
    Participant updateParticipant(Participant participant);
    Participant retriveParticipant(Long idUser );
    void  removeParticipant(Long idUser);
}
