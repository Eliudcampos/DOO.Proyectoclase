package co.edu.tiendaonline.crosscutting.exception.concrete;

import co.edu.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.tiendaonline.crosscutting.exception.enumerator.LugarException;

public class CrossCuttingTiendaOnlineException extends TiendaOnlineException {
	
	private static final long serialVersionUID = -5472106756354804443L;

	protected CrossCuttingTiendaOnlineException(final Throwable excepcionRaiz, final String mensajeUsuario,
			final String mensajeTecnico) {
		super(LugarException.CROSSCUTTING, excepcionRaiz, mensajeUsuario, mensajeTecnico);
	}

	public static final TiendaOnlineException crear(final String mensajeUsuario) {
		return new CrossCuttingTiendaOnlineException(null, mensajeUsuario, mensajeUsuario);
	}
	
	public static final TiendaOnlineException crear(final String mensajeUsuario, final String mensajeTecnico) {
		return new CrossCuttingTiendaOnlineException(null, mensajeUsuario, mensajeTecnico);
	}
	
	public static final TiendaOnlineException crear( final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
		return new CrossCuttingTiendaOnlineException(excepcionRaiz, mensajeUsuario, mensajeTecnico);
	}

}
