package co.edu.tiendaonline.data.dao.base;

import java.sql.Connection;

import co.edu.tiendaonline.crosscutting.exception.concrete.DataTiendaOnlineException;
import co.edu.tiendaonline.crosscutting.messages.CatalogoMensajes;
import co.edu.tiendaonline.crosscutting.messages.enumerator.CodigoMensaje;
import co.edu.tiendaonline.crosscutting.util.UtilSQL;


public class SQLDAO {
	private Connection conexion;
	
	protected SQLDAO (final Connection conexion) {
		setConexion(conexion);
	}

	private final void setConexion(final Connection conexion) {
        if(!UtilSQL.conexionAbierta(conexion)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000027);
			throw DataTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);		
        }
        
        this.conexion = conexion;
	}
	
	protected final Connection getConexion() {
		return conexion;
	}

}
