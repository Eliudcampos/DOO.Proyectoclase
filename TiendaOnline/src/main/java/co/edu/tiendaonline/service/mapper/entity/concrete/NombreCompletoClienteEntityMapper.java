package co.edu.tiendaonline.service.mapper.entity.concrete;

import co.edu.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.tiendaonline.crosscutting.messages.CatalogoMensajes;
import co.edu.tiendaonline.crosscutting.messages.enumerator.CodigoMensaje;
import co.edu.tiendaonline.crosscutting.util.UtilObjeto;
import co.edu.tiendaonline.data.entity.support.NombreCompletoClienteEntity;
import co.edu.tiendaonline.service.domain.nombrecompletocliente.NombreCompletoClienteDomain;
import co.edu.tiendaonline.service.mapper.entity.EntityMapper;

public class NombreCompletoClienteEntityMapper implements EntityMapper<NombreCompletoClienteEntity, NombreCompletoClienteDomain> {

	private static final EntityMapper<NombreCompletoClienteEntity, NombreCompletoClienteDomain> instancia = new NombreCompletoClienteEntityMapper();
	
	private NombreCompletoClienteEntityMapper() {
		super();
	}
	
	@Override
	public final NombreCompletoClienteDomain toDomain(final NombreCompletoClienteEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000082);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
		}
		 
		return NombreCompletoClienteDomain.crear(entity.getPrimerNombre(), entity.getSegundoNombre(), entity.getPrimerApellido(), entity.getSegundoApellido());
	}

	@Override
	public final NombreCompletoClienteEntity toEntity(final NombreCompletoClienteDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000083);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
		}
		
		return NombreCompletoClienteEntity.crear(domain.getPrimerNombre(), domain.getSegundoNombre(), domain.getPrimerApellido(), domain.getSegundoApellido());
	}

	public static final NombreCompletoClienteDomain convertToDomain(final NombreCompletoClienteEntity entity) {		 
		return instancia.toDomain(entity);
	}
	
	public static final NombreCompletoClienteEntity convertToEntity(final NombreCompletoClienteDomain domain) {
		return instancia.toEntity(domain);
	}
}
