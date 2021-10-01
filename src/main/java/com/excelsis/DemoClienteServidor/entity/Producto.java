package com.excelsis.DemoClienteServidor.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",length = 10)
    private Integer idProducto;
    @Column(name = "nombre",length = 40)
    private String nombreProducto;
    @Column(name = "detalle",length = 100)
    private String detalleProducto;
    @Column(name = "cantidad",length = 4)
    private Integer cantidadProducto;
    @Column(name = "precio",length = 10)
    private Integer precioProducto;


}
