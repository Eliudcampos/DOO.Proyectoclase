package co.edu.tiendaonline.service.dto;

import java.sql.Date;
import java.util.UUID;

import co.edu.tiendaonline.data.entity.support.CorreoElectronicoClienteEntity;
import co.edu.tiendaonline.data.entity.support.NombreCompletoClienteEntity;
import co.edu.tiendaonline.data.entity.support.NumeroTelefonoMovilClienteEntity;
import co.edu.tiendaonline.service.dto.support.CorreoElectronicoClienteDTO;
import co.edu.tiendaonline.service.dto.support.NombreCompletoClienteDTO;
import co.edu.tiendaonline.service.dto.support.NumeroTelefonoMovilClienteDTO;

public class ClienteDTO {

	private UUID id;
	private TipoIdentificacionDTO tipoIdentificacion;
	private String identificacion;
	private NombreCompletoClienteDTO nombreCompleto;
	private CorreoElectronicoClienteDTO correoElectronico;
	private NumeroTelefonoMovilClienteDTO numeroTelefonoMovil;
	private Date fechaNacimiento;
	
	public ClienteDTO() {
		setId(id);
		setTipoIdentificacion(new TipoIdentificacionDTO());
		setIdentificacion(identificacion);
		setNombreCompleto(nombreCompleto);
		setCorreoElectronico(correoElectronico);
		setNumeroTelefonoMovil(numeroTelefonoMovil);
		setFechaNacimiento(fechaNacimiento);
	}
	
	
	
	public ClienteDTO(final UUID id, final TipoIdentificacionDTO tipoIdentificacion, final String identificacion,
			final NombreCompletoClienteDTO nombreCompleto, final CorreoElectronicoClienteDTO correoElectronico,
			final NumeroTelefonoMovilClienteDTO numeroTelefonoMovil, final Date fechaNacimiento) {
		setId(id);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(identificacion);
		setNombreCompleto(nombreCompleto);
		setCorreoElectronico(correoElectronico);
		setNumeroTelefonoMovil(numeroTelefonoMovil);
		setFechaNacimiento(fechaNacimiento);
	}




	public final TipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public final String getIdentificacion() {
		return identificacion;
	}
	public final NombreCompletoClienteDTO getNombreCompleto() {
		return nombreCompleto;
	}
	public final CorreoElectronicoClienteDTO getCorreoElectronico() {
		return correoElectronico;
	}
	public final NumeroTelefonoMovilClienteDTO getNumeroTelefonoMovil() {
		return numeroTelefonoMovil;
	}
	public final Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public final ClienteDTO setId(UUID id) {
		this.id = id;
		return this;
	}
	public final ClienteDTO setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
		return this;
	}
	public final ClienteDTO setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
		return this;
	}
	public final ClienteDTO setNombreCompleto(NombreCompletoClienteDTO nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
		return this;
	}
	public final ClienteDTO setCorreoElectronico(CorreoElectronicoClienteDTO correoElectronico) {
		this.correoElectronico = correoElectronico;
		return this;
	}
	public final ClienteDTO setNumeroTelefonoMovil(NumeroTelefonoMovilClienteDTO numeroTelefonoMovil) {
		this.numeroTelefonoMovil = numeroTelefonoMovil;
		return this;
	}
	public final ClienteDTO setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		return this;
	}
	
	
	
}
