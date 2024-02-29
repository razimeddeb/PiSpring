package tn.esprit.pidev.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.entity.CallForTender;
import tn.esprit.pidev.repository.CallForTenderRepository;
import tn.esprit.pidev.serviceIterface.ICallForTender;

import java.util.Collections;
import java.util.List;


@Service
public class CallForTenderService  implements ICallForTender {

    @Autowired
    CallForTenderRepository callForTenderRepository ;
    @Override
    public CallForTender addCallForTender(CallForTender CallForTender) {
        return callForTenderRepository.save(CallForTender);
    }

    @Override
    public List<CallForTender> retriveAllCallForTender() {
        return callForTenderRepository.findAll();
    }

    @Override
    public CallForTender updateCallForTender(CallForTender CallForTender) {
        return callForTenderRepository.save(CallForTender);
    }

    @Override
    public List<CallForTender> retriveCallForTenderById(Long idCallForTender) {
        return callForTenderRepository.findAllById(Collections.singleton(idCallForTender));
    }

    @Override
    public void removeCallForTender(Long idCall) {
      callForTenderRepository.deleteById(idCall);
    }
}
