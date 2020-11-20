package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	
	public List<Sugestoes> read(){
		String sql = "";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			// 
			pstm = (PreparedStatement) conn.prepareStatement(sql);
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
	
	public void update(Sugestoes sugestoes) {
		String sql = "";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			// 
			pstm = (PreparedStatement) conn.prepareStatement(sql);
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
		String sql = "";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			// 
			pstm = (PreparedStatement) conn.prepareStatement(sql);
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
