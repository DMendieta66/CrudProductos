package com.excelsis.DemoClienteServidor.service;

import com.excelsis.DemoClienteServidor.entity.Producto;

import java.util.List;

public interface ProductoService {

    /**Metodo que se utiliza para mostrar todos los productos en pantalla**/
    List<Producto> mostrarProductos();
    /**Metodo que se utiliza para registrar los productos en la base de datos**/
    Producto guardarProducto(Producto producto);
    /**Metodo que se utiliza para modificar/update un registro de producto en la base de datos**/
    Producto actualizarProducto(Producto producto);
    /**Metodo que se utiliza para eliminar un registro de la base de datos**/
    void eliminarProducto(Integer id);

}
