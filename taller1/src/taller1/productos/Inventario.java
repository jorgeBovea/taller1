/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.productos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JORGE BOVEA
 */
public class Inventario {
 private   Map<String,Producto> productos;

    public Inventario(Map<String,Producto> productos) {
        this.productos = productos;
    }
    
    
    public Producto getProdcut(String name){
        return productos.get(name);
    }
   
    public List<Producto> listDeProductos(){
      
       return  new ArrayList<>(productos.values());
    }
}
