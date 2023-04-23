/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.productos;

import java.util.Map;

/**
 *
 * @author JORGE BOVEA
 */
public class Producto {
    
    private  String name;
    private  String descripcion;
    private  Double precio;

    public Producto(Map producto) {
        name = producto.get("name").toString();
        descripcion = producto.get("description").toString();
        precio = Double.valueOf(producto.get("precio").toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
                
    
}
