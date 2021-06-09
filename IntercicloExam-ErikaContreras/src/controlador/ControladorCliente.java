/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Erika
 */
public class ControladorCliente {
    private List<Cliente> listaDatosCliente;
    private Cliente seleccionado;
   
    
     public ControladorCliente(){
        listaDatosCliente=new ArrayList();
    }
    public int generarId(){
    return(listaDatosCliente.size()>0)? listaDatosCliente.get(listaDatosCliente.size()-1).getId()+1:1;    
    }
    
    //Metodos CRUD
    /*public boolean crear(String nombre,String cedula, String fiabilidad_Pago){
        Cliente cliente = new  Cliente(nombre, cedula, cedula, fiabilidad_Pago, this.generarId());
        return listaDatosCliente.add(cliente);
    }*/
    
    public boolean crear(String nombre, String apellido, String cedula, String fiabilidad_Pago) {
        Cliente cliente =new Cliente (nombre,apellido,cedula,fiabilidad_Pago,generarId());
        return listaDatosCliente.add(cliente);
    }
       
 
    
    public Cliente buscar(String cedula){
        for (Cliente cliente : listaDatosCliente) {
            if(cliente.getCedula().equals(cedula))
                return cliente; 
        }
        return null;
    }
    public boolean actualizar(String nombre, String  fiabilidad_Pago,String cedula){
        Cliente datoscliente = this.buscar(cedula);
        if(datoscliente != null){
            int posicion = listaDatosCliente.indexOf(datoscliente);
            datoscliente.setNombre(nombre);
            datoscliente.setFiabilidad_Pago(fiabilidad_Pago);
            datoscliente.setCedula(cedula);
            listaDatosCliente.set(posicion, datoscliente);
            return true;
        }
        return false;
    }
    public boolean eliminar(String cedula){
       Cliente datoscliente = this.buscar(cedula);
        if(datoscliente != null)
            return listaDatosCliente.remove(datoscliente);
        return false;
    }

     public List<Cliente> getListaDatoCliente() {
        return listaDatosCliente;
    }

    public void setListaDatoCliente(List<Cliente> listaDatoCliente) {
        this.listaDatosCliente = listaDatosCliente;
    }

    public Cliente getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Cliente seleccionado) {
        this.seleccionado = seleccionado;
    }
     public void listar()
     {
        for(int i=0;i<listaDatosCliente.size();i++)
        {
            System.out.println("Factura"+i+listaDatosCliente.get(i));
        }
         
     }
}

   