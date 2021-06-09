/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Factura;

/**
 *
 * @author Erika
 */
public class ControladorFactura {
    
    private List<Factura> listaFactura;
    private Factura seleccionado;
      
    public ControladorFactura(){
        listaFactura=new ArrayList();
    }
       public int generarId(){
    return(listaFactura.size()>0)? listaFactura.get(listaFactura.size()-1).getId()+1:1;    
    }
      
       
      //Metodos CRUD
    public boolean crear( double total, Date fecha_Factura,int cantidad, double valor){
        Factura facturas = new  Factura(total,fecha_Factura,this.generarId(),cantidad, valor);
        return listaFactura.add(facturas);
    }
        
   public Factura buscar( double total ){
        for (Factura facturas : listaFactura) {
            if(facturas.getTotal()==(total)){
                seleccionado=facturas;
            }
                return facturas;
        }
        return null;
    }
    public boolean actualizar( double total,Date fecha_Factura){
        Factura facturas = this.buscar(total);
        if(facturas!= null){
            int posicion = listaFactura.indexOf(total);
           facturas.setFecha_Factura(fecha_Factura);
           listaFactura.set(posicion, facturas);
                    
            return true;
        }
        return false;
    }
    public boolean eliminar(double total){
       Factura facturas = this.buscar(total);
        if(facturas != null)
            return listaFactura.remove(facturas);
        return false;
    }

    public void setListaFactura(List<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

    public Factura getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Factura seleccionado) {
        this.seleccionado = seleccionado;
    }    
 

     public void listar()
     {
         System.out.println(listaFactura);
     }

}

