package application;

import java.sql.Connection;

import db.Db;

public class Program {
	public static void main(String[] args) {
		Connection conn = Db.getConnection(); // quando eu quiser conectar com o banco é só chamar Db.getConncetion();
		if(conn!=null) {
			System.out.println("connectado");
		}
		Db.closeConnection();
		
	}

}
