package co.edu.tiendaonline.data.entity;

import java.util.UUID;

public final class TipoIdentificacionEntity {
	
	private UUID id;
	private String codigo;
	private String nombre;
	private boolean estado;
	
	private TipoIdentificacionEntity(final UUID id, final String codigo, final String nombre, final boolean estado) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
	
	}
	
	public static final TipoIdentificacionEntity crear (final UUID id, final String codigo, final String nombre, final boolean estado) {
		return new TipoIdentificacionEntity(id, codigo, nombre, estado);
	}
	
	

	private final void setId(UUID id) {
		this.id = id;
	}

	private final void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	private final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private final void setEstado(boolean estado) {
		this.estado = estado;
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
	
	
	
	
}
