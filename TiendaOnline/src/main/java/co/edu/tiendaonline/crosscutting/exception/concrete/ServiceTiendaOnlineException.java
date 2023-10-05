package co.edu.tiendaonline.crosscutting.exception.concrete;

import co.edu.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.tiendaonline.crosscutting.exception.enumerator.LugarException;

public class ServiceTiendaOnlineException extends TiendaOnlineException {
	
	private static final long serialVersionUID = -5472106755354804443L;

	protected ServiceTiendaOnlineException(final Throwable excepcionRaiz, final String mensajeUsuario,
			final String mensajeTecnico) {
		super(LugarException.SERVICE, excepcionRaiz, mensajeUsuario, mensajeTecnico);
	}

	public static final TiendaOnlineException crear(final String mensajeUsuario) {
		return new ServiceTiendaOnlineException(null, mensajeUsuario, mensajeUsuario);
	}
	
	public static final TiendaOnlineException crear(final String mensajeUsuario, final String mensajeTecnico) {
		return new ServiceTiendaOnlineException(null, mensajeUsuario, mensajeTecnico);
	}
	
	public static final TiendaOnlineException crear( final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
		return new ServiceTiendaOnlineException(excepcionRaiz, mensajeUsuario, mensajeTecnico);
	}

}
