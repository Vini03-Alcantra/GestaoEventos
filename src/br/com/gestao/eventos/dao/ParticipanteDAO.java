package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.gestao.eventos.factory.ConnectionFactory;
import br.com.gestao.eventos.model.Participante;

public class ParticipanteDAO {
	public void save(Participante participante) {
		String sql = "INSERT INTO participante (nomeParticipante, matriculaParticipante, cursoParticipante) VALUES (?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			// 
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, participante.getNomeParticipante());
			pstm.setInt(2, participante.getMatriculaParticipante());
			pstm.setString(3, participante.getCursoParticipante());
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
	
	public List<> read(){
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
	
	public void update() {
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
	
	public void delete() {
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
