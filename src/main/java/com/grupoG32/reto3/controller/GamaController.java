package com.grupoG32.reto3.controller;

import com.grupoG32.reto3.dbo.GamaDbo;
import com.grupoG32.reto3.model.AdminModel;
import com.grupoG32.reto3.model.GamaModel;
import com.grupoG32.reto3.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Gama")
public class GamaController {

    //@Autowired
    //AdminService adminService;
    @GetMapping("/all")
    public List<GamaModel> obtenerGamas(){

        //return adminService.obtenerAdministradores();
        return null;
    }
    @PostMapping("/save")
    public String crearGamas(@RequestBody GamaDbo gama){
        //return adminService.crearAdministradores(adminModel);
        return null;
    }
}
