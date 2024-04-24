/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import IDAOs.IUsuarioDAO;
import excepciones.ExcepcionAT;
import mocks.Usuario;

/**
 *
 * @author yohan
 */
public class UsuarioCiaDAO implements IUsuarioDAO{

    Usuario u = new Usuario();

    public UsuarioCiaDAO() {
        u.generarLista();

    }
@Override
    public Boolean BuscarPersona(String id,String contra) throws ExcepcionAT {
    if (id==null || contra==null) {
        
        return false;
    }
        for (Usuario us : u.getListaaUsuarios()) {
            if (id.equalsIgnoreCase(u.getID())&&contra.equalsIgnoreCase(u.getContra())) {
                return true;
            }
        }

        return false;
    }
}
