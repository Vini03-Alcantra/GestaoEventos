package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.gestao.eventos.factory.ConnectionFactory;
import br.com.gestao.eventos.model.Sugestoes;

public class SugestoesDAO {
	public void save(Sugestoes sugestoes) {
		String sql = "INSERT INTO sugestoes(emailEnviado, nomeEnviado, assunto) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, sugestoes.getEmailEnviado());
			pstm.setString(2, sugestoes.getNomeEnviado());
			pstm.setString(3, sugestoes.getAssunto());
			
			pstm.execute();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//Fechar as conexões
			try{
				if(pstm!=null) {
					pstm.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<Sugestoes> readSugestoes(){
		String sql = "SELECT * FROM sugestoes";
		
		List<Sugestoes> sugestoes = new ArrayList<Sugestoes>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Sugestoes sugestao = new Sugestoes();
				
				sugestao.setIdSugestoes(rset.getInt("idSugestoes"));
				sugestao.setEmailEnviado(rset.getString("emailEnviado"));
				sugestao.setNomeEnviado(rset.getString("nomeEnviado"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//Fechar as conexões
			try{
				if(pstm!=null) {
					pstm.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
				
				if (rset != null) {
					rset.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return sugestoes;
	}
	
	public void update(Sugestoes sugestoes) {
		String sql = "UPDATE sugestoes SET emailEnviado = ?, nomeEnviado = ?, assunto = ? WHERE idSugestoes = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, sugestoes.getEmailEnviado());
			pstm.setString(2, sugestoes.getNomeEnviado());
			pstm.setString(3, sugestoes.getAssunto());
			pstm.setInt(4, sugestoes.getIdSugestoes());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//Fechar as conexões
			try{
				if(pstm!=null) {
					pstm.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete(Sugestoes sugestoes) {
		String sql = "DELETE FROM sugestoes WHERE idSugestoes = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setInt(1, sugestoes.getIdSugestoes());
			pstm.execute();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//Fechar as conexões
			try{
				if(pstm!=null) {
					pstm.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
