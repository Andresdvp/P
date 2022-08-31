package com.Andres_Carnes.AndresC.controllers;

import com.Andres_Carnes.AndresC.Entities.Empresa;
import com.Andres_Carnes.AndresC.Services.EmpresaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class Empresacontroller {
    EmpresaService service;

    public Empresacontroller() {
    this.service=new EmpresaService();
    }

    @GetMapping("/Empresa")
    public List<Empresa> empresaLis(){
        return this.service.getEmpresaList();
    }
}