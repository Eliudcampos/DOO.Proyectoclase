package co.edu.tiendaonline.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import co.edu.tiendaonline.data.entity.ClienteEntity;

public interface ClienteDAO {

	void crear(ClienteEntity cliente);
	
	void modificar(ClienteEntity cliente);

	void eliminar(UUID id);
	
	Optional<ClienteEntity> consultarPorId(UUID id);
	
	List<ClienteEntity> consultar(ClienteEntity cliente);
}
