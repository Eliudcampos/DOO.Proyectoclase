package co.edu.tiendaonline.data.entity.support;

public class NombreCompletoClienteEntity {
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	
	private NombreCompletoClienteEntity(final String primerNombre, final String segundoNombre, final String primerApellido,
			final String segundoApellido) {
		setPrimerNombre(primerNombre);
		setSegundoNombre(segundoNombre);
		setPrimerApellido(primerApellido);
		setSegundoApellido(segundoApellido);
	}
	
	public static final NombreCompletoClienteEntity crear(final String primerNombre, final String segundoNombre, final String primerApellido,
			final String segundoApellido) {
		return new NombreCompletoClienteEntity(primerNombre, segundoNombre, primerApellido, segundoApellido);
	}

	private final void setPrimerNombre(final String primerNombre) {
		this.primerNombre = primerNombre;
	}

	private final void setSegundoNombre(final String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	private final void setPrimerApellido(final String primerApellido) {
		this.primerApellido = primerApellido;
	}

	private final void setSegundoApellido(final String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public final String getPrimerNombre() {
		return primerNombre;
	}

	public final String getSegundoNombre() {
		return segundoNombre;
	}

	public final String getPrimerApellido() {
		return primerApellido;
	}

	public final String getSegundoApellido() {
		return segundoApellido;
	}
}