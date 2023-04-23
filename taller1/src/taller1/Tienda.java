/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

import java.util.Scanner;
import taller1.clientes.Cliente;
import taller1.productos.Canasta;
import taller1.productos.Inventario;
import taller1.productos.Producto;
import taller1.productos.ProductoEnCanasta;

/**
 *
 * @author JORGE BOVEA
 */
public class Tienda {
   private Canasta canasta ;
   private Cliente cliente;
   private Inventario inventario;

    public Tienda(Canasta canasta, Cliente cliente, Inventario inventario) {
        this.canasta = canasta;
        this.cliente = cliente;
        this.inventario = inventario;
    }
   
   public void comprando( ){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Lista de productos");
       int count = 0;
       
       for(Producto producto : inventario.listDeProductos()){
           System.out.println( count+")"+ producto.getName()+" - "+"$"+ producto.getPrecio());
           count++;
       }
        System.out.println("Escojer un producto");
       
        System.out.println(" ");
        System.out.println(" -----------------------------------------------------------------------------");
        System.out.println(" ");
       Integer prodcuInt =Integer.valueOf(scanner.next().toString());
       if(prodcuInt > count || prodcuInt < 0){  
           System.out.println("Codigo de producto invalido") ;
               return;}
       Producto productoEs = inventario.listDeProductos().get(prodcuInt);
       
       System.out.println("producto escogido: "+ productoEs.getName());
       System.out.println("descripción: "+ productoEs.getDescripcion());
       System.out.println("precio: $"+ productoEs.getPrecio());
       
       
        System.out.println(" ");
        System.out.println(" -----------------------------------------------------------------------------");
        System.out.println(" ");
       System.out.println("Cuantas unidades quieres");
       Integer cantidad = Integer.valueOf(scanner.next().toString());

       ProductoEnCanasta productoEnCanasta = new ProductoEnCanasta();
       productoEnCanasta.setCantaidad(cantidad);
       productoEnCanasta.setProducto(productoEs);
       canasta.addProductos(productoEnCanasta);
       
   }
   
   
   public void  resumen(){
        System.out.println("Producto | Cantidad | precio unitario | precio total");
       for(ProductoEnCanasta producto : canasta.getCanasta()){
            System.out.println(producto.getProducto().getName()+" | "+ producto.getCantaidad()+" | $"+ producto.getProducto().getPrecio()+" | $"+ producto.total());
       }
       System.out.println("Total: $"+canasta.total());
   }
}
