/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Erika
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    private String fiabilidad_Pago;
    private int id;
    
   
    //Constructor con todos los atributos
    public Cliente(String nombre, String apellido, String cedula, String fiabilidad_Pago, int id) {   
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fiabilidad_Pago = fiabilidad_Pago;
        this.id = id;
    }

    //Métodos Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFiabilidad_Pago() {
        return fiabilidad_Pago;
    }

    public void setFiabilidad_Pago(String fiabilidad_Pago) {
        this.fiabilidad_Pago = fiabilidad_Pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", fiabilidad_Pago=" + fiabilidad_Pago + ", id=" + id + '}';
    }
    
   
}
