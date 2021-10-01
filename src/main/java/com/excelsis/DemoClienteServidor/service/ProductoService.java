package com.excelsis.DemoClienteServidor.service;

import com.excelsis.DemoClienteServidor.entity.Producto;

import java.util.List;

public interface ProductoService {


    List<Producto> mostrarProductos();

    Producto guardarProducto(Producto producto);

    Producto actualizarProducto(Producto producto);

    void eliminarProducto(Integer id);

}
