/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorProducto;
import java.util.Scanner;
import modelo.Producto;

/**
 *
 * @author Erika
 */
public class VistaProducto {
    private ControladorProducto controladorProducto;
    Scanner s=new Scanner(System.in);
    public VistaProducto()
    
    {
        
        controladorProducto=new ControladorProducto();
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
                controladorProducto.listar();
            }
        }
    }
    
     public void crear() {
        System.out.println("Ingrese la descripcion");
        String descripcion = s.next();
        System.out.println("Ingrese el precio unitario");
        double precioUnitario = s.nextDouble();
        System.out.println("Ingrese el stock");
        int stock= s.nextInt();
        System.out.println("Ingrese el IVA");
        double iva= s.nextDouble();
        System.out.println ( "Resultado: " + controladorProducto.crear(descripcion,precioUnitario,stock,iva));
      
    }

    public Producto buscar() {
        System.out.println("Ingrese la descripcion");
        String descripcion = s.next();
        Producto datoproducto = controladorProducto.buscar(descripcion);
        System.out.println(descripcion);
        return datoproducto;
    }

    public void actualizar() {
        Producto datoproducto = buscar();
        if (datoproducto != null) {
        System.out.println("Ingrese la descripcion");
        String descripcion = s.next();
        System.out.println("Ingrese el precio unitario");
        double precioUnitario= s.nextDouble();
        System.out.println("Ingrese el stock");
        int stock= s.nextInt();
        System.out.println("Ingrese el IVA");
        int iva= s.nextInt();
        System.out.println("Resultado: " + controladorProducto.crear(descripcion, precioUnitario,stock,iva));
    }
    }
   
public void eliminar() {
        Producto datoproducto=buscar();
        if(datoproducto!=null)
        {
            System.out.print("ingrese el Id:");
            String id=s.nextLine();
            controladorProducto.eliminar(id);
        }
    }
}

