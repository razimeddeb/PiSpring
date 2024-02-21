package tn.esprit.pidev.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pidev.entity.Admin;
import tn.esprit.pidev.repository.AdminRepository;
import tn.esprit.pidev.serviceIterface.IAdminService;
@Service
@AllArgsConstructor
public class AdminService implements IAdminService {
    AdminRepository adminRepository;
    @Override
    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}
