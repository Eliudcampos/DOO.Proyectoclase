package co.edu.tiendaonline.crosscutting.util;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.tiendaonline.crosscutting.exception.concrete.CrossCuttingTiendaOnlineException;
import co.edu.tiendaonline.crosscutting.messages.CatalogoMensajes;
import co.edu.tiendaonline.crosscutting.messages.enumerator.CodigoMensaje;

public final class UtilSQL {
	
	private UtilSQL() {
		super();
	}
	public static final boolean conexionAbierta(final Connection conexion) {
		if (UtilObjeto.esNulo(conexion)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			var mensajeTecnico = "No se puede validar si una conexión esta abierta si es Nula";
			throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
		}
		
		try {
			return !UtilObjeto.esNulo(conexion) && !conexion.isClosed();
		} catch (final SQLException excepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000005);
			throw CrossCuttingTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
		} catch (final Exception excepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000006);
			throw CrossCuttingTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
		}
	}
	public static final void cerrarConexion(final Connection conexion) {
		if (UtilObjeto.esNulo(conexion)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			var mensajeTecnico = "No es posible cerrar una conexión que no esta nula";
			throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
		}	
		if (UtilObjeto.esNulo(conexion)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			var mensajeTecnico = "No es posible cerrar una conexión que ya fue cerrada";
			throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);		
		}
		try {
			if (!conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000004);
				var mensajeTecnico = "No es posible cerrar una conexión que ya fue cerrada";
				throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
			}
			catch (final CrossCuttingTiendaOnlineException excepcion) {
				throw excepcion;
			}catch (final SQLException excepcion) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000004);
				var mensajeTecnico = "No es posible cerrar una conexión que ya fue cerrada";
				throw CrossCuttingTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
			} catch (final Exception excepcion) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000006);
				throw CrossCuttingTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
			}
			
		}
		
	public static final void iniciarTransaccion(final Connection conexion) {
		if (UtilObjeto.esNulo(conexion)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			var mensajeTecnico = "No se puede validar si una conexión esta abierta si es Nula";
			throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);	
		}
	}
}
		
			
	

