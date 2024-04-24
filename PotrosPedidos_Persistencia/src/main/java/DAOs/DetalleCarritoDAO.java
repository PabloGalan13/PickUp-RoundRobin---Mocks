/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import IDAOs.IDetalleCarritoDAO;
import excepciones.ExcepcionAT;
import mocks.DetalleCarrito;
import mocks.Producto;



/**
 *
 * @author galan
 */
public class DetalleCarritoDAO implements IDetalleCarritoDAO{

       DetalleCarrito dc = new DetalleCarrito();

    public DetalleCarritoDAO() {
        dc.generarLista();

    }

       @Override
    public Boolean BuscarDetalleCarrito(Long id) throws ExcepcionAT {
    if (id==null) {
        
        return false;
    }
        for (DetalleCarrito dc : dc.getDetalles()) {
            if (id .equals(dc.getId()) ) {
                return true;
            }
        }

        return false;
    }
}

