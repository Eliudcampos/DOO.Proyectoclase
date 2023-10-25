package co.edu.tiendaonline.service.domain.tipoidentificacion.rules;

import co.edu.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.tiendaonline.crosscutting.messages.CatalogoMensajes;
import co.edu.tiendaonline.crosscutting.messages.enumerator.CodigoMensaje;
import co.edu.tiendaonline.crosscutting.util.UtilTexto;
import co.edu.tiendaonline.service.domain.ValidationRule;

public final class CodigoTipoIdentificacionValidationRule implements ValidationRule<String> {

	private static final ValidationRule<String> instancia = new CodigoTipoIdentificacionValidationRule();
	
	private CodigoTipoIdentificacionValidationRule() {
		super();
	}
	
	public static final void ejecutarValidacion(final String valor) {
		instancia.validar(valor);
	}
	
	@Override
	public void validar(String valor) {
		validarLongitud(valor);
		validarObligatoriedad(valor);
		validarFormato(valor);
	}

	private final void validarLongitud(final String valor) {
		if(!UtilTexto.longitudMaximaValida(valor, 50)) {
			final var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000117);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
	
	private final void validarObligatoriedad(final String valor) {
		if(UtilTexto.estaVacio(valor)) {
			final var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000118);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
	
	private final void validarFormato(final String valor) {
		if(!UtilTexto.contieneSoloLetras(valor)) {
			final var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000118);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
}
