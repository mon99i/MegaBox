package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.catalina.mbeans.ClassNameMBean;


public class DBConfig {

	//public static String driver;
	//public static String dbms;
	//public static String URL;
	//public static String database;
	
	static  Connection con         = null;
    static  Statement stmt         = null;
    static  ResultSet rs           = null ;
	public static String dbUserName = "root";
	public static String dbPassword = "onlyroot";

	//static String driverMySQL = "com.mysql.jdbc.Driver";
	//static String URLLocalMySQL = "jdbc:mysql://localhost:3305/" ;
	
    public static String driver= "com.mysql.jdbc.Driver";
    public static String URL = "jdbc:mysql://localhost:3306/megabox" ;;

	
    public static void loadConnection() {

    	try {
			Class.forName(DBConfig.driver);
			System.out.println("����̹� ���� ����");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����̹� ���� ����");
		}
		
		try {
			con=DriverManager.getConnection(DBConfig.URL, DBConfig.dbUserName, DBConfig.dbPassword);
			System.out.println("���������̽� ���� ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���������̽� ���� ����");
			e.printStackTrace();
		}
    }
	
	/*static {
		driver = driverMySQL;
		dbms = "MySQL";
		database = "megabox";
		URL = URLLocalMySQL + database;
	}*/
	
	
	
	
}