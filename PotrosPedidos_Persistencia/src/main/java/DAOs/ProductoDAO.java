/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import IDAOs.ICarritoDAO;
import IDAOs.IProductoDAO;
import excepciones.ExcepcionAT;
import mocks.Banco;
import mocks.Producto;


/**
 *
 * @author USER
 */
public class ProductoDAO implements IProductoDAO {
      
    Producto p = new Producto();

    public ProductoDAO() {
        p.generarLista();

    }

    @Override
    public Boolean BuscarProducto(Long id) throws ExcepcionAT {
    if (id==null) {
        
        return false;
    }
        for (Producto b : p.getProductos()) {
            if (id .equals(b.getId()) ) {
                return true;
            }
        }

        return false;
    }
}



