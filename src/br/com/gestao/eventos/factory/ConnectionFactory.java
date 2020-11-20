package br.com.gestao.eventos.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	//Nome do Usuário MySQL
	private static final String USERNAME = "root";

	//Senha do Banco de dados
	private static final String PASSWORD = "admin123456";

	//Caminho do banco de dados, porta, nome do Banco
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/gestaoeventos?useTimezone=true&serverTimezone=UTC&useSSL=false";

	//Conexão com o banco de dados
	public static Connection createConnectionToMySQL() throws SQLException, ClassNotFoundException {
		//Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Cria conexão com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return connection;
	}
	
}
