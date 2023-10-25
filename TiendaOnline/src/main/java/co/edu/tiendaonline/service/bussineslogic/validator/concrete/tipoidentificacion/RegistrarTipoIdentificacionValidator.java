package co.edu.tiendaonline.service.bussineslogic.validator.concrete.tipoidentificacion;

import co.edu.tiendaonline.service.bussineslogic.validator.Validator;
import co.edu.tiendaonline.service.domain.tipoidentificacion.TipoIdentificacionDomain;
import co.edu.tiendaonline.service.domain.tipoidentificacion.rules.CodigoTipoIdentificacionValidationRule;
import co.edu.tiendaonline.service.domain.tipoidentificacion.rules.NombreTipoIdentificacionValidationRule;
import co.edu.tiendaonline.service.domain.tipoidentificacion.rules.TipoIdentificacionValidationRule;

public final class RegistrarTipoIdentificacionValidator implements Validator<TipoIdentificacionDomain>{
	private static final Validator<TipoIdentificacionDomain> instancia = new RegistrarTipoIdentificacionValidator();
	
	private RegistrarTipoIdentificacionValidator() {
		super();
	}
	
	public static final void ejecutar(final TipoIdentificacionDomain domain) {
		instancia.execute(domain);
	}
	
	@Override
	public void execute(TipoIdentificacionDomain domain) {
		TipoIdentificacionValidationRule.ejecutarValidacion(domain);
		CodigoTipoIdentificacionValidationRule.ejecutarValidacion(domain.getCodigo());
		NombreTipoIdentificacionValidationRule.ejecutarValidacion(domain.getNombre());
	}

}
