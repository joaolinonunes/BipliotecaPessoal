/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aluno.joao.bipliotecapessoal.data;

import javax.swing.JOptionPane;

/**
 *
 * @author João
 */
public class TesteConexao {
    public static void main(String[] args) {
        try {
            Conexao c = new Conexao();
            JOptionPane.showMessageDialog(null,"Deu certo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Deu erro: "+ e);
        }
    }
    
}
