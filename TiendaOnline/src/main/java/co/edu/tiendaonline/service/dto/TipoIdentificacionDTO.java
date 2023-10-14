package co.edu.tiendaonline.service.dto;

import java.util.UUID;

import co.edu.tiendaonline.crosscutting.util.UtilTexto;

public class TipoIdentificacionDTO {
	private UUID id;
	private String codigo;
	private String nombre;
	private boolean estado;
	
	public TipoIdentificacionDTO () {
		setId(id);
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
	public final String getCodigo() {
		return codigo;
	}
	public final String getNombre() {
		return nombre;
	}
	public final boolean isEstado() {
		return estado;
	}
	public final TipoIdentificacionDTO setId(UUID id) {
		this.id = id;
		return this;
	}
	public final TipoIdentificacionDTO setCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}
	public final TipoIdentificacionDTO setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	public final TipoIdentificacionDTO setEstado(boolean estado) {
		this.estado = estado;
		return this;
	}

	
}
