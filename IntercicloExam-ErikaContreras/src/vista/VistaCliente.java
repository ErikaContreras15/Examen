/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCliente;
import java.util.Scanner;
import modelo.Cliente;

/**
 *
 * @author Erika
 */
public class VistaCliente {
    
     private ControladorCliente controladorCliente;
    Scanner s=new Scanner(System.in);
    public VistaCliente()
    
    {
        
        controladorCliente=new ControladorCliente();
    }

    public void menu() {
        int op = 1;
        while (op > 0) {
            System.out.println("1.crear\n2.Actualizar\n3.Buscar\n4.Eliminar\n5.listar");
            op = s.nextInt();
            if (op == 1) {
                crear();
            } else if (op == 2) {
                actualizar();
            } else if (op == 3) {
                buscar();
            } else if (op == 4) {
                eliminar();
            } else if (op == 5) {
                controladorCliente.listar();
            }
        }
    }

    public void crear(){
        
    System.out.println("Ingrese el nombre");
    String nombre = s.next();
    System.out.println("Ingrese el apellido");
    String apellido = s.next();
    System.out.println ("Ingrese la cedula");
    String cedula = s.next();
    System.out.println ( "Ingrese la fiabilidad de pago");
    String fiabilidad_Pago = s.next();
      
     System.out.println ( "Resultado: " + controladorCliente.crear(nombre,apellido,cedula, fiabilidad_Pago));
    }
    
    public Cliente buscar() {
        System.out.println("Ingrese la cedula");
        String cedula = s.next();
        Cliente datocliente = controladorCliente.buscar(cedula);
        controladorCliente.setSeleccionado(datocliente);
        System.out.println(datocliente);
        return datocliente;
    }
    
        
public void actualizar(){
        Cliente datocliente = buscar();
        if(datocliente != null){
            System.out.println("Ingrese el nombre");
            String nombre = s.next();
            System.out.println("Ingrese el apellido");
            String apellido = s.next();
            System.out.println("Ingrese la cedula");
            String cedula = s.next();
            System.out.println("Ingrese la fiabilidad de pago");
            String fiabilidaddepago = s.next();
            System.out.println("Resultado: " + controladorCliente.crear(nombre,apellido,cedula, fiabilidaddepago));
            
    }
        
    }
    public void eliminar()
    {
        Cliente datocliente=buscar();
        if(datocliente!=null)
        {
            System.out.print("ingrese la cedula:");
            String cedula=s.nextLine();
            controladorCliente.eliminar(cedula);
        }
    }
}

