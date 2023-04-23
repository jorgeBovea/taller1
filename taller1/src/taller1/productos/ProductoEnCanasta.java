/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.productos;

/**
 *
 * @author JORGE BOVEA
 */
public class ProductoEnCanasta {
    
    private Producto producto;
    private Integer cantidad;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantaidad() {
        return cantidad;
    }

    public void setCantaidad(int cantaidad) {
        this.cantidad = cantaidad;
    }
    
    public double total(){
       return (producto.getPrecio() * cantidad);
    }
    
    
}
