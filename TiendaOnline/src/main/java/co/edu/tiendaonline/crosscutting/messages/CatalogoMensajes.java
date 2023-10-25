package co.edu.tiendaonline.crosscutting.messages;

import java.util.HashMap;
import java.util.Map;

import co.edu.tiendaonline.crosscutting.exception.concrete.CrosscuttingTiendaOnlineException;
import co.edu.tiendaonline.crosscutting.messages.enumerator.CategoriaMensaje;
import co.edu.tiendaonline.crosscutting.messages.enumerator.CodigoMensaje;
import co.edu.tiendaonline.crosscutting.messages.enumerator.TipoMensaje;
import co.edu.tiendaonline.crosscutting.util.UtilObjeto;

public final class CatalogoMensajes {
	
	private static final Map<CodigoMensaje, Mensaje> MENSAJES = new HashMap<>();
	
	static {
		cargarMensajes();
	}
	
	private CatalogoMensajes() {
		super();
	}
	
	private static final void cargarMensajes() {
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000001, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"No se recibió el codigo del mensaje que se queria crear. No es posible continuar con el proceso..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000002, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"No existe un mensaje con el código indicado. No es posible continuar con el proceso..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000003, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"No es posible obtener un mensaje con un código vacío o nulo. No es posible continuar con el proceso..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000004, TipoMensaje.USUARIO, CategoriaMensaje.FATAL, 
				"Se ha presentado un problema inesperado tratando de llevar a cabo la opereación deseada. Por favor intente de nuevo y si el problema persiste, contacte al administrador de la aplicación"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000005, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de validar si la conexión SQL estaba abierta. Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000006, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de validar si la conexión SQL estaba abierta. Se presento una excepción inesperada. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000007, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de cerrar la conexión SQL, la conexión esta nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000008, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de cerrar la conexión SQL, la conexión no se encontraba abierta"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000009, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de validar si la conexión SQL estaba abierta, la conexión se encontraba nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000010, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de cerrar la conexión SQL. Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000011, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de cerrar la conexión SQL. Se presento una excepción inesperada. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000012, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de iniciar la transacción SQL, la conexión esta nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000013, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de iniciar la transacción, la conexión no se encontraba abierta"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000014, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de iniciar la transacción. Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000015, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de iniciar la transacción. Se presento una excepción inesperada. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000017, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de iniciar la transacción, la conexión no se encontraba abierta"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000018, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de iniciar la transacción, la transacción ya ha sido inciada..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000016, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de confirmar la transacción SQL, la conexión esta nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000028, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de cancelar la transacción SQL, la conexión esta nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000019, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de confirmar la transacción, la conexión no se encontraba abierta"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000029, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de cancelar la transacción, la conexión no se encontraba abierta"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000020, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de confirmar la transacción, la transacción ya ha sido confirmada"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000030, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de cancelar la transacción, la transacción ya ha sido confirmada"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000021, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de confirmar la transacción. Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000031, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de cancelar la transacción. Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000022, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de confirmar la transacción. Se presento una excepción inesperada. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000032, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de cancelar la transacción. Se presento una excepción inesperada. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000023, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema al crear la conexión SQL. No se ha podido obtener las variables de entorno"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000024, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de crear la conexión SQL. Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000025, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de crear la conexión SQL. Se presento una excepción inesperada. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000026, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de conecatar con la base de datos. Motor de base de datos que se trata de conectar no usado por la app..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000027, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de crear DAO deseado. La conexión esta cerrada..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000033, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de insertar un tipo de identificación en la base de datos.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000034, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de insertar un tipo de identificación en la base de datos.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000035, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de preparar la consulta por id un tipo de identificación en la base de datos.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000036, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema inesperado tratando de preparar la consulta por id de un tipo identificación en la base de datos.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000037, TipoMensaje.USUARIO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de consultar la información del tipo de identificación deseado"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000038, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de procesar los datos de una consulta por id un tipo de identificación en la base de datos.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000039, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de modificar un tipo de identificación en la base de datos.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000040, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de modificar un tipo de identificación en la base de datos.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000041, TipoMensaje.USUARIO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de modificar el tipo de identificación deseado"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000042, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de eliminar un tipo de identificación en la base de datos.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000043, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de eliminar un tipo de identificación en la base de datos.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000044, TipoMensaje.USUARIO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de eliminar el tipo de identificación deseado"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000045, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado tratando de procesar los datos de una consulta por id un tipo de identificación en la base de datos.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000046, TipoMensaje.USUARIO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de consultar el tipo de identificación deseado"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000047, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema función colocarParametrosConsulta en TipoIdentificaciónDAO tratando de consultar tipos de identificación.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000048, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado en función colocarParametrosConsulta en TipoIdentificaciónDAO tratando de consultar tipos de identificación.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000049, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en consultar TipoIdentificaciónDAO tratando de consultar tipos de identificación.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000050, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado en consultar TipoIdentificaciónDAO tratando de consultar tipos de identificación.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000051, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en función ejecutarConsulta en TipoIdentificaciónDAO tratando de consultar tipos de identificación.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000052, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado en función ejecutarConsulta en TipoIdentificaciónDAO tratando de consultar tipos de identificación.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000053, TipoMensaje.USUARIO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de insertar el tipo de identificación deseado"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000054, TipoMensaje.USUARIO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de insetart el cliente deseado"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000055, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de insertar un cliente en la base de datos.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000056, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de insertar un cliente en la base de datos.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000057, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de modificar un cliente en la base de datos.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000058, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de modificar un cliente en la base de datos.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000059, TipoMensaje.USUARIO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de modificar el cliente deseado"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000060, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de eliminar un cliente en la base de datos.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000061, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de eliminar un cliente en la base de datos.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000062, TipoMensaje.USUARIO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de eliminar el cliente deseado"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000063, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de preparar la consulta por id un cliente en la base de datos.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000064, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema inesperado tratando de prepar la consulta por id de un cliente en la base de datos.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000065, TipoMensaje.USUARIO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de consultar la información del cliente deseado"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000066, TipoMensaje.TECNICO, CategoriaMensaje.ERROR, 
				"Se ha presentado un problema tratando de procesar los datos de una consulta por id un cliente en la base de datos.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000067, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado tratando de procesar los datos de una consulta por id un cliente en la base de datos.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000068, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema función colocarParametrosConsulta en ClienteDAO tratando de consultar clientes.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000069, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado en función colocarParametrosConsulta en ClienteDAO tratando de consultar clientes.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000070, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en función ejecutarConsulta en ClienteDAO tratando de consultar clientes.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000071, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado en función ejecutarConsulta en ClienteDAO tratando de consultar clientes.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000072, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en consultar ClienteDAO tratando de consultar clientes.Se presento una excepción de tipo SQLException. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000073, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado en consultar ClienteDAO tratando de consultar clientes.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000074, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo toDomain de la clase TipoIdentificaciónEntityMapper.No es posible mapear un tipo de identificación dominio a partir de una entidad de tipo identificación entity nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000075, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo toEntity de la clase TipoIdentificaciónEntityMapper.No es posible mapear un tipo de identificación entity  a partir de una entidad de tipo identificación dominio nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000076, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de llevar a cabo el registro de datos de un nuevo tipo de identificación"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000077, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo setFactoria de la clase RegistroTipoIdentificaciónUseCase.Debido a que la factoria con la cual se desea crear esta nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000078, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"Ya existe un tipo de identificación con ese nombre"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000079, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"Ya existe un tipo de identificación con ese codigo"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000080, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo toDomain de la clase CorreoElectronicoClienteEntityMapper.No es posible mapear un correo electronico cliente a partir de una entidad de correo electronico entity nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000081, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo toEntity de la clase CorreoElectronicoClienteEntityMapper.No es posible mapear un correo electronico cliente entity  a partir de una entidad de correo electronico cliente dominio nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000082, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo toDomain de la clase NombreCompletoClienteEntityMapper.No es posible mapear un nombre completo cliente a partir de una entidad de nombre completo cliente entity nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000083, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo toEntity de la clase NombreCompletoClienteEntityMapper.No es posible mapear un cnombre completo cliente entity  a partir de una entidad de nombre completo cliente dominio nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000084, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo toDomain de la clase NumeroTelefonoMovilClienteEntityMapper.No es posible mapear un numero de telefono movil cliente a partir de una entidad de numero de telefono movil cliente entity nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000085, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo toEntity de la clase NumeroTelefonoMovilClienteEntityMapper.No es posible mapear un numero de telefono movil cliente entity  a partir de una entidad de numero de telefono movil cliente dominio nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000086, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo toDomain de la clase ClienteEntityMapper.No es posible mapear un cliente dominio a partir de una entidad de cliente entity nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000087, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo toEntity de la clase ClienteEntityMapper.No es posible mapear un cliente entity  a partir de una entidad de cliente dominio nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000088, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de llevar a cabo la consulta de datos de un tipo de identificación"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000089, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo setFactoria de la clase ConsultarTipoIdentificaciónUseCase.Debido a que la factoria con la cual se desea crear esta nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000090, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de llevar a cabo la actualización de datos de un nuevo tipo de identificación"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000091, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo setFactoria de la clase ActualizarTipoIdentificaciónUseCase.Debido a que la factoria con la cual se desea crear esta nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000092, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No existe un tipo de identificación existen a actualizar"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000093, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No se puede actualizar tipo de identificación. Ya existe un tipo de identificación con ese codigo"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000094, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No se puede actualizar tipo de identificación. Ya existe un tipo de identificación con ese nombre"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000095, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de eliminar un tipo de identificación"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000096, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo setFactoria de la clase EliminarTipoIdentifaciónUseCase.Debido a que la factoria con la cual se desea crear esta nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000097, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No existe un tipo de identificación existente a eliminar"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000098, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"El tipo de identificación a elimianr es utilizado actualmente por clientes"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000099, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de llevar a cabo el registro de datos de un nuevo cliente"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000100, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo setFactoria de la clase RegistrarClienteUseCase.Debido a que la factoria con la cual se desea crear esta nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000101, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No se puede registrar el cliente. Ya existe un tipo cliente con ese nombre completo registrado"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000102, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No se puede registrar el cliente. Ya existe un tipo cliente con el correo electronico registrado"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000103, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No se puede registrar el cliente. Ya existe un tipo cliente con el numero telefono movil registrado"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000104, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No se puede registrar el cliente. Ya existe un tipo cliente con el tipo de identificación e identificación registrado"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000105, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de llevar eliminar un cliente"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000106, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo setFactoria de la clase EliminarClienteUseCase.Debido a que la factoria con la cual se desea crear esta nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000107, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No se puede eliminar el cliente. El cliente a eliminar no esta registrado"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000108, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de modificar los datos de un nuevo cliente"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000109, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo setFactoria de la clase ModificarClienteUseCase.Debido a que la factoria con la cual se desea crear esta nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000110, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No se puede modificar el cliente deseado. Ya existe un tipo cliente con el tipo de identificación e identificación a modificar"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000111, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No se puede modificar el cliente deseado. Ya existe un tipo cliente con el correo electronico a modificar"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000112, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No se puede modificar el cliente deseado. Ya existe un tipo cliente con el correo electronico a modificar"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000113, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No se puede modificar el cliente deseado. Ya existe un tipo cliente con ese nombre completo a modificar"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000114, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No existe un tipo de identificación existente a modificar"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000115, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de llevar a cabo la consulta de datos de un cliente"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000116, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo setFactoria de la clase ConsultarClienteUseCase.Debido a que la factoria con la cual se desea crear esta nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000117, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"La longitud del codigo de tipo identificación no es valida. La longitud maxima son 50 caracteres"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000118, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"El codigo de tipo identificación es un dato obligatorio"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000119, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"El codigo de tipo identificación solo puede contener letras"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000120, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"La longitud del nombre de tipo identificación no es valida. La longitud maxima son 100 caracteres"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000121, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"El nombre de tipo identificación es un dato obligatorio"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000122, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"El nombre de tipo identificación solo puede contener letras, digitos y espacios internos"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000123, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"El identificador de tipo identificación es un dato obligatorio y no puede ser igual al UUID por defecto"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000124, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"No es posible llevar a cabo la operación deseada con el tipo de identificación"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000125, TipoMensaje.USUARIO, CategoriaMensaje.ERROR,
				"Se presento un error inesperado tratando de registrar un nuevo tipo de identificación"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000126, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado en función execute en RegistrarTipoIdentificaciónFacade tratando de insertar un nuevo tipo de identificación.Se presento una excepción de tipo Exception. Por favor verifique la traza del error presentado..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000127, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo toEntity de la clase TipoIdentificaciónEntityMapper.No es posible mapear un tipo de identificación entity a partir de una entidad de tipo identificación domain nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000128, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo toDomain de la clase TipoIdentificaciónDTOMapper.No es posible mapear un tipo de identificación domain a partir de una entidad de tipo identificación dto nula"));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000129, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema en el metodo toDTO de la clase TipoIdentificaciónDTOMapper.No es posible mapear un tipo de identificación dto a partir de una entidad de tipo identificación domain nula"));
	}
	
	private static final void agregarMensaje(final Mensaje mensaje) {
		MENSAJES.put(mensaje.getCodigo(), mensaje);
	}
	
	public static final Mensaje obtenerMensaje(final CodigoMensaje codigo) {
		
		if(UtilObjeto.esNulo(codigo)) {
			var  mensajeUsuario = obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			var  mensajeTecnico = obtenerContenidoMensaje(CodigoMensaje.M0000000003);
			throw CrosscuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
		}
		
		if(!MENSAJES.containsKey(codigo)) {
			var  mensajeUsuario = obtenerContenidoMensaje(CodigoMensaje.M0000000004);
			var  mensajeTecnico = obtenerContenidoMensaje(CodigoMensaje.M0000000002);
			throw CrosscuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);			
		}
		
		return MENSAJES.get(codigo);
	}
	
	public static final String obtenerContenidoMensaje(final CodigoMensaje codigo) {
		return obtenerMensaje(codigo).getContenido();
	}
}
