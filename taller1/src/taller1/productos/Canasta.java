/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.productos;

import java.util.ArrayList;
import taller1.clientes.Cliente;

/**
 *
 * @author JORGE BOVEA
 */
public class Canasta {
    private ArrayList<ProductoEnCanasta> canasta;
    private Cliente cliente;

    public Canasta( Cliente cliente) {
        this.canasta = new ArrayList<>();
        this.cliente = cliente;
    }

    public ArrayList<ProductoEnCanasta> getCanasta() {
        return canasta;
    }

    
    
    
    public void addProductos(ProductoEnCanasta producto){
        canasta.add(producto);
    }
    
    public double total(){
        double total = 0;
        for(ProductoEnCanasta producto : canasta){
         total =total + producto.total();
        } 
        return total;
    }
}
