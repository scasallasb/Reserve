package amazonviewer.db;

import java.sql.Connection;
import java.sql.DriverManager;

import static amazonviewer.db.DataBase.*;

public interface IDBconnection {
	default Connection connecToDB() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.fabric.jdbc.Driver");
			connection = DriverManager.getConnection(URL + DB, USER,PASSWORD);
			if (connection!=null) {
				System.out.print("no se ha conectado");
			}
		
		}catch(Exception e ) {
			System.out.print("no hay conexion por perra");
			e.printStackTrace();
			
		}finally {
			return connection;
		}
	}
}
