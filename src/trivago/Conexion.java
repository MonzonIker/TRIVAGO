package trivago;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Conexion {
	
	protected Connection conexion;
	protected String bbdd;
	protected String maquina;
	protected String usuario;
	protected String contrasenia;
	
	public Conexion(String bbdd, String maquina, String usuario, String contrasenia) {
		super();
		this.bbdd = bbdd;
		this.maquina = maquina;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.conexion = DriverManager.getConnection("jdbc:mysql://" + maquina + "/" + bbdd, usuario, contrasenia);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	public void cerrarConexion() throws SQLException{
		this.conexion.close();
	}
}