package com.gym.controllers;

import com.gym.models.users.Client;
import com.gym.services.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

   @GetMapping("")
    public List<Client> getClients(){
        return adminService.getAllClients();
    }

    @PostMapping("/createClient")
    @ResponseStatus(HttpStatus.CREATED)
    public Client createClient (@RequestBody Client client){
        return adminService.createClient(client);
    }
}
