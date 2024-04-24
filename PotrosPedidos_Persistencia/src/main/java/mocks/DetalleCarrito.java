/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mocks;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jl4ma
 */
public class DetalleCarrito {
    
    private Long id;
    private Carrito carrito;
    private Producto producto;
    private Integer cantidad;
    private Float total;
    private List<DetalleCarrito> detalles;

    public DetalleCarrito(Long id, Carrito carrito, Producto producto, Integer cantidad, Float total) {
        this.id = id;
        this.carrito = carrito;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
        detalles = new ArrayList<>();
    }

    public DetalleCarrito(Carrito carrito, Producto producto, Integer cantidad, Float total) {
        this.carrito = carrito;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
        detalles = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public void generarLista(){
        detalles.add(new DetalleCarrito(id, carrito, producto, cantidad, total));
        detalles.add(new DetalleCarrito(id, carrito, producto, cantidad, total));
        detalles.add(new DetalleCarrito(id, carrito, producto, cantidad, total));
        detalles.add(new DetalleCarrito(id, carrito, producto, cantidad, total));
        detalles.add(new DetalleCarrito(id, carrito, producto, cantidad, total));
        detalles.add(new DetalleCarrito(id, carrito, producto, cantidad, total));
        detalles.add(new DetalleCarrito(id, carrito, producto, cantidad, total));
        
    }
    @Override
    public String toString() {
        return "DetalleCarrito{" + "id=" + id + ", carrito=" + carrito + ", producto=" + producto + ", cantidad=" + cantidad + ", total=" + total + '}';
    }
    
    
}
