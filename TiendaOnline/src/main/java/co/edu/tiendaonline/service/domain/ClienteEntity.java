package co.edu.tiendaonline.service.domain;

import java.sql.Date;
import java.util.UUID;
import co.edu.tiendaonline.data.entity.support.CorreoElectronicoClienteEntity;
import co.edu.tiendaonline.data.entity.support.NombreCompletoClienteEntity;
import co.edu.tiendaonline.data.entity.support.NumeroTelefonoMovilClienteEntity;

public class ClienteEntity {
	private UUID id;
	private TipoIdentificacionEntity tipoIdentificacion;
	private String identificacion;
	private NombreCompletoClienteEntity nombreCompleto;
	private CorreoElectronicoClienteEntity correoElectronico;
	private NumeroTelefonoMovilClienteEntity numeroTelefonoMovil;
	private Date fechaNacimiento;
	
	private ClienteEntity(final UUID id, final TipoIdentificacionEntity tipoIdentificacion, final String identificacion,
			final NombreCompletoClienteEntity nombreCompleto, final CorreoElectronicoClienteEntity correoElectronico,
			final NumeroTelefonoMovilClienteEntity numeroTelefonoMovil, final Date fechaNacimiento) {
		setId(id);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(identificacion);
		setNombreCompleto(nombreCompleto);
		setCorreoElectronico(correoElectronico);
		setNumeroTelefonoMovil(numeroTelefonoMovil);
		setFechaNacimiento(fechaNacimiento);
	}
	
	public static final ClienteEntity crear(final UUID id, final TipoIdentificacionEntity tipoIdentificacion, final String identificacion,
			final NombreCompletoClienteEntity nombreCompleto, final CorreoElectronicoClienteEntity correoElectronico,
			final NumeroTelefonoMovilClienteEntity numeroTelefonoMovil, final Date fechaNacimiento) {
		return new ClienteEntity(id, tipoIdentificacion, identificacion, nombreCompleto, correoElectronico, numeroTelefonoMovil, fechaNacimiento);
	}

	private final void setId(final UUID id) {
		this.id = id;
	}

	private final void setTipoIdentificacion(final TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	private final void setIdentificacion(final String identificacion) {
		this.identificacion = identificacion;
	}

	private final void setNombreCompleto(final NombreCompletoClienteEntity nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	private final void setCorreoElectronico(final CorreoElectronicoClienteEntity correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	private final void setNumeroTelefonoMovil(final NumeroTelefonoMovilClienteEntity numeroTelefonoMovil) {
		this.numeroTelefonoMovil = numeroTelefonoMovil;
	}

	private final void setFechaNacimiento(final Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public final UUID getId() {
		return id;
	}

	public final TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public final String getIdentificacion() {
		return identificacion;
	}

	public final NombreCompletoClienteEntity getNombreCompleto() {
		return nombreCompleto;
	}

	public final CorreoElectronicoClienteEntity getCorreoElectronico() {
		return correoElectronico;
	}

	public final NumeroTelefonoMovilClienteEntity getNumeroTelefonoMovil() {
		return numeroTelefonoMovil;
	}

	public final Date getFechaNacimiento() {
		return fechaNacimiento;
	}
}
