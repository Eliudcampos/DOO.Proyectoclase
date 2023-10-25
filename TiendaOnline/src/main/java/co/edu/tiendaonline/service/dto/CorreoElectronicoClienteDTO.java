package co.edu.tiendaonline.service.dto;

import co.edu.tiendaonline.crosscutting.util.UtilObjeto;
import co.edu.tiendaonline.crosscutting.util.UtilTexto;

public class CorreoElectronicoClienteDTO {
	private String correoElectronico;
	private boolean correoElectronicoConfirmado;
	
	public CorreoElectronicoClienteDTO() {
		setCorreoElectronico(UtilTexto.VACIO);
		setCorreoElectronicoConfirmado(false);
	}
	
	public CorreoElectronicoClienteDTO(final String correoElectronico, final boolean correoElectronicoConfirmado) {
		setCorreoElectronico(correoElectronico);
		setCorreoElectronicoConfirmado(correoElectronicoConfirmado);
	}

	public static final CorreoElectronicoClienteDTO crear() {
		return new CorreoElectronicoClienteDTO();
	}
	
	public final String getCorreoElectronico() {
		return correoElectronico;
	}
	
	public final boolean isCorreoElectronicoConfirmado() {
		return correoElectronicoConfirmado;
	}

	public final CorreoElectronicoClienteDTO setCorreoElectronico(final String correoElectronico) {
		this.correoElectronico = UtilTexto.obtenerValorDefecto(UtilTexto.aplicarTrim(correoElectronico), UtilTexto.VACIO);
		return this;
	}

	public final CorreoElectronicoClienteDTO setCorreoElectronicoConfirmado(final boolean correoElectronicoConfirmado) {
		this.correoElectronicoConfirmado = UtilObjeto.obtenerValorDefecto(correoElectronicoConfirmado, false);
		return this;
	}
}
