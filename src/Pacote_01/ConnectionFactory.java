package Pacote_01;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory { //Classe para conexão com o banco de dados

	private static final String user="root";
	private static final String password="sonia12021996";
	private static final String url="jdbc:mysql://localhost/sistema";
	
	private static Connection connection=null;
	
	public ConnectionFactory() {}
	
	public static Connection getConection() {
	try {
		if(connection == null || connection.isClosed()) {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url,user,password);
			
		}
		
		
	}catch(Exception e) {
		throw new IllegalArgumentException("Erro ao pegar Conexão com o Banco de Dados!");
	}
		
		
		
		return connection;
		
	}
	
	
}
