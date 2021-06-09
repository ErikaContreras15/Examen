/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author Erika
 */
public class ControladorProducto {
    private List<Producto> listaDatoProducto;
    private Producto seleccionado;
    
    
    public int generarId(){
    return(listaDatoProducto.size()>0)? listaDatoProducto.get(listaDatoProducto.size()-1).getId()+1:1;    
    }
    
    public ControladorProducto(){
        listaDatoProducto=new ArrayList();
    }
    
    //Metodos CRUD
    public boolean crear( String descripcion, double precioUnitario, int stock, double iva){
        Producto datosproductos = new Producto(this.generarId(),descripcion,precioUnitario,stock,iva);
        return listaDatoProducto.add(datosproductos);
    }
   public Producto buscar( String descripcion){
        for (Producto datosproductos : listaDatoProducto) {
            if(datosproductos.getDescripcion().equals(descripcion))
                return datosproductos;
        }
        return null;
    }
    public boolean actualizar( String descripcion, double precioUnitario, int stock, double iva){
        Producto datosproductos = this.buscar(descripcion);
        if(datosproductos!= null){
            int posicion = listaDatoProducto.indexOf(datosproductos);
            datosproductos.setDescripcion(descripcion);
            datosproductos.setPrecioUnitario(precioUnitario);
            datosproductos.setStock(stock);
            datosproductos.setIva(iva);
            listaDatoProducto.set(posicion, datosproductos);
            return true;
        }
        return false;
    }
    public boolean eliminar(String id){
       Producto datosproductos = this.buscar(id);
        if(datosproductos != null)
            return listaDatoProducto.remove(datosproductos);
        return false;
    }

    public List<Producto> getListaDatosProductos() {
        return listaDatoProducto;
    }

    public void setListaDatoProducto(List<Producto> listaDatoProducto) {
        this.listaDatoProducto = listaDatoProducto;
    }

    public Producto getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Producto seleccionado) {
        this.seleccionado = seleccionado;
    }    
 

     public void listar()
     {
        for(int i=0;i<listaDatoProducto.size();i++)
        {
            System.out.println("Factura"+i+listaDatoProducto.get(i));
        }
         
     }
    
}
