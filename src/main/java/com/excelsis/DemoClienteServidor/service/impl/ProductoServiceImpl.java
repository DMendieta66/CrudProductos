package com.excelsis.DemoClienteServidor.service.impl;

import com.excelsis.DemoClienteServidor.entity.Producto;
import com.excelsis.DemoClienteServidor.repository.ProductoRepository;
import com.excelsis.DemoClienteServidor.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> mostrarProductos() {

        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Integer id) {
        this.productoRepository.deleteById(id);
    }
}
