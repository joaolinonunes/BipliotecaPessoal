/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aluno.joao.bipliotecapessoal.data;

import br.aluno.joao.bipliotecapessoal.model.TipoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author João
 */
public class TipoData {
    
  /*   public ArrayList<TipoModel> pesquisar(String texto) throws Exception{
        ArrayList<TipoModel> dados = new ArrayList<>();
        String sql="Select * from Tipos where descricao like '"+texto+"%'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            TipoModel obj = new TipoModel(rs.getInt("id"),rs.getString("descricao"));
            dados.add(obj);
        }  
        return dados;
    } 
    */
}
