/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import IDAOs.ICarritoDAO;
import excepciones.ExcepcionAT;
import mocks.Carrito;



/**
 *
 * @author USER
 */
public class CarritoDAO implements ICarritoDAO{

     Carrito c = new Carrito();

    public CarritoDAO() {
        c.generarLista();

    }

     @Override
    public Boolean BuscarCarrito(Long id) throws ExcepcionAT {
    if (id==null) {
        
        return false;
    }
        for (Carrito c : c.getCarrito()) {
            if (id .equals(c.getId()) ) {
                return true;
            }
        }

        return false;
    }
}