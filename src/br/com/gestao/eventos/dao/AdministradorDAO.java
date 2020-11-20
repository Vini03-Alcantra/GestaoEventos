package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.gestao.eventos.factory.ConnectionFactory;
import br.com.gestao.eventos.model.Administrador;

public class AdministradorDAO {
	
	public void save(Administrador administrador) {
		String sql = "INSERT INTO administrador (nomeAdministrador, emailAdministrador, senhaAdministrador, loginAdministrador) VALUES(?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			//Chamando conexão
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criando uma preparedStatement
			pstm = conn.prepareStatement(sql);
			//Adicionar valores esperados pelo sql
			pstm.setString(1, administrador.getNomeAdministrador());
			pstm.setString(2, administrador.getEmailAdministrador());
			pstm.setString(3, administrador.getNomeAdministrador());
			pstm.setString(4, administrador.getLoginAdministrador());
			
			pstm.execute();
			
			System.out.println("Sucesso no administrador");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.close();
			}
			if (pstm != null) {
				pstm.close();
			}
		}
	}
	
	public List<Administrador> readAdministradores{
		String sql = "INSERT INTO administrador (nomeAdministrador, emailAdministrador, senhaAdministrador, loginAdministrador) VALUES(?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			//Chamando conexão
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criando uma preparedStatement
			pstm = conn.prepareStatement(sql);
			
			//Adicionar valores esperados pelo sql
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public void update(Administrador administrador) {
		String sql = "INSERT INTO administrador (nomeAdministrador, emailAdministrador, senhaAdministrador, loginAdministrador) VALUES(?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			//Chamando conexão
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criando uma preparedStatement
			pstm = conn.prepareStatement(sql);
			
			//Adicionar valores esperados pelo sql
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public void delete(Administrador administrador) {
		String sql = "INSERT INTO administrador (nomeAdministrador, emailAdministrador, senhaAdministrador, loginAdministrador) VALUES(?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			//Chamando conexão
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criando uma preparedStatement
			pstm = conn.prepareStatement(sql);
			
			//Adicionar valores esperados pelo sql
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
