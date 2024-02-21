package tn.esprit.pidev.serviceIterface;

import tn.esprit.pidev.entity.Pack;

import java.util.List;

public interface IPackService {
    Pack addPack(Pack pack);
    List<Pack> retrivePacks();
    Pack updatePack(Pack pack);
    Pack retrivePack(Long idPack);
    void  removePack (Long idPack);

}
