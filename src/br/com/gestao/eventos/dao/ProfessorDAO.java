package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
