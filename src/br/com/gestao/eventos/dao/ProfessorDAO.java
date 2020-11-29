package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.gestao.eventos.factory.ConnectionFactory;
import br.com.gestao.eventos.model.Professor;

public class ProfessorDAO {
	public void save(Professor professor) throws SQLException {
		String sql = "INSERT INTO professor(nomeProfessor, matriculaProfessor, cursoProfessorVinculado, loginProfessor, senhaProfessor, emailProfessor) VALUES(?,?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, professor.getNomeProfessor());
			pstm.setInt(2, professor.getMatriculaProfessor());
			pstm.setString(3, professor.getCursoProfessorVinculado());
			pstm.setString(4, professor.getLoginProfessor());
			pstm.setString(5, professor.getSenhaPorfessor());
			pstm.setString(6, professor.getEmailProfessor());
			
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
	
	public List<Professor> read() throws SQLException{
		String sql = "SELECT * FROM professor";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		List<Professor> professores = new ArrayList<Professor>();
				
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Professor professor = new Professor();
				
				professor.setIdProfessor(rset.getInt("idProfessor"));
				professor.setNomeProfessor(rset.getString("nomeProfessor"));
				professor.setMatriculaProfessor(rset.getInt("matriculaProfessor"));
				professor.setCursoProfessorVinculado(rset.getString("cursoProfessorVinculado"));
				professor.setLoginProfessor(rset.getString("loginProfessor"));  
				professor.setEmailProfessor(rset.getString("senhaProfessor"));  
				professor.setSenhaPorfessor(rset.getString("emailProfessor"));
				
				professores.add(professor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rset!=null) {
				rset.close();
			}
			if(pstm!=null) {
				pstm.close();
			}
			
			if(conn!=null) {
				conn.close();
			}
		}
		
		return professores;
	}
}
