package singleton;

public class ConexionDB {
	private static ConexionDB conexion;

	private ConexionDB() {

	}

	public static ConexionDB obtenerConexion() {
		if (conexion == null) {
			conexion = new ConexionDB();
		}
		return conexion;
	}
}