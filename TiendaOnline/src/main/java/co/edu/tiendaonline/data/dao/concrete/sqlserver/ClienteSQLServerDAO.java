package co.edu.tiendaonline.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.tiendaonline.data.dao.ClienteDAO;
import co.edu.tiendaonline.data.dao.base.SQLDAO;
import co.edu.tiendaonline.data.entity.ClienteEntity;

public class ClienteSQLServerDAO extends SQLDAO implements ClienteDAO {

	public ClienteSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public final void crear(ClienteEntity cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public final void modificar(ClienteEntity cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public final void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public final Optional<ClienteEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public final List<ClienteEntity> consultar(ClienteEntity cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
