package co.edu.tiendaonline.service.domain.tipoidentificacion.rules;


import co.edu.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.tiendaonline.crosscutting.messages.CatalogoMensajes;
import co.edu.tiendaonline.crosscutting.messages.enumerator.CodigoMensaje;
import co.edu.tiendaonline.crosscutting.util.UtilObjeto;
import co.edu.tiendaonline.service.domain.ValidationRule;
import co.edu.tiendaonline.service.domain.tipoidentificacion.TipoIdentificacionDomain;

public final class TipoIdentificacionValidationRule implements ValidationRule<TipoIdentificacionDomain> {
	private static final ValidationRule<TipoIdentificacionDomain> instancia = new TipoIdentificacionValidationRule();
	
	private TipoIdentificacionValidationRule() {
		super();
	}
	
	public static final void ejecutarValidacion(final TipoIdentificacionDomain data) {
		instancia.validar(data);
	}
	
	@Override
	public void validar(TipoIdentificacionDomain data) {
		if(UtilObjeto.esNulo(data)) {
			final var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000124);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
}
