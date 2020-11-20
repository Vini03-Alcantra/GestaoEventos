package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Participante> read(){
		String sql = "SELECT * FROM	participante";
		
		List<Participante> participantes = new ArrayList<Participante>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();		
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Participante participante = new Participante();
				
				participante.setIdParticipante(rset.getInt("idParticipante"));
				participante.setNomeParticipante(rset.getString("nomeParticipante"));
				participante.setMatriculaParticipante(rset.getInt("matriculaParticipante"));
				participante.setCursoParticipante(rset.getString("cursoParticipante"));
				
				participantes.add(participante);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//Fechar as conexões
			try{
				if(rset!=null) {
					rset.close();
				}
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
		return participantes;
	}
	
	public void update(Participante participante) {
		String sql = "UPDATE participante SET nomeParticipante = ?, matriculaParticipante = ?, cursoParticipante = ? WHERE idParticipante = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, participante.getNomeParticipante());
			pstm.setInt(2, participante.getMatriculaParticipante());
			pstm.setString(3, participante.getCursoParticipante());
			pstm.setInt(4, participante.getIdParticipante());
			
			pstm.executeUpdate();
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
	
	public void delete(Participante participante) {
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
