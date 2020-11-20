package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.gestao.eventos.factory.ConnectionFactory;
import br.com.gestao.eventos.model.ReservaEvento;

public class ReservaEventoDAO {
	public void save(ReservaEvento reservaEvento) {
		String sql = "INSERT INTO reservaevento (nomeEvento, horarioEvento, dataEvento, descricaoEvento, idEspaco, idProfessor) VALUES(?,?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, reservaEvento.getNomeEvento());
			pstm.setString(2, reservaEvento.getHorarioEvento());
			pstm.setString(3, reservaEvento.getDataEvento());
			pstm.setString(4, reservaEvento.getDescricaoEvento());
			pstm.setInt(5, reservaEvento.getIdEspaco());			
			pstm.setInt(6, reservaEvento.getIdProfessor());
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
	
	public void update(ReservaEvento reservaEvento) {
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
	
	public void delete(ReservaEvento reservaEvento) {
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
