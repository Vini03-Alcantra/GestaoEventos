package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.gestao.eventos.factory.ConnectionFactory;
import br.com.gestao.eventos.model.Administrador;

public class AdministradorDAO {
	
	public void save(Administrador administrador) throws SQLException {
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
	
	public List<Administrador> readAdministradores(){
		String sql = "SELECT * FROM administradores";
		
		List<Administrador> administradores = new ArrayList<Administrador>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		//Classe que vai recuperar os dados do banco
		ResultSet rset = null;
		try {
			//Chamando conexão
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criando uma preparedStatement
			pstm = conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Administrador administrador = new Administrador();
				
				administrador.setIdAdministrador(rset.getInt("idAdministrador"));
				administrador.setNomeAdministrador(rset.getString("nomeAdministrador"));
				administrador.setEmailAdministrador(rset.getString("emailAdministrador"));
				administrador.setSenhaAdministrador(rset.getString("senhaAdministrador"));
				administrador.setLoginAdministrador(rset.getString("loginAdministrador"));
				administrador.setRegistroAdministrador(rset.getInt("registroAdministrador"));
				
				administradores.add(administrador);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rset!=null) {
					rset.close();
				}
				
				if(conn!=null) {
					rset.close();
				}
				
				if(pstm != null) {
					pstm.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return administradores;
	}
	
	public void update(Administrador administrador) throws SQLException {
		String sql = "UPDATE administrador SET nomeAdministrador = ?, emailAdministrador = ?, senhaAdministrador = ?, loginAdministrador = ?, registroAdministrador = ? WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			//Chamando conexão
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criando uma preparedStatement
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, administrador.getNomeAdministrador());
			pstm.setString(2, administrador.getEmailAdministrador());
			pstm.setString(3, administrador.getSenhaAdministrador());
			pstm.setString(4, administrador.getLoginAdministrador());
			pstm.setInt(5, administrador.getRegistroAdministrador());
			pstm.setInt(6, administrador.getIdAdministrador());
			pstm.executeQuery();
			
			System.out.println("Administrador atualizado com sucesso");
		} catch (Exception e) {
			System.out.println("Deu erro na operação de atualização do administrador");
		} finally {
			if(conn != null) {
				conn.close();
			}
			
			if (pstm != null) {
				pstm.close();
			}
		}

	}
	
	public void delete(Administrador administrador) throws SQLException {
		String sql = "DELETE FROM administrador WHERE idAdministrador = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			//Chamando conexão
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criando uma preparedStatement
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, administrador.getIdAdministrador());
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Deu erro na exclusão");
		} finally {
			if (conn != null) {
				conn.close();				
			}
			
			if (pstm != null) {
				pstm.close();
			}
		}

	}
}
