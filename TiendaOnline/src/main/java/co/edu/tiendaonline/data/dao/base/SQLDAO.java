package co.edu.tiendaonline.data.dao.base;

import java.sql.Connection;

public class SQLDAO {

	private Connection conexion;
	
	protected SQLDAO(final Connection conexion) {
		setConexion(conexion);
	}
	
	private final void setConexion(final Connection conexion) {
		// TODO: Controlar que la conexion no sea nula, que no este cerrada o que ya este abierta
		// se haya confirmado la transaccion
		this.conexion = conexion;
		
	}

	protected final Connection getConexion() {
		return conexion;
		
	}
	
	
}
