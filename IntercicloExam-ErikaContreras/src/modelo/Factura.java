/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Erika
 */
public class Factura {
    private double total;
    private Date fecha_Factura;
    private Cliente cliente;
    private int id;
  
     //Atributo de agregacion
    private List<DetalleFactura> facturas;

    //Constructor
    public Factura() {
        facturas= new ArrayList<>();
    }
    // Constructor
    public Factura(double total, Date fecha_Factura,int id,int cantidad,double valor) {
        this.total = total;
        this.fecha_Factura = fecha_Factura;
        this.id=id;
    }

    // Metodo Borrado
    public static void borrado(){
          
      }

    // Metodos Get y Set
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha_Factura() {
        return fecha_Factura;
    }

    public void setFecha_Factura(Date fecha_Factura) {
        this.fecha_Factura = fecha_Factura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Factura{" + "total=" + total + ", fecha_Factura=" + fecha_Factura + '}';
    }    
}
