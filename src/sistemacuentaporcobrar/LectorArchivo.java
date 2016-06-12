package sistemacuentaporcobrar;


import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hshome
 */
public class LectorArchivo {
    
    //Lector de Archivo
    private Scanner lector;   
    
    //Creacion de la Lista de Cliente
    //Lista es Lista Simple
    public ListaSimple<Cliente> listaSimple = new ListaSimple();
    
    //Creacion de la Lista de Factura
    //Lista es Lista Factura
    public ListaSimple<Factura> listaFactura = new ListaSimple();
    
    
    //Leer archivo Cliente.txt
    public void leerArchivoCliente(){     
        try {
            // Lecto de Archivo
            lector = new Scanner(new File("c:\\Cliente.txt"));
            //Verificar si hay linea por leer
            while(lector.hasNext()){
                int idCliente = lector.nextInt();
                String primerNombre = lector.next();
                String segundoNombre = lector.next();
                String primerApellido = lector.next();
                String segundoApellido = lector.next();
                String cedula = lector.next();
                String nombreCobrador = lector.next();
                String apellidoCobrador = lector.next();
                String cedulaCobrador = lector.next();
                String direccion = lector.next();
                
                Cobrador cobrador = new Cobrador(nombreCobrador, apellidoCobrador, cedulaCobrador, direccion);
                Cliente cliente = new Cliente(idCliente, primerNombre, segundoNombre, primerApellido, segundoApellido, cedula, cobrador);
                
                listaSimple.AñadirElementoPrincipio(cliente);
            }
                
        } catch (Exception error) {
            System.out.println(error);
        }
    } // Fin de Metodo leerArchviCliente
    
    
    //Leer archivo Factura.txt
    public void leerArchivoFactura(){     
        try {
            // Lecto de Archivo
            lector = new Scanner(new File("c:\\Factura.txt"));
            //Verificar si hay linea por leer
            while(lector.hasNext()){
                int idFactura = lector.nextInt();
                int idCliente = lector.nextInt();
                float monto = lector.nextFloat();
                String fechaEmision = lector.next();
                
                Factura factura = new Factura(idFactura, idCliente, fechaEmision, monto);
                
                listaFactura.AñadirElementoPrincipio(factura);
            }
                
        } catch (Exception error) {
            System.out.println(error);
        }
    } // Fin de Metodo leerArchivoFactura
    
}


