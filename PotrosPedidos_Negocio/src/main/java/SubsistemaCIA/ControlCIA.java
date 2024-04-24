/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubsistemaCIA;

import BOs.VerificarPersonaBO;
import excepciones.ExcepcionAT;

/**
 *
 * @author yohan
 */
public class ControlCIA {

    public ControlCIA() {
    }

    public Boolean ValidarPersona(String ID, String contra) throws ExcepcionAT {

        VerificarPersonaBO vp = new VerificarPersonaBO();
        try {
            return vp.buscarPersona(ID, contra);
        } catch (ExcepcionAT e) {
            throw new ExcepcionAT(e.getMessage());
        }

    }
}
