package co.edu.tiendaonline.service.dto;

import java.util.UUID;

import co.edu.tiendaonline.crosscutting.util.UtilObjeto;
import co.edu.tiendaonline.crosscutting.util.UtilTexto;
import co.edu.tiendaonline.crosscutting.util.UtilUUID;

public class TipoIdentificacionDTO {

	private UUID id;
	private String codigo;
	private String nombre;
	private boolean estado;
	
	public TipoIdentificacionDTO() {
		setId(UtilUUID.UUIDBASE);
		setCodigo(UtilTexto.VACIO);
		setNombre(UtilTexto.VACIO);
		setEstado(false);
	}
	
	public TipoIdentificacionDTO(final UUID id, final String codigo, final String nombre, final boolean estado) {
		setId(id);
		setCodigo(codigo);
		setNombre(nombre);
		setEstado(estado);
	}
	
	public static final TipoIdentificacionDTO crear() {
		return new TipoIdentificacionDTO();
	}

	public final UUID getId() {
		return id;
	}
	
	public final TipoIdentificacionDTO setId(final UUID id) {
		this.id = UtilUUID.obtenerValorDefecto(id, UtilUUID.obtenerValorDefecto(id, UtilUUID.UUIDBASE));
		return this;
	}
	
	public final String getCodigo() {
		return codigo;
	}
	
	public final TipoIdentificacionDTO setCodigo(final String codigo) {
		this.codigo = UtilTexto.obtenerValorDefecto(UtilTexto.aplicarTrim(codigo), UtilTexto.VACIO);
		return this;
	}
	
	public final String getNombre() {
		return nombre;
	}
	
	public final TipoIdentificacionDTO setNombre(final String nombre) {
		this.nombre = UtilTexto.obtenerValorDefecto(UtilTexto.aplicarTrim(nombre), UtilTexto.VACIO);
		return this;
	}
	
	public final boolean isEstado() {
		return estado;
	}
	
	public final TipoIdentificacionDTO setEstado(final boolean estado) {
		this.estado = UtilObjeto.obtenerValorDefecto(estado, false);
		return this;
	}
}
