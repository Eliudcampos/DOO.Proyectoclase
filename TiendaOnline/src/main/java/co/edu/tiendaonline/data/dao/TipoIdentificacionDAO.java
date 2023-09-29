package co.edu.tiendaonline.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import co.edu.tiendaonline.data.entity.TipoIdentificacionEntity;

public interface TipoIdentificacionDAO {
	void crear(TipoIdentificacionEntity tipoIdentificacion);
	
	void modificar(TipoIdentificacionEntity tipoIdentificacion);

	void eliminar(UUID id);
	
	Optional<TipoIdentificacionEntity> consultarPorId(UUID id);
	
	List<TipoIdentificacionEntity> consultar(TipoIdentificacionEntity tipoIdentificacion);
}
