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

    public boolean validar(String user, String contra) throws ExcepcionAT{
       ValidarPersona persona = new ValidarPersona();
       
        if (persona.validacion(user, contra)) {
            return true;
        }else{
            return false;
    }
    }
  
  
  
    
}
