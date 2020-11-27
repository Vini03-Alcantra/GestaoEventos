package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.gestao.eventos.factory.ConnectionFactory;

public class LoginParticipanteDAO {
	public boolean checkLogin(String login, String senha) throws SQLException {
		String sql = "SELECT * FROM participante WHERE nomeParticipante = ?, senhaParticipante = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		boolean check = false;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			if(rset.next()) {
				check = true;
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
