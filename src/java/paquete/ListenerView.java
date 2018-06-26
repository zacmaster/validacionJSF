/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;


/**
 *
 * @author zac
 */
@ManagedBean
public class ListenerView {
    ArrayList<String> nombres = new ArrayList<>();
     
    private String text;
 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
     
    
    public void validar(FacesContext context,
                        UIComponent component,
                        Object value)
                        throws ValidatorException{
        nombres.add("Juan");
        nombres.add("Jorge");
        String msg = "";
        String v = (String) value;
        
        
        
        System.out.println(nombres);
        nombres.replaceAll(s -> s.toLowerCase());
        if(nombres.contains(v.toLowerCase())){
            msg = "El nombre" + v + "ya existe.";
            throw new ValidatorException(new FacesMessage(msg));
        }
    }
    
   
}