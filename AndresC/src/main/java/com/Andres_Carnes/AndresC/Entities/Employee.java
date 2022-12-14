package com.Andres_Carnes.AndresC.Entities;

import java.util.Date;

public class Employee {
    //atributos de la clase Employee id,email,updatedAt,createdAt
    private long id;

    private String name;
    private String email;
    private Date updatedAt;
    private Date createdAt;

    //Instancia de la clase Movimiento para la relacion
    private Movimiento transaccion ;

    //constructor Employee
    public Employee(long id,String name, String email, Date updatedAt, Date createdAt,Movimiento Tansaccion ) {
        this.id = id;
        this.name=name;
        this.email = email;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;

        this.transaccion = transaccion;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    //Geter y Seter de Movimiento = transaccion
    public Movimiento getTransaccion() {return transaccion;}
    public void setTransaccion(Movimiento transaccion) {this.transaccion = transaccion;}

    /*
    //metodos
    //crear empleado
    public void createEmployee(long id,String name, String email, Date updatedAt, Date createdAt) {
        this.id = id;
        this.name=name;
        this.email = email;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    //modificar empleado
    public void updateEmployee(long id,String name, String email, Date updatedAt, Date createdAt) {
        this.id = id;
        this.name=name;
        this.email = email;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

*/
}