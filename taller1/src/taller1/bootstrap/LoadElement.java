/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1.bootstrap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import taller1.productos.Inventario;
import taller1.productos.Producto;

/**
 *
 * @author JORGE BOVEA
 */
public class LoadElement {
    private Inventario inventario ;
    public void LoadElements() throws FileNotFoundException{
        
        Gson gson = new Gson();
        Reader reader = new FileReader("inventory.json");
        
        List<Map> listProducto = gson.fromJson(reader, List.class);
        Map<String, Producto> productoMap = new HashMap<>();
        for(Map producto : listProducto){
            Producto productoReal = new Producto(producto);
            productoMap.put(producto.get("name").toString(), productoReal);
        }
        inventario = new Inventario(productoMap);
        
        

    }
 
    public Inventario getInventario(){
        return  inventario;
     }
}
