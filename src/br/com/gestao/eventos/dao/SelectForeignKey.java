package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.gestao.eventos.factory.ConnectionFactory;
import br.com.gestao.eventos.model.Espaco;
import br.com.gestao.eventos.model.Professor;

public class SelectForeignKey {
	public int ForeingKeyProfessor(String nomeProfessor) throws SQLException {
		String sql = "SELECT idProfessor FROM professor WHERE nomeProfessor = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;		
		int id = 0;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, nomeProfessor);
			rset = pstm.executeQuery();			
			
			while(rset.next()) {								
				id = rset.getInt("idProfessor");				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.close();
			} 
			if (pstm != null) {
				pstm.close();
			}
			if(rset != null) {
				rset.close();
			}
		}
		
		return id;
	}
	
	public int ForeignKeyEspaco(String nomeEspaco){
		String sql = "SELECT idEspaco FROM espaco WHERE nome_espaco = ?";		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		int id = 0;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, nomeEspaco);
			rset = pstm.executeQuery();
			
			while(rset.next()) {				
				id = rset.getInt("idEspaco");				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
			//Fechar as conexões
			try{
				if(pstm!=null) {
					pstm.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
				
				if(rset!=null) {
					rset.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			} 
		}
		return id;
	}
}
