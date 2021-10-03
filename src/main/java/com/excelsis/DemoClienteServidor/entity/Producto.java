package com.excelsis.DemoClienteServidor.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idProducto;
    @Column(name = "nombre")
    private String nombreProducto;
    @Column(name = "detalle")
    private String detalleProducto;
    @Column(name = "cantidad")
    private Integer cantidadProducto;
    @Column(name = "precio")
    private Integer precioProducto;


}
