package co.edu.tiendaonline.service.domain.tipoidentificacion.rules;

import java.util.UUID;

import co.edu.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.tiendaonline.crosscutting.messages.CatalogoMensajes;
import co.edu.tiendaonline.crosscutting.messages.enumerator.CodigoMensaje;
import co.edu.tiendaonline.crosscutting.util.UtilUUID;
import co.edu.tiendaonline.service.domain.ValidationRule;

public final class IdTipoIdentificacionValidationRule implements ValidationRule<UUID> {
	private static final ValidationRule<UUID> instancia = new IdTipoIdentificacionValidationRule();
	
	private IdTipoIdentificacionValidationRule() {
		super();
	}
	
	public static final void ejecutarValidacion(final UUID valor) {
		instancia.validar(valor);
	}
	
	@Override
	public void validar(UUID valor) {
		validarObligatoriedad(valor);
	}
	
	private final void validarObligatoriedad(final UUID valor) {
		if(UtilUUID.esNulo(valor)) {
			final var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000123);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
}
