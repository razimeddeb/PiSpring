package tn.esprit.pidev.serviceIterface;

import tn.esprit.pidev.entity.CallForTender;
import tn.esprit.pidev.entity.Pack;

import java.util.List;

public interface ICallForTender {

    CallForTender addCallForTender(CallForTender CallForTender);
    List<CallForTender> retriveAllCallForTender();
    CallForTender updateCallForTender(CallForTender CallForTender);
    List<CallForTender> retriveCallForTenderById(Long idCallForTender);
    void  removeCallForTender (Long idCall);
}
