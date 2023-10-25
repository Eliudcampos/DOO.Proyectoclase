package co.edu.tiendaonline.service.dto;

import co.edu.tiendaonline.crosscutting.util.UtilTexto;

public class NombreCompletoClienteDTO {
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	
	public NombreCompletoClienteDTO() {
		setPrimerNombre(UtilTexto.VACIO);
		setSegundoNombre(UtilTexto.VACIO);
		setPrimerApellido(UtilTexto.VACIO);
		setSegundoApellido(UtilTexto.VACIO);
	}
	
	public NombreCompletoClienteDTO(final String primerNombre, final String segundoNombre, final String primerApellido,
			final String segundoApellido) {
		setPrimerNombre(primerNombre);
		setSegundoNombre(segundoNombre);
		setPrimerApellido(primerApellido);
		setSegundoApellido(segundoApellido);
	}
	
	public static final NombreCompletoClienteDTO crear() {
		return new NombreCompletoClienteDTO();
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

	public final NombreCompletoClienteDTO setPrimerNombre(final String primerNombre) {
		this.primerNombre = UtilTexto.obtenerValorDefecto(primerNombre, UtilTexto.VACIO);
		return this;
	}

	public final NombreCompletoClienteDTO setSegundoNombre(final String segundoNombre) {
		this.segundoNombre = UtilTexto.obtenerValorDefecto(segundoNombre, UtilTexto.VACIO);
		return this;
	}

	public final NombreCompletoClienteDTO setPrimerApellido(final String primerApellido) {
		this.primerApellido = UtilTexto.obtenerValorDefecto(primerApellido, UtilTexto.VACIO);
		return this;
	}

	public final NombreCompletoClienteDTO setSegundoApellido(final String segundoApellido) {
		this.segundoApellido = UtilTexto.obtenerValorDefecto(segundoApellido, UtilTexto.VACIO);
		return this;
	}
	
	
}
