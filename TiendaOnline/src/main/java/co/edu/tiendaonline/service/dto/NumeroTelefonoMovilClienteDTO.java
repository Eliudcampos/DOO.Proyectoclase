package co.edu.tiendaonline.service.dto;

import co.edu.tiendaonline.crosscutting.util.UtilObjeto;
import co.edu.tiendaonline.crosscutting.util.UtilTexto;

public class NumeroTelefonoMovilClienteDTO {
	private String numeroTelefonoMovil;
	private boolean numeroTelefonoMovilConfirmado;
	
	public NumeroTelefonoMovilClienteDTO() {
		setNumeroTelefonoMovil(UtilTexto.VACIO);
		setNumeroTelefonoMovilConfirmado(false);
	}
	
	public NumeroTelefonoMovilClienteDTO(final String numeroTelefonoMovil, final boolean numeroTelefonoMovilConfirmado) {
		setNumeroTelefonoMovil(numeroTelefonoMovil);
		setNumeroTelefonoMovilConfirmado(numeroTelefonoMovilConfirmado);
	}
	
	public static final NumeroTelefonoMovilClienteDTO crear() {
		return new NumeroTelefonoMovilClienteDTO();
	}

	public final String getNumeroTelefonoMovil() {
		return numeroTelefonoMovil;
	}
	
	public final boolean isNumeroTelefonoMovilConfirmado() {
		return numeroTelefonoMovilConfirmado;
	}

	public final NumeroTelefonoMovilClienteDTO setNumeroTelefonoMovil(final String numeroTelefonoMovil) {
		this.numeroTelefonoMovil = UtilTexto.obtenerValorDefecto(numeroTelefonoMovil, UtilTexto.VACIO);
		return this;
	}

	public final NumeroTelefonoMovilClienteDTO setNumeroTelefonoMovilConfirmado(final boolean numeroTelefonoMovilConfirmado) {
		this.numeroTelefonoMovilConfirmado = UtilObjeto.obtenerValorDefecto(numeroTelefonoMovilConfirmado, false);
		return this;
	}
	
	
}
