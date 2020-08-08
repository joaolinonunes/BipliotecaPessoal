/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.aluno.joao.bipliotecapessoal.data;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author João
 */
public class Conexao {
    private Connection con;
    public Connection getConexao(){
    return con;
    }
public Conexao() throws Exception{
    String driver = "org.postgresql.Driver";
    String url = "jdbc:postgresql://localhost:5432/BibliotecaP";
    Class.forName(driver);
    con = DriverManager.getConnection(url,"postgres","lara2011");
 }
}
