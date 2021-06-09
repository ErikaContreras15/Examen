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
public class DetalleFactura {
    private int cantidad;
    private double valor;
     private Producto producto;
  
    //Metodos Getters y Setters
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    
    @Override
    public String toString() {
        return "DetalleFactura{" + "cantidad=" + cantidad + ", valor=" + valor + ", producto=" + producto + '}';
    }
}
