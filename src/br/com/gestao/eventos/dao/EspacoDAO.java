package br.com.gestao.eventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		String sql = "";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
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
	
	public void update(Espaco espaco) {
		String sql = "";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
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
		String sql = "";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
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
