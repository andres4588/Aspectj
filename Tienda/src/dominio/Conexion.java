package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

public class Conexion {
	
		 private static final String SERVIDOR = Config.SERVIDOR;

		 
		 private static final int PUERTO = Config.PUERTO;
		 private static final String BD = Config.BD;
		 private static final String NOMBRE_USUARIO = Config.NOMBRE_USUARIO;
		 private static final String CONTRASENA_USUARIO =
		Config.CONTRASENA_USUARIO;
		  private static final String ZONA =
		Config.ZONA;

		 public static Connection getConexion() throws SQLException {
		 MysqlDataSource ds = new MysqlDataSource();
		 ds.setServerName(SERVIDOR);
		 ds.setServerTimezone(ZONA);
		 ds.setPortNumber(PUERTO);
		 ds.setDatabaseName(BD);
		 ds.setUser(NOMBRE_USUARIO);
		 ds.setPassword(CONTRASENA_USUARIO);

		 return ds.getConnection();
		 }
		}