package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.gestao.eventos.factory.ConnectionFactory;
import br.com.gestao.eventos.model.Espaco;

public class EspacoDAO {
	public void save(Espaco espaco) {
		String sql = "INSERT INTO espaco(nome_espaco, limite_participantes, descricao) VALUES (?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, espaco.getNome_espaco());
			pstm.setInt(2, espaco.getLimite_participantes());
			pstm.setString(3, espaco.getDescricao());
			
			pstm.execute();
			System.out.println("Espaço salvo com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
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
	
	public List<Espaco> readEspaco(){
		String sql = "SELECT * FROM espaco";
		
		List<Espaco> espacos = new ArrayList<Espaco>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Espaco espaco = new Espaco();
				
				espaco.setIdEspaco(rset.getInt("idEspaco"));
				espaco.setNome_espaco(rset.getString("nome_espaco"));
				espaco.setLimite_participantes(rset.getInt("limite_participantes"));
				espaco.setDescricao(rset.getString(rset.getString("descricao")));
				
				espacos.add(espaco);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
			//Fechar as conexões
			try{
				if(pstm!=null) {
					pstm.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
				
				if(rset!=null) {
					rset.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return espacos;
	}
	
	public void update(Espaco espaco) {
		String sql = "UPDATE espaco SET nome_espaco = ?, limite_participantes = ?, descricao = ? WHERE idEspaco = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setString(1, espaco.getNome_espaco());
			pstm.setInt(2, espaco.getLimite_participantes());
			pstm.setString(3, espaco.getDescricao());
			
			pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
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
	
	public void delete(Espaco espaco) {
		String sql = "DELETE FROM espaco WHERE idEspaco = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setInt(1, espaco.getIdEspaco());
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
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
