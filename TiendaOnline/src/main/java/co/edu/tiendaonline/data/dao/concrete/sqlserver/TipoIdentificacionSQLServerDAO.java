package co.edu.tiendaonline.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.tiendaonline.crosscutting.exception.concrete.CrossCuttingTiendaOnlineException;
import co.edu.tiendaonline.crosscutting.exception.concrete.DataTiendaOnlineException;
import co.edu.tiendaonline.crosscutting.messages.CatalogoMensajes;
import co.edu.tiendaonline.crosscutting.messages.enumerator.CodigoMensaje;
import co.edu.tiendaonline.data.dao.TipoIdentificacionDAO;
import co.edu.tiendaonline.data.dao.base.SQLDAO;
import co.edu.tiendaonline.data.entity.TipoIdentificacionEntity;

public final class TipoIdentificacionSQLServerDAO extends SQLDAO implements TipoIdentificacionDAO {

	public TipoIdentificacionSQLServerDAO(final Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public final void crear(TipoIdentificacionEntity entity) {
		final StringBuilder sentencia = new StringBuilder();
		
		sentencia.append("INSERT INTO TipoIdentificacion (id, codigo, nombre, estado) ");
		sentencia.append("VALUES (?, ?, ?, ?)");)
		
		try(final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString())){
			
			sentenciaPreparada.setObject(1, entity.getId());
			sentenciaPreparada.setString(2, entity.getCodigo());
			sentenciaPreparada.setString(3, entity.getNombre());
			sentenciaPreparada.setBoolean(4, entity.isEstado());
			
			sentenciaPreparada.executeUpdate();
			
		}catch (final SQLException excepcion) {
			var mensajeUsuario = "Se ha presentado un problema tratando de registar el tipo de identificacion";
			var mensajeTecnico = "Se ha presentado un problema de tipo SQLException en el metodo crear de la clase TipoIdentificacionSQLServer tratando de llevar un registro de un nuevo tipo de identificacion, porfavor revise la traza completa del error presentado para asi poder identificar que sucerdio";
			throw DataTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
		}catch (final Exception excepcion) {
			var mensajeUsuario = "Se ha presentado un problema tratando de registar el tipo de identificacion";
			var mensajeTecnico = "Se ha presentado un problema inesperado de tipo Exception en el metodo crear de la clase TipoIdentificacionSQLServer tratando de llevar un registro de un nuevo tipo de identificacion, porfavor revise la traza completa del error presentado para asi poder identificar que sucerdio";
			throw DataTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
		}
	}

	@Override
	public final void modificar(TipoIdentificacionEntity entity) {

		final StringBuilder sentencia = new StringBuilder();
		
		sentencia.append("INSERT INTO TipoIdentificacion (id, codigo, nombre, estado) ");
		sentencia.append("VALUES (?, ?, ?, ?)");
		
		try(final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString())){
			
			sentenciaPreparada.setObject(1, entity.getId());
			sentenciaPreparada.setString(2, entity.getCodigo());
			sentenciaPreparada.setString(3, entity.getNombre());
			sentenciaPreparada.setBoolean(4, entity.isEstado());
			
			sentenciaPreparada.executeUpdate();
			
		}catch (final SQLException excepcion) {
			var mensajeUsuario = "Se ha presentado un problema tratando de registar el tipo de identificacion";
			var mensajeTecnico = "Se ha presentado un problema de tipo SQLException en el metodo crear de la clase TipoIdentificacionSQLServer tratando de llevar un registro de un nuevo tipo de identificacion, porfavor revise la traza completa del error presentado para asi poder identificar que sucerdio";
			throw DataTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
		}catch (final Exception excepcion) {
			var mensajeUsuario = "Se ha presentado un problema tratando de registar el tipo de identificacion";
			var mensajeTecnico = "Se ha presentado un problema inesperado de tipo Exception en el metodo crear de la clase TipoIdentificacionSQLServer tratando de llevar un registro de un nuevo tipo de identificacion, porfavor revise la traza completa del error presentado para asi poder identificar que sucerdio";
			throw DataTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
		}
		
	}

	@Override
	public final void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public final Optional<TipoIdentificacionEntity> consultarPorId(final UUID id) {
		
		final var sentencia = new StringBuilder();		
		sentencia.append("SELECT id, codigo, nombre, estado ");
		sentencia.append("FROM TipoIdentificacion ");
		sentencia.append("WHERE id = ? ");
		
		Optional<TipoIdentificacionEntity> resultado = Optional.empty();
		
		try(final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString())){
			
			sentenciaPreparada.setObject(1, id);
			
			try(final var resultados = sentenciaPreparada.executeQuery()){
				if(resultados.next()) {
					var tipoIdentificacionEntity = TipoIdentificacionEntity.crear(UUID.fromString(resultados.getObject("id").toString()), resultados.getString("codigo"), resultados.getString("nombre"), resultados.getBoolean("estado"));
				
					resultado = Optional.of(tipoIdentificacionEntity);
				}
			}catch (final SQLException excepcion) {
				
				var mensajeUsuario = "Se ha presentado un problema tratando de consultar la informacion del tipo de identificación por el identificador deseado";
				var mensajeTecnico = "Se ha presentado un problema de tipo SQLException en el metodo consultar el tipo de identificacion por el identificador deseado, porfavor revise la traza completa del error presentado para asi poder identificar que sucerdio";
				throw DataTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
				
			}
			
		
		
		}catch (final SQLException excepcion) {			
			var mensajeUsuario = "Se ha presentado un problema tratando de consultar la informacion del tipo de identificación por el identificador deseado";
			var mensajeTecnico = "Se ha presentado un problema de tipo SQLException en el metodo consultar el tipo de identificacion por el identificador deseado, porfavor revise la traza completa del error presentado para asi poder identificar que sucerdio";
			throw DataTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);

		}catch (final DataTiendaOnlineException excepcion) {			
			var mensajeUsuario = "Se ha presentado un problema tratando de consultar la informacion del tipo de identificación por el identificador deseado";
			var mensajeTecnico = "Se ha presentado un problema de tipo SQLException en el metodo consultar el tipo de identificacion por el identificador deseado, porfavor revise la traza completa del error presentado para asi poder identificar que sucerdio";
			throw DataTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
			
		
		}catch (final Exception excepcion) {
			var mensajeUsuario = "Se ha presentado un problema tratando de consultar la informacion del tipo de identificación por el identificador deseado";
			var mensajeTecnico = "Se ha presentado un problema inesperado de tipo Exception en el metodo consultar el tipo de identificacion por el identificador deseado, porfavor revise la traza completa del error presentado para asi poder identificar que sucerdio";
			throw DataTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
		}
		
		return Optional.empty();
	}

	@Override
	public final List<TipoIdentificacionEntity> consultar(TipoIdentificacionEntity tipoIdentificacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
