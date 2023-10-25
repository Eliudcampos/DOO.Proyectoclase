package co.edu.tiendaonline.service.bussineslogic.concrete.cliente;

import java.util.Optional;
import java.util.UUID;

import co.edu.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.tiendaonline.crosscutting.messages.CatalogoMensajes;
import co.edu.tiendaonline.crosscutting.messages.enumerator.CodigoMensaje;
import co.edu.tiendaonline.crosscutting.util.UtilObjeto;
import co.edu.tiendaonline.crosscutting.util.UtilUUID;
import co.edu.tiendaonline.data.dao.ClienteDAO;
import co.edu.tiendaonline.data.dao.daofactory.DAOFactory;
import co.edu.tiendaonline.data.entity.ClienteEntity;
import co.edu.tiendaonline.service.bussineslogic.UseCase;
import co.edu.tiendaonline.service.domain.cliente.ClienteDomain;
import co.edu.tiendaonline.service.domain.correoelectronicocliente.CorreoElectronicoClienteDomain;
import co.edu.tiendaonline.service.domain.nombrecompletocliente.NombreCompletoClienteDomain;
import co.edu.tiendaonline.service.domain.numerotelefonomovilcliente.NumeroTelefonoMovilClienteDomain;
import co.edu.tiendaonline.service.mapper.entity.concrete.ClienteEntityMapper;

public class RegistrarClienteUseCase implements UseCase<ClienteDomain> {

	private DAOFactory factoria;
	
	public RegistrarClienteUseCase(DAOFactory factoria) {
		setFactoria(factoria);
	}
	
	@Override
	public void execute(ClienteDomain domain) {
		validarNoExistenciaMismoNombre(domain.getNombreCompleto());
		validarNoExistenciaCorreoElectronico(domain.getCorreoElectronico());
		validarNoExistenciaNumeroTelefonoMovil(domain.getNumeroTelefonoMovil());
		validarNoExistenciaIdentificacion(domain);
		domain = obtenerIdentificadorCliente(domain);
		registrar(domain);
	}
	
	private final ClienteDomain obtenerIdentificadorCliente(ClienteDomain domain) {
		Optional<ClienteEntity> optional;
		UUID uuid;
		
		do {
			uuid = UtilUUID.generarRandomUUID();
			optional = getClienteDAO().consultarPorId(uuid);
		} while (optional.isPresent());
		
		return ClienteDomain.crear(uuid, domain.getTipoIdentificacion(), domain.getIdentificacion(), domain.getNombreCompleto(), 
				domain.getCorreoElectronico(), domain.getNumeroTelefonoMovil(), domain.getFechaNacimiento());
	}
	
	private final void validarNoExistenciaMismoNombre(final NombreCompletoClienteDomain nombre) {
		//TODO: improve method validations
		final var domain = ClienteDomain.crear(null, null, null, nombre, null, null, null);
		final var entity = ClienteEntityMapper.convertToEntity(domain);
		final var resultados = getClienteDAO().consultar(entity);
		
		if(!resultados.isEmpty()) {
			final var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000101);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
	
	private final void validarNoExistenciaCorreoElectronico(final CorreoElectronicoClienteDomain correoElectronico) {
		//TODO: improve method validations
		final var domain = ClienteDomain.crear(null, null, null, null, correoElectronico, null, null);
		final var entity = ClienteEntityMapper.convertToEntity(domain);
		final var resultados = getClienteDAO().consultar(entity);
		
		if(!resultados.isEmpty()) {
			final var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000102);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
	
	private final void validarNoExistenciaNumeroTelefonoMovil(final NumeroTelefonoMovilClienteDomain numeroTelefono) {
		//TODO: improve method validations
		final var domain = ClienteDomain.crear(null, null, null, null, null, numeroTelefono, null);
		final var entity = ClienteEntityMapper.convertToEntity(domain);
		final var resultados = getClienteDAO().consultar(entity);
		
		if(!resultados.isEmpty()) {
			final var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000102);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
	
	private final void validarNoExistenciaIdentificacion(final ClienteDomain cliente) {
		//TODO: improve method validations
		final var domain = ClienteDomain.crear(null, cliente.getTipoIdentificacion(), cliente.getIdentificacion(), null, null, null, null);
		final var entity = ClienteEntityMapper.convertToEntity(domain);
		final var resultados = getClienteDAO().consultar(entity);
		
		if(!resultados.isEmpty()) {
			final var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000104);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
	
	private void registrar(final ClienteDomain domain) {
		getClienteDAO().crear(ClienteEntityMapper.convertToEntity(domain));
	}
	
	private final DAOFactory getFactoria() {
		return factoria;
	}
	
	private final void setFactoria(final DAOFactory factoria) {
		if(UtilObjeto.esNulo(factoria)) {
			final var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000099);
			final var mensajeTecnico = CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M0000000100);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
		}
		
		this.factoria = factoria;
	}
	
	private final ClienteDAO getClienteDAO() {
		return getFactoria().obtenerClienteDAO();
	}

}
