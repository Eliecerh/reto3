package com.grupoG32.reto3.controller;

import com.grupoG32.reto3.dbo.MessageDbo;
import com.grupoG32.reto3.model.AdminModel;
import com.grupoG32.reto3.model.MessageModel;
import com.grupoG32.reto3.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Message")
public class MessageController {

    //@Autowired
    //AdminService adminService;
    @GetMapping("/all")
    public List<MessageModel> obtenerMensajes(){
        //return adminService.obtenerAdministradores();
        return null;
    }
    @PostMapping("/save")
    public String crearMensajes(@RequestBody MessageDbo mensaje){
        //return adminService.crearAdministradores(adminModel);
        return null;
    }
}
