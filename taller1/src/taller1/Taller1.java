/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

import java.io.FileNotFoundException;
import java.util.Scanner;
import taller1.bootstrap.LoadElement;
import taller1.clientes.Cliente;
import taller1.productos.Canasta;
import taller1.productos.Inventario;

/**
 *
 * @author JORGE BOVEA
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        LoadElement loadElement = new LoadElement();
        loadElement.LoadElements();
        Inventario inventario = loadElement.getInventario();
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente");
        String nombre = scanner.nextLine();
        Canasta canasta = new Canasta(cliente);
        Tienda tienda = new Tienda(canasta,cliente,inventario);

        cliente.setName(nombre);
        
        System.out.println("Hola "+cliente.getName()+ " bienvenido a la tienda");
        boolean open = true;
        System.out.println("Elija una opción");
        while(open){
            System.out.println("1) agregar producto");
            System.out.println("0) salir");
            
            int option = Integer.valueOf(scanner.nextLine());
            System.out.println(" ");
            System.out.println(" -----------------------------------------------------------------------------");
            System.out.println(" ");
            switch (option) {
                case 1:
                    tienda.comprando();
                     System.out.println("total comprado: $"+canasta.total());
                    break;
                case 0:
                    open =false;
                    tienda.resumen();
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida");

            }
        }

    }
    
}
