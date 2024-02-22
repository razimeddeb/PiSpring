package tn.esprit.pidev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pidev.entity.Participant;
@Repository
public interface ParticipantRepository extends JpaRepository<Participant  , Long> {
}
