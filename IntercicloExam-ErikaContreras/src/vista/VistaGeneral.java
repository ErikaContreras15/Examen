/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCliente;
import controlador.ControladorFactura;
import controlador.ControladorProducto;
import java.util.Scanner;

/**
 *
 * @author Erika
 */
public class VistaGeneral {
    
    VistaCliente vistaCliente = new VistaCliente( );
    VistaProducto vistaProducto = new VistaProducto();
    VistaFactura vistaFactura=new VistaFactura();
    
    private Scanner s;
    private ControladorCliente controladorCliente;
    private ControladorProducto controladorProducto;
    private ControladorFactura controladorFactura;
 
    
    public VistaGeneral(){
        s= new Scanner(System.in);
        controladorCliente=new ControladorCliente();
        controladorProducto=new ControladorProducto();
        controladorFactura=new ControladorFactura();
       
    }
    public void menu()
    {
        int op=1;
        while(op>0)
        {
            System.out.println("*******   Sistema de Facturación  ****** ");
        System.out.println("\n1.Ingrese el CLIENTE \n2.ingrese el PRODUCTO \n3.ingrese la FACTURA \n0 Salir");
            op=s.nextInt();
            if(op==1)
                vistaCliente.menu();
            else if(op==2)
                vistaProducto.menu();
            else if (op==3)
                vistaFactura.menu();
        }
    }
    
}
     
   



