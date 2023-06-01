package com.grupoG32.reto3.controller;

import com.grupoG32.reto3.dbo.ScoreDbo;
import com.grupoG32.reto3.model.AdminModel;
import com.grupoG32.reto3.model.ScoreModel;
import com.grupoG32.reto3.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Score")
public class ScoreController {

    //@Autowired
    //AdminService adminService;
    @GetMapping("/all")
    public List<ScoreModel> obtenerPuntajes(){
        //return adminService.obtenerAdministradores();
        return null;
    }
    @PostMapping("/save")
    public String crearPuntajes(@RequestBody ScoreDbo score){
        //return adminService.crearAdministradores(adminModel);
        return null;
    }
}
