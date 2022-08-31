package com.Andres_Carnes.AndresC.Services;

import com.Andres_Carnes.AndresC.Entities.Empresa;

import java.util.Date;
import java.util.*;

public class EmpresaService {

    Empresa empresa1;
    Empresa empresa2;
     List<Empresa> empresaList;

     //constructor EmpresaService
    public EmpresaService() {

        this.empresa1 = new Empresa(1, "AndresCarnes", "0000", "12345", "calle 40", new Date(), new Date(),null);
        this.empresa2 = new Empresa(1, "AndresCarnes2", "0000", "12345", "calle 40", new Date(), new Date(),null);

        empresaList = new ArrayList<>();
        empresaList.add(empresa1);
        empresaList.add(empresa2);

    }


    public List<Empresa> getEmpresaList() {
        return empresaList;
    }
}
