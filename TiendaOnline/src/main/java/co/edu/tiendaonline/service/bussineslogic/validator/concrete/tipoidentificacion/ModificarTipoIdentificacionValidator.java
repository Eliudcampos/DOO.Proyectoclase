package co.edu.tiendaonline.service.bussineslogic.validator.concrete.tipoidentificacion;

import co.edu.tiendaonline.service.bussineslogic.validator.Validator;
import co.edu.tiendaonline.service.domain.tipoidentificacion.TipoIdentificacionDomain;
import co.edu.tiendaonline.service.domain.tipoidentificacion.rules.CodigoTipoIdentificacionValidationRule;
import co.edu.tiendaonline.service.domain.tipoidentificacion.rules.IdTipoIdentificacionValidationRule;
import co.edu.tiendaonline.service.domain.tipoidentificacion.rules.NombreTipoIdentificacionValidationRule;
import co.edu.tiendaonline.service.domain.tipoidentificacion.rules.TipoIdentificacionValidationRule;

public final class ModificarTipoIdentificacionValidator implements Validator<TipoIdentificacionDomain>{
	private static final Validator<TipoIdentificacionDomain> instancia = new ModificarTipoIdentificacionValidator();
	
	private ModificarTipoIdentificacionValidator() {
		super();
	}
	
	public static final void ejecutar(final TipoIdentificacionDomain domain) {
		instancia.execute(domain);
	}
	
	@Override
	public void execute(TipoIdentificacionDomain domain) {
		TipoIdentificacionValidationRule.ejecutarValidacion(domain);
		IdTipoIdentificacionValidationRule.ejecutarValidacion(domain.getId());
		CodigoTipoIdentificacionValidationRule.ejecutarValidacion(domain.getCodigo());
		NombreTipoIdentificacionValidationRule.ejecutarValidacion(domain.getNombre());
	}

}
