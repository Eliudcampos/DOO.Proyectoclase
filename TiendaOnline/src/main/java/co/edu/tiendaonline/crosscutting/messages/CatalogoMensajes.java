package co.edu.tiendaonline.crosscutting.messages;

import java.util.HashMap;
import java.util.Map;

import co.edu.tiendaonline.crosscutting.exception.concrete.CrossCuttingTiendaOnlineException;
import co.edu.tiendaonline.crosscutting.messages.enumerator.CategoriaMensaje;
import co.edu.tiendaonline.crosscutting.messages.enumerator.CodigoMensaje;
import co.edu.tiendaonline.crosscutting.messages.enumerator.TipoMensaje;
import co.edu.tiendaonline.crosscutting.util.UtilObjeto;

public final class CatalogoMensajes {
	
	private static final Map<CodigoMensaje, Mensaje> MENSAJES = new HashMap<>();
	
	static {
		cargarMensajes();
	}
	
	private CatalogoMensajes() {
		super();
	}
	
	
	private static final void cargarMensajes(){
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000001, TipoMensaje.Tecnico, CategoriaMensaje.FATAL, "No se recibio el codigo del mensaje que se queria crear, no es posible continuar con el proceso..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000002, TipoMensaje.Tecnico, CategoriaMensaje.FATAL, "No existe un mensaje con el codigo que se recibio, no es posible continuar con el proceso..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000003, TipoMensaje.Tecnico, CategoriaMensaje.FATAL, "No es posible obtener un mensaje con codigo vacio o nulo, no es posible continuar con el proceso..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000004, TipoMensaje.Tecnico, CategoriaMensaje.FATAL, "Se ha presentado un error inesperado por favor intente de nuevo, y si el error presiste contacte al administrador de la aplicacion..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000005, TipoMensaje.Tecnico, CategoriaMensaje.FATAL, "Se ha presentado un error tratando de validar si la conexión SQL estaba abierta. Se presento una excepción de tipo SQLException. Por favor rectifique la traza completa..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000006, TipoMensaje.Tecnico, CategoriaMensaje.FATAL, "Se ha presentado un problema inesperado tratando de validar si la conexión SQL esta abierta. Se presento una Excepción generica..."));
	}
		
	private static final void agregarMensaje(final Mensaje mensaje){	
		MENSAJES.put(mensaje.getCodigo(), mensaje);
	}
	
	public static final Mensaje obtenerMensaje(final CodigoMensaje codigo) {
		if (UtilObjeto.esNulo(codigo)) {
			String mensajeUsuario = obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			String mensajeTecnico = obtenerContenidoMensaje(CodigoMensaje.M0000000003);
			throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
		}
		if(!MENSAJES.containsKey(codigo)) {
			String mensajeUsuario = obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			String mensajeTecnico = obtenerContenidoMensaje(CodigoMensaje.M0000000003);
			throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
		}
		return MENSAJES.get(codigo);
		
	}
	
	public static final String obtenerContenidoMensaje(final CodigoMensaje codigo) {
		return obtenerMensaje(codigo).getContenido();
	}
	
}
