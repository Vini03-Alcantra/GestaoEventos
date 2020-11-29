package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServletResponse;

import br.com.gestao.eventos.factory.ConnectionFactory;

public class LoginParticipanteDAO  {
	
	public boolean checkLogin(String login, String senha, String tipoConta) throws SQLException, ServletException{
		String sql = "";
		if(tipoConta == "professor") {
			sql = "SELECT * FROM professor WHERE emailProfessor = ? and senhaProfessor = ?";
		} else if(tipoConta == "administrador") {
			sql = "SELECT * FROM participante WHERE emailAdministrador = ? and senhaAdministrador = ?";
		} else {
			sql = "SELECT * FROM participante WHERE emailParticipante = ? and senhaParticipante = ?";
		}
		
		
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		boolean check = false;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, login);
			pstm.setString(2, senha);
			rset = pstm.executeQuery();
			
			
			if(rset.next()) {
				check = true;
			} else {
				check = false;
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
		return check;
	}
}
