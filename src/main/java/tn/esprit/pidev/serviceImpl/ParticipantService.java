package tn.esprit.pidev.serviceImpl;

import org.hibernate.annotations.SecondaryRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.entity.Participant;
import tn.esprit.pidev.repository.PackRepository;
import tn.esprit.pidev.repository.ParticipantRepository;
import tn.esprit.pidev.serviceIterface.IParticipantService;

import java.util.List;

@Service("IParticipantService")
public class ParticipantService implements IParticipantService {
    @Autowired
    ParticipantRepository participantRepository ;
    @Override
    public Participant addParticipant(Participant participant) {
        return this.participantRepository.save(participant);
    }

    @Override
    public List<Participant> retriveParticipants() {
        return this.participantRepository.findAll();
    }

    @Override
    public Participant updateParticipant(Participant participant) {
        return this.participantRepository.save(participant);

    }

    @Override
    public Participant retriveParticipant(Long idUser) {
        return this.participantRepository.findById(idUser).get();
    }

    @Override
    public void removeParticipant(Long idUser) {
         this.participantRepository.deleteById(idUser);
    }
}
