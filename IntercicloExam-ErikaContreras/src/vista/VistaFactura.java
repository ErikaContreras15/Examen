/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorFactura;
import java.util.Scanner;
import modelo.Factura;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author Erika
 */
public class VistaFactura {
    DateFormat formatoFecha=new SimpleDateFormat("dd/mm/yyyy");
     private ControladorFactura controladorFactura;
    Scanner s=new Scanner(System.in);
    public VistaFactura()
    
    {
        
        controladorFactura=new ControladorFactura();
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
                controladorFactura.listar();
            }
        }
    }
    
     public void crear() {
        try {
            System.out.println("Ingrese el total");
            double total= s.nextInt();
            System.out.println("Ingrese la fecha (\"dd/mm/yyyy\"):");
            String fecha_Factura = s.next();
            System.out.println("Ingrese la cantidad");
            int cantidad= s.nextInt();
            System.out.println("Ingrese el valor");
            double valor = s.nextInt();
            System.out.println ( "Resultado: " + controladorFactura.crear(total,formatoFecha.parse(fecha_Factura),cantidad,valor));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Factura buscar() {
        System.out.println("Ingrese el total");
        double total = s.nextInt();
        Factura factura = controladorFactura.buscar(total);
        System.out.println(total);
        return factura;
    }

    public void actualizar(){
        try {
            System.out.println("Ingrese el total");
            double total= s.nextInt();
            System.out.println("Ingrese la fecha (\"dd/mm/yyyy\"):");
            String fecha_Factura = s.next();
            System.out.println("Ingrese la cantidad");
            int cantidad= s.nextInt();
            System.out.println("Ingrese el valor");
            double valor = s.nextInt();
            System.out.println ( "Resultado: " + controladorFactura.crear(total,formatoFecha.parse(fecha_Factura),cantidad,valor));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    } 
            
     public void eliminar()
    {
        Factura factura=buscar();
        if(factura!=null)
        {
            System.out.print("ingrese el id ");
            int id=s.nextInt();
            controladorFactura.eliminar(id);
        }
    }

}
