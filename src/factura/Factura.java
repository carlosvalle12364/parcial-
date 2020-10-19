/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CARLOS VALLE 200322
 */
public class Factura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<facturaencabezado> encabezadoo = new ArrayList();
        List<facturadescripcion> descripcion = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int opcion;
        int opcion1;
        do {
            System.out.println("Menu");
            System.out.println("1. Agregar ");
            System.out.println("2. Modtrsr");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los siguientes datos para registro");
                    System.out.println("Serie: ");
                    int serie = sc.nextInt();
                    System.out.println("Numero de la factura: ");
                    int numero = sc.nextInt();
                    System.out.println("Fecha: ");
                    String fecha = sc.next();
                    System.out.println("Nombre: ");
                    String nombre = sc.next();
                    System.out.println("Direccion: ");
                    String direccion = sc.next();
                    System.out.println("Ingresar Nit: ");
                    int nit = sc.nextInt();
                    encabezadoo.add(new facturaencabezado(serie, numero, fecha, nombre, direccion, nit));
                    do {
                        
                        facturaencabezado desc = new facturaencabezado();
                        
                        System.out.println("===============================================");
                        System.out.println("Cantidad de productos");
                        int cantidad = sc.nextInt();
                        System.out.println("Descripción ");
                        String descripcion1 = sc.next();
                        System.out.println("Valor del producto");
                        double valor = sc.nextDouble();
                        descripcion.add(new facturadescripcion (cantidad, descripcion1, valor));
                       
                       
                        
                        System.out.println("1. Ingresar");
                        System.out.println("2.Salir");
                        opcion1 = sc.nextInt();
                        
                        
                    } while (opcion1 != 2);
                    break;
                case 2:
                    System.out.println("Datos a mostrar son:");
                    for (facturaencabezado encabezados : encabezadoo) {
                        System.out.println("m serie\t n factura\t fecha\t nombre\t direccion\t nit");
                        System.out.println(encabezados.getSerie()+"\t" + encabezados.getNumero()+"\t" + encabezados.getFecha()+"\t" + encabezados.getNombre()+"\t" + encabezados.getDireccion()+"\t" + encabezados.getNit()+"\t");
                        
                        for (facturadescripcion descripciones : descripcion) {
                            System.out.println("cantidad\t Descripcion\t valor\t ");
                            System.out.println(descripciones.getCantidad()+"\t" + descripciones.getDescripcion()+"\t" + descripciones.getValor());
                        }
                    }
                    
                    break;
                default:
                    System.out.println("============================================");
                    System.out.println("Ingrese ina opcion valida");
                    System.out.println("============================================");
                    break;
            
        } 
        
    }while (opcion != 3);
} 
    
    
}
