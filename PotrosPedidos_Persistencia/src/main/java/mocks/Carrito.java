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
public class Carrito {

    Long id;
    Integer cantidad;
    Float costoFinal;
    Usuario usuario;
    List<Carrito> carrito;

    public Carrito(Long id, Integer cantidad, Float costoFinal, Usuario usuario) {
        this.id = id;
        this.cantidad = cantidad;
        this.costoFinal = costoFinal;
        this.usuario = usuario;
        carrito = new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Carrito() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(Float costoFinal) {
        this.costoFinal = costoFinal;
    }

    public void generarLista() {
        carrito.add(new Carrito(id, cantidad, costoFinal, usuario));
        carrito.add(new Carrito(id, cantidad, costoFinal, usuario));
        carrito.add(new Carrito(id, cantidad, costoFinal, usuario));
        carrito.add(new Carrito(id, cantidad, costoFinal, usuario));
        carrito.add(new Carrito(id, cantidad, costoFinal, usuario));
        carrito.add(new Carrito(id, cantidad, costoFinal, usuario));
        carrito.add(new Carrito(id, cantidad, costoFinal, usuario));

    }

    public List<Carrito> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Carrito> carrito) {
        this.carrito = carrito;
    }
}
