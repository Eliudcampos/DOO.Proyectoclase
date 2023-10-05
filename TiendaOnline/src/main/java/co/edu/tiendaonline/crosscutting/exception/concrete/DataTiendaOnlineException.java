package co.edu.tiendaonline.crosscutting.exception.concrete;

import co.edu.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.tiendaonline.crosscutting.exception.enumerator.LugarException;

public class DataTiendaOnlineException extends TiendaOnlineException {

	protected DataTiendaOnlineException(final Throwable excepcionRaiz,final String mensajeUsuario,
			final String mensajeTecnico) {
		super(LugarException.DATA, excepcionRaiz, mensajeUsuario, mensajeTecnico);
	}

	private static final long serialVersionUID = -5472106755354804443L;

	
	public static final TiendaOnlineException crear(final String mensajeUsuario) {
		return new DataTiendaOnlineException(null, mensajeUsuario, mensajeUsuario);
	}
	
	public static final TiendaOnlineException crear(final String mensajeUsuario, final String mensajeTecnico) {
		return new DataTiendaOnlineException(null, mensajeUsuario, mensajeTecnico);
	}
	
	public static final TiendaOnlineException crear( final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
		return new DataTiendaOnlineException(excepcionRaiz, mensajeUsuario, mensajeTecnico);
	}
}
