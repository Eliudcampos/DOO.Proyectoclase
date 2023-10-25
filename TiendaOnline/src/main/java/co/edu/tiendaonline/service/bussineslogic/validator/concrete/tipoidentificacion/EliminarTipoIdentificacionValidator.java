package co.edu.tiendaonline.service.bussineslogic.validator.concrete.tipoidentificacion;

import co.edu.tiendaonline.service.bussineslogic.validator.Validator;
import co.edu.tiendaonline.service.domain.tipoidentificacion.TipoIdentificacionDomain;
import co.edu.tiendaonline.service.domain.tipoidentificacion.rules.IdTipoIdentificacionValidationRule;
import co.edu.tiendaonline.service.domain.tipoidentificacion.rules.TipoIdentificacionValidationRule;

public final class EliminarTipoIdentificacionValidator implements Validator<TipoIdentificacionDomain>{
	private static final Validator<TipoIdentificacionDomain> instancia = new EliminarTipoIdentificacionValidator();
	
	private EliminarTipoIdentificacionValidator() {
		super();
	}
	
	public static final void ejecutar(final TipoIdentificacionDomain domain) {
		instancia.execute(domain);
	}
	
	@Override
	public void execute(TipoIdentificacionDomain domain) {
		TipoIdentificacionValidationRule.ejecutarValidacion(domain);
		IdTipoIdentificacionValidationRule.ejecutarValidacion(domain.getId());
	}

}
