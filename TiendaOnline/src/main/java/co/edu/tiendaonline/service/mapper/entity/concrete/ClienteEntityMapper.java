package co.edu.tiendaonline.service.mapper.entity.concrete;

import java.util.ArrayList;
import java.util.List;

import co.edu.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.tiendaonline.crosscutting.messages.CatalogoMensajes;
import co.edu.tiendaonline.crosscutting.messages.enumerator.CodigoMensaje;
import co.edu.tiendaonline.crosscutting.util.UtilObjeto;
import co.edu.tiendaonline.data.entity.ClienteEntity;
import co.edu.tiendaonline.service.domain.cliente.ClienteDomain;
import co.edu.tiendaonline.service.mapper.entity.EntityMapper;

public class ClienteEntityMapper implements EntityMapper<ClienteEntity, ClienteDomain> {

	private static final EntityMapper<ClienteEntity, ClienteDomain> instancia = new ClienteEntityMapper();
	
	private ClienteEntityMapper() {
		super();
	}
	
	@Override
	public final ClienteDomain toDomain(final ClienteEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000074);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
		}
		 
		return ClienteDomain.crear(
				entity.getId(),
				TipoIdentificacionEntityMapper.convertToDomain(entity.getTipoIdentificacion()),
				entity.getIdentificacion(),
				NombreCompletoClienteEntityMapper.convertToDomain(entity.getNombreCompleto()),
				CorreoElectronicoClienteEntityMapper.convertToDomain(entity.getCorreoElectronico()),
				NumeroTelefonoMovilClienteEntityMapper.convertToDomain(entity.getNumeroTelefonoMovil()),
				entity.getFechaNacimiento()
				);
	}

	@Override
	public final ClienteEntity toEntity(final ClienteDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000075);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
		}
		
		return ClienteEntity.crear(
				domain.getId(),
				TipoIdentificacionEntityMapper.convertToEntity(domain.getTipoIdentificacion()),
				domain.getIdentificacion(),
				NombreCompletoClienteEntityMapper.convertToEntity(domain.getNombreCompleto()),
				CorreoElectronicoClienteEntityMapper.convertToEntity(domain.getCorreoElectronico()),
				NumeroTelefonoMovilClienteEntityMapper.convertToEntity(domain.getNumeroTelefonoMovil()),
				domain.getFechaNacimiento()
				);
	}

	public static final ClienteDomain convertToDomain(final ClienteEntity entity) {		 
		return instancia.toDomain(entity);
	}
	
	public static final ClienteEntity convertToEntity(final ClienteDomain domain) {
		return instancia.toEntity(domain);
	}
	
	public static final List<ClienteDomain>  convertToListDomain(final List<ClienteEntity> entity){
		List<ClienteDomain> resultados = new ArrayList<>();
		for (int i = 0; i < entity.size(); i++) {
			resultados.add(convertToDomain(entity.get(i)));
		}
		
		return resultados;
	}
}
