package co.edu.tiendaonline.service.dto.support;

public class NumeroTelefonoMovilClienteDTO {
	private String numeroTelefonoMovil;
	private boolean numeroTelefonoMovilConfirmado;
	
	private NumeroTelefonoMovilClienteDTO(final String numeroTelefonoMovil, final boolean numeroTelefonoMovilConfirmado) {
		setNumeroTelefonoMovil(numeroTelefonoMovil);
		setNumeroTelefonoMovilConfirmado(numeroTelefonoMovilConfirmado);
	}

	public static final NumeroTelefonoMovilClienteDTO crear(final String numeroTelefonoMovil, final boolean numeroTelefonoMovilConfirmado) {
		return new NumeroTelefonoMovilClienteDTO(numeroTelefonoMovil, numeroTelefonoMovilConfirmado);
	}

	private final void setNumeroTelefonoMovil(final String numeroTelefonoMovil) {
		this.numeroTelefonoMovil = numeroTelefonoMovil;
	}

	private final void setNumeroTelefonoMovilConfirmado(final boolean numeroTelefonoMovilConfirmado) {
		this.numeroTelefonoMovilConfirmado = numeroTelefonoMovilConfirmado;
	}

	public final String getNumeroTelefonoMovil() {
		return numeroTelefonoMovil;
	}

	public final boolean isNumeroTelefonoMovilConfirmado() {
		return numeroTelefonoMovilConfirmado;
	}
}