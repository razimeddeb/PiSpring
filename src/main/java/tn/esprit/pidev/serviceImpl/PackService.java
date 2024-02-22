package tn.esprit.pidev.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.entity.Pack;
import tn.esprit.pidev.repository.PackRepository;
import tn.esprit.pidev.serviceIterface.IPackService;

import java.util.List;

@Service
@AllArgsConstructor
public class PackService implements IPackService {
    PackRepository packRepository;
    @Override
    public Pack addPack(Pack pack) {
        return packRepository.save(pack);
    }

    @Override
    public List<Pack> retriveAllPacks() {
        return packRepository.findAll();
    }

    @Override
    public Pack updatePack(Pack pack) {
        return packRepository.save(pack);
    }

    @Override
    public Pack retrivePack(Long idPack) {
        return packRepository.findById(idPack).orElse(null);
    }

    @Override
    public void removePack(Long idPack) {
        packRepository.deleteById(idPack);

    }
}
