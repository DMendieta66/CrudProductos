package com.excelsis.DemoClienteServidor.repository;

import com.excelsis.DemoClienteServidor.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto,Integer> {
}
