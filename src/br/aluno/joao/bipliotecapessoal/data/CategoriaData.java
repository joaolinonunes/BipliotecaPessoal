/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aluno.joao.bipliotecapessoal.data;

import br.aluno.joao.bipliotecapessoal.model.CategoriaModel;
import java.sql.PreparedStatement;

/**
 *
 * @author João
 */
public class CategoriaData extends Conexao{
    public CategoriaData() throws Exception{}
    public boolean incluir(CategoriaModel obj) throws Exception{
        String sql = "insert into CATEGORIA (descricao) values(?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getDescricao());
        return ps.executeUpdate()>0;
    }
    
     public boolean editar(CategoriaModel obj) throws Exception{
        String sql = "update CATEGORIA set descricao =? where id =?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getDescricao());
        ps.setInt(2,obj.getId());
        return ps.executeUpdate()>0;
    }
    
     public boolean excluir(int id) throws Exception{
        String sql = "delete from CATEGORIA where id =?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,id);
        return ps.executeUpdate()>0;
    }
}
