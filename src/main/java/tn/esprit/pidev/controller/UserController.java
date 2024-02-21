package tn.esprit.pidev.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.pidev.entity.Admin;
import tn.esprit.pidev.entity.User;
import tn.esprit.pidev.serviceIterface.IAdminService;
import tn.esprit.pidev.serviceIterface.IUserService;

@AllArgsConstructor
@RestController
@RequestMapping("user")
public class UserController {
    IUserService iUserService;
    IAdminService iAdminService;
    @PostMapping("/addAdmin")
    public Admin addAdmin(@RequestBody Admin admin) {
        return iAdminService.addAdmin(admin);
    }


    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return iUserService.addUser(user);
    }



}
