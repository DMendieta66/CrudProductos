package com.excelsis.DemoClienteServidor.controller;

import com.excelsis.DemoClienteServidor.entity.Producto;
import com.excelsis.DemoClienteServidor.service.ProductoService;
import com.excelsis.DemoClienteServidor.utils.CommonsUtils;
import org.primefaces.PrimeFaces;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class ProductoController {


    /**Lista para mostrar Productos **/
    private List<Producto> listaProductos;

    /**Objeto para guardar,modificar y eliminar Productos**/
    private Producto producto;
    /**
     * Objeto de logica de negocio para los servicios de Productos.
     */
    @ManagedProperty("#{productoServiceImpl}")
    private ProductoService productoServiceImpl;
    /**
     * Metodo que permite inicializar los componentes de la pantalla.
     */
    @PostConstruct
    public void init() {
        this.inicializarProductos();
        this.consultar();
    }

    public void inicializarProductos() {
        this.producto= new Producto();
    }

    public void consultar() {
        this.listaProductos=this.productoServiceImpl.mostrarProductos();
    }
    public void guardar() {
        if (this.producto.getIdProducto()==null){

            Producto guardar = productoServiceImpl.guardarProducto(producto);

            PrimeFaces.current().executeScript("PF('dlgProducto').hide()");

            this.consultar();

            CommonsUtils.mostrarMensaje(FacesMessage.SEVERITY_INFO, "¡Éxito!",
                    "Producto " + guardar.getNombreProducto() + " guardado exitósamente");

            this.inicializarProductos();
        }else{
            Producto modificar = productoServiceImpl.actualizarProducto(producto);

            PrimeFaces.current().executeScript("PF('dlgProducto').hide()");

            this.consultar();

            CommonsUtils.mostrarMensaje(FacesMessage.SEVERITY_INFO, "¡Éxito!",
                    "Producto " + modificar.getNombreProducto() + " modificado exitósamente");
        }
    }
}
