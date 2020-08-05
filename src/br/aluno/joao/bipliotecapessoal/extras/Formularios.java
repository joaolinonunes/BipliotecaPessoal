/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aluno.joao.bipliotecapessoal.extras;

import java.awt.Component;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

/**
 *
 * @author João
 */
public class Formularios {
    public static void limparCampos(JInternalFrame form){
        for(Component c: form.getComponents()){
            if(c instanceof JTextField){
                ((JTextField) c).setText(null);
            }
        }
    
    }
    
     public static void tratarCampos(JInternalFrame form,boolean t){
        for(Component c: form.getComponents()){
            if(c instanceof JTextField){
                ((JTextField) c).setEnabled(t);
            }
        }
    
    }
    
    
    
    
    
}
