package tn.esprit.pidev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pidev.entity.CallForTender;
import tn.esprit.pidev.serviceIterface.ICallForTender;

import java.util.List;

@RestController
@RequestMapping("/callfortenders")
public class CallForTenderController {

    private final ICallForTender callForTenderService;

    @Autowired
    public CallForTenderController(ICallForTender callForTenderService) {
        this.callForTenderService = callForTenderService;
    }

    @PostMapping("add-a-call")
    public CallForTender addCallForTender(@RequestBody CallForTender callForTender) {
        return callForTenderService.addCallForTender(callForTender);

    }

    @GetMapping("list-all-calls")
    public List<CallForTender> getAllCallForTenders() {
        return  callForTenderService.retriveAllCallForTender();

    }

    @GetMapping("/{id}")
    public List<CallForTender>getCallForTenderById(@PathVariable("id") Long id) {
        List<CallForTender> callForTender = callForTenderService.retriveCallForTenderById(id);
        if (callForTender.isEmpty()) {
            return null ;
        }
        return callForTender ;
    }

    @PutMapping("/{id}")
    public ResponseEntity<CallForTender> updateCallForTender(@PathVariable("id") Long id,
                                                             @RequestBody CallForTender callForTender) {
        List<CallForTender> existingCallForTender = callForTenderService.retriveCallForTenderById(id);
        if (existingCallForTender.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        callForTender.setIdCOT(id);
        CallForTender updatedCallForTender = callForTenderService.updateCallForTender(callForTender);
        return new ResponseEntity<>(updatedCallForTender, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCallForTender(@PathVariable("id") Long id) {
        List<CallForTender> existingCallForTender = callForTenderService.retriveCallForTenderById(id);
        if (existingCallForTender.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        callForTenderService.removeCallForTender(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}