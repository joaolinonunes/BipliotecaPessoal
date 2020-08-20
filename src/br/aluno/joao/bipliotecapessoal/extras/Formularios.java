/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aluno.joao.bipliotecapessoal.extras;

import br.aluno.joao.bipliotecapessoal.model.TipoModel;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author João
 */
public class Formularios {
    public static void limparCampos(JInternalFrame form){
        for(Component c: form.getContentPane().getComponents()){
            if(c instanceof JTextField){
                ((JTextField) c).setText(null);
            }
        }
    
    }
    
     public static void tratarCampos(JInternalFrame form,boolean t){
        for(Component c: form.getContentPane().getComponents()){
            if(c instanceof JTextField){
                ((JTextField) c).setEnabled(t);
            }
        }
    
    }
  public static void limparTabela(JTable tabela)  {
        DefaultTableModel mp = (DefaultTableModel)tabela.getModel();
            mp.setNumRows(0);
    }
    
    
    
    
}
