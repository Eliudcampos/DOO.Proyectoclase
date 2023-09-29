package co.edu.tiendaonline.data.dao.daofactory.concrete;

import java.sql.Connection;

import co.edu.tiendaonline.data.dao.ClienteDAO;
import co.edu.tiendaonline.data.dao.TipoIdentificacionDAO;
import co.edu.tiendaonline.data.dao.concrete.sqlserver.ClienteSQLServerDAO;
import co.edu.tiendaonline.data.dao.concrete.sqlserver.TipoIdentificacionSQLServerDAO;
import co.edu.tiendaonline.data.dao.daofactory.DAOFactory;

public final class SQLServerDAOFactory extends DAOFactory  {

	private Connection conexion;
	
	public SQLServerDAOFactory() {
		abrirConexion();
	}
	
	@Override
	protected final void abrirConexion() {
		// TODO Your homework will be obtein connection with SQL Server database Auto-generated method stub
		conexion = null;
	}

	@Override
	public final void cerrarConexion() {
		// TODO Your homework will be to close connection
		
	}

	@Override
	public void iniciarTransaccion() {
		// TODO Your homework will be to init transaction
		
	}

	@Override
	public void confirmarTransaccion() {
		// TODO Your homework will be to commit transaction
		
	}

	@Override
	public void cancelarTransaccion() {
		// TODO Your homework will be rollback transaction
		
	}

	@Override
	public ClienteDAO obtenerClienteDAO() {
		// TODO Auto-generated method stub
		return new ClienteSQLServerDAO(conexion);
	}

	@Override
	public TipoIdentificacionDAO obtenerTipoIdentificacionDAO() {
		// TODO Auto-generated method stub
		return new TipoIdentificacionSQLServerDAO(conexion);
	}

	
	
}
