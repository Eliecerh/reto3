package com.grupoG32.reto3.controller;

import com.grupoG32.reto3.dbo.ReservationDbo;
import com.grupoG32.reto3.model.AdminModel;
import com.grupoG32.reto3.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Reservation")
public class ReservationController {

    //@Autowired
    //AdminService adminService;
    @GetMapping("/all")
    public List<AdminModel> obtenerReservas(){
        //return adminService.obtenerAdministradores();
        return null;
    }
    @PostMapping("/save")
    public String crearReservas(@RequestBody ReservationDbo reservation){
        //return adminService.crearAdministradores(adminModel);
        return null;
    }
}
