package co.edu.tiendaonline.service.bussineslogic.concrete.tipoidentificacion;

import java.util.Optional;
import java.util.UUID;

import co.edu.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.tiendaonline.crosscutting.util.UtilObjeto;
import co.edu.tiendaonline.data.dao.TipoIdentificacionDAO;
import co.edu.tiendaonline.data.dao.daofactory.DAOFactory;
import co.edu.tiendaonline.data.entity.TipoIdentificacionEntity;
import co.edu.tiendaonline.service.bussineslogic.UseCase;
import co.edu.tiendaonline.service.domain.TipoIdentificacionDomain;
import co.edu.tiendaonline.service.mapper.entity.concrete.TipoIdentificacionEntityMapper;

public class RegistrarTipoIdentificacionUseCase implements UseCase<TipoIdentificacionDomain> {

	private DAOFactory factoria;

	
	
	
	public RegistrarTipoIdentificacionUseCase(final DAOFactory factoria, final TipoIdentificacionDAO tipoIdentificacionDAO) {
		setFactoria(factoria);
	}
	
	



	@Override
	public void execute(TipoIdentificacionDomain domain) {
		//1
		//validar integridad de los datos(tipo, longitud, restricciones)
		
		//3
		validarNoExistenciaTipoIdentificacionConElCodigo(domain.getCodigo());
		//4
		validarNoExistenciaTipoIdentificacionConElMismoNombre(domain.getNombre());
		//2
		domain = obtenerIdentificadorTipoIdentificacion(domain);
		//5
		registrarNuevoTipoIdentificacion(domain);
	}
	
	private void registrarNuevoTipoIdentificacion(final TipoIdentificacionDomain domain) {
		var entity = TipoIdentificacionEntityMapper.converToEntity(domain);
		getTipoIdentificacionDAO().crear(entity);
	}
	
	private final void validarNoExistenciaTipoIdentificacionConElMismoNombre(final String nombre) {
		var domain = TipoIdentificacionDomain.crear(null, null, nombre, false);
		var entity = TipoIdentificacionEntityMapper.converToEntity(domain);
		var resultados = getTipoIdentificacionDAO().consultar(entity);
		
		if (!resultados.isEmpty()) {
			var mensajeUsuario = "Ya existe un tipo de identificacion con el mismo nombre" + nombre;
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
			
		}
	}
	
	private final void validarNoExistenciaTipoIdentificacionConElCodigo(final String codigo) {
		var domain = TipoIdentificacionDomain.crear(null, codigo, null, false);
		var entity = TipoIdentificacionEntityMapper.converToEntity(domain);
		var resultados = getTipoIdentificacionDAO().consultar(entity);
		
		if (!resultados.isEmpty()) {
			var mensajeUsuario = "Ya existe un tipo de identificacion con el mismo nombre" + codigo;
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
			
		}
	}
	
	private final void validarNoExistenciaTipoIdentificacionConElMismoNombre(final UUID id) {
		var domain = TipoIdentificacionDomain.crear(id, null, null, false);
		var entity = TipoIdentificacionEntityMapper.converToEntity(domain);
		var resultados = getTipoIdentificacionDAO().consultar(entity);
		
		if (!resultados.isEmpty()) {
			var mensajeUsuario = "Ya existe un tipo de identificacion con el mismo nombre";
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
			
		}
	}
	
	private final TipoIdentificacionDomain obtenerIdentificadorTipoIdentificacion(TipoIdentificacionDomain domain) {
		Optional<TipoIdentificacionEntity> optional = Optional.empty();
		UUID uuid;
		do {
			uuid = UUID.randomUUID();
			optional = getTipoIdentificacionDAO().consultarPorId(uuid);
		} while (optional.isPresent());
		
		return TipoIdentificacionDomain.crear(uuid, domain.getCodigo(), domain.getNombre(), domain.isEstado());
	}



	private final DAOFactory getFactoria() {
		return factoria;
	}






	private final void setFactoria(final DAOFactory factoria) {
		if(UtilObjeto.esNulo(factoria)) {
			var mensajeUsuario = "Se ha presentado un problema tratando de llevar a cabo el registro de la informacion del nuevo tipo de identificacion";
			var mensajeTecnico = "Se ha presentado un problmea en el metodo setFactoria de la clase RegistrarTipoIdentificacionUseCase, debido a que la factoria con la cual desea crear esta nula";
			throw ServiceTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
		}
		
		this.factoria = factoria;
	}





	private final TipoIdentificacionDAO getTipoIdentificacionDAO() {
		return getFactoria().obtenerTipoIdentificacionDAO();
	}

	
	
}
