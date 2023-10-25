package co.edu.tiendaonline.crosscutting.exception.concrete;

import co.edu.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.tiendaonline.crosscutting.exception.enumerator.LugarException;

public class CrosscuttingTiendaOnlineException extends TiendaOnlineException {
	
	private static final long serialVersionUID = 5191812243030690679L;

	protected CrosscuttingTiendaOnlineException(final Throwable excepcionRaiz, final String mensajeUsuario,
			final String mensajeTecnico) {
		super(LugarException.CROSSCUTTING, excepcionRaiz, mensajeUsuario, mensajeTecnico);
	}
	
	public static final TiendaOnlineException crear(final String mensajeUsuario) {
		return new CrosscuttingTiendaOnlineException(null, mensajeUsuario, mensajeUsuario);
	}
	
	public static final TiendaOnlineException crear(final String mensajeUsuario, final String mensajeTecnico) {
		return new CrosscuttingTiendaOnlineException(null, mensajeUsuario, mensajeTecnico);
	}
	
	public static final TiendaOnlineException crear(final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
		return new CrosscuttingTiendaOnlineException(excepcionRaiz, mensajeUsuario, mensajeTecnico);
	}
}
