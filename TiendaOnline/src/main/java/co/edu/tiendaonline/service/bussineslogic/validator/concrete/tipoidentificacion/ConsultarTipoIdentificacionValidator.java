package co.edu.tiendaonline.service.bussineslogic.validator.concrete.tipoidentificacion;

import co.edu.tiendaonline.crosscutting.util.UtilObjeto;
import co.edu.tiendaonline.crosscutting.util.UtilTexto;
import co.edu.tiendaonline.crosscutting.util.UtilUUID;
import co.edu.tiendaonline.service.bussineslogic.validator.Validator;
import co.edu.tiendaonline.service.domain.tipoidentificacion.TipoIdentificacionDomain;
import co.edu.tiendaonline.service.domain.tipoidentificacion.rules.CodigoTipoIdentificacionValidationRule;
import co.edu.tiendaonline.service.domain.tipoidentificacion.rules.IdTipoIdentificacionValidationRule;
import co.edu.tiendaonline.service.domain.tipoidentificacion.rules.NombreTipoIdentificacionValidationRule;

public final class ConsultarTipoIdentificacionValidator implements Validator<TipoIdentificacionDomain>{
	private static final Validator<TipoIdentificacionDomain> instancia = new ConsultarTipoIdentificacionValidator();
	
	private ConsultarTipoIdentificacionValidator() {
		super();
	}
	
	public static final void ejecutar(final TipoIdentificacionDomain domain) {
		instancia.execute(domain);
	}
	
	@Override
	public void execute(TipoIdentificacionDomain domain) {
		if(!UtilObjeto.esNulo(domain)) {
			if(!UtilUUID.esNulo(domain.getId())) {				
				IdTipoIdentificacionValidationRule.ejecutarValidacion(domain.getId());
			}
			
			if(!UtilTexto.estaVacio(domain.getCodigo())) {				
				CodigoTipoIdentificacionValidationRule.ejecutarValidacion(domain.getCodigo());
			}
			
			if(!UtilTexto.estaVacio(domain.getNombre())) {				
				NombreTipoIdentificacionValidationRule.ejecutarValidacion(domain.getNombre());
			}
		}
	}

}
