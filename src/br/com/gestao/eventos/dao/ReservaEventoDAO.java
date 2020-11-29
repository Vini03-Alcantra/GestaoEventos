package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.gestao.eventos.factory.ConnectionFactory;
import br.com.gestao.eventos.model.ReservaEvento;

public class ReservaEventoDAO {
	public void save(ReservaEvento reservaEvento) {
		String sql = "INSERT INTO reservaevento (nomeEvento, horarioEvento, dataEvento, descricaoEvento, nomeEspaco, nomeProfessor) VALUES(?,?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, reservaEvento.getNomeEvento());
			pstm.setString(2, reservaEvento.getHorarioEvento());
			pstm.setString(3, reservaEvento.getDataEvento());
			pstm.setString(4, reservaEvento.getDescricaoEvento());
			pstm.setString(5, reservaEvento.getNomeEspaco());			
			pstm.setString(6, reservaEvento.getNomeProfessor());
			
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
	
	public List<ReservaEvento> read(){
		String sql = "SELECT * FROM reservaevento";
		
		List<ReservaEvento> reservaEvento = new ArrayList<ReservaEvento>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				ReservaEvento reservas = new ReservaEvento();
				reservas.setIdReservaEvento(rset.getInt("idReservaEvento"));
				reservas.setNomeEvento(rset.getString("nomeEvento"));
				reservas.setHorarioEvento(rset.getString("horarioEvento"));
				reservas.setDataEvento(rset.getString("dataEvento"));
				reservas.setDescricaoEvento(rset.getString("descricaoEvento"));
				reservas.setNomeEspaco(rset.getString("nomeEspaco"));
				reservas.setNomeProfessor(rset.getString("nomeProfessor"));
				
				reservaEvento.add(reservas);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rset!=null) {
					rset.close();
				}
				
				if(conn!=null) {
					rset.close();
				}
				
				if(pstm != null) {
					pstm.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return reservaEvento;		
	}
	
	public void update(ReservaEvento reservaEvento) {
		String sql = "UPDATE reservaevento SET nomeEvento, horarioEvento, dataEvento, descricaoEvento, nomeEspaco, nomenomeProfessor WHERE idReservaEvento = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, reservaEvento.getNomeEvento());
			pstm.setString(2, reservaEvento.getHorarioEvento());
			pstm.setString(3, reservaEvento.getDataEvento());
			pstm.setString(4, reservaEvento.getDescricaoEvento());
			pstm.setString(5, reservaEvento.getNomeEspaco());
			pstm.setString(6, reservaEvento.getNomeProfessor());
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
	
	public void delete(ReservaEvento reservaEvento) {
		String sql = "DELETE reservaevento WHERE idReservaEvento = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setInt(1, reservaEvento.getIdReservaEvento());
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
