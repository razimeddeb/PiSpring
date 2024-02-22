package tn.esprit.pidev.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pidev.entity.Pack;
import tn.esprit.pidev.entity.Participant;
import tn.esprit.pidev.serviceIterface.IPackService;
import tn.esprit.pidev.serviceIterface.IParticipantService;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("participant")
public class ParticipantController {

    @Qualifier("IParticipantService")
    @Autowired
  IParticipantService iParticipantService;

        @PostMapping("/addParticipant")
        public Participant addParticipant(@RequestBody Participant participant) {
            return iParticipantService.addParticipant(participant);
        }
        @GetMapping("/getAllParticipant")
        public List<Participant> retriveParticipants() {
            return iParticipantService.retriveParticipants();
        }
        @PutMapping("/UpdateParticipant")
        public Participant updateParticipant(@RequestBody Participant participant) {
            return iParticipantService.updateParticipant(participant);
        }
        @GetMapping("/retriveParticipant/{id_User}")
        public Participant retriveParticipant(@PathVariable("id_User") Long idUser) {
            return iParticipantService.retriveParticipant(idUser);
        }
        @DeleteMapping("/removeParticipant/{id_User}")
        public void removePack(@PathVariable("id_Pack") Long idUser) {
            iParticipantService.removeParticipant(idUser);
        }

    }
