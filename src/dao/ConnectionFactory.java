package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
	public Connection getConnetion() {
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost/crud_dao", "your_username", "your_pass");
		}catch (Exception e){
			throw new RuntimeException("Erro: "+e);
		}
	}
}
