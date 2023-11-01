package co.edu.tiendaonline.controller.support.response;

import java.util.ArrayList;
import java.util.List;

public class Respuesta<T> {

	private List<T> datos;
	private List<String> mensajes;
	
	
	
	public Respuesta() {
		super();
		setDatos(new ArrayList<>());
		setMensajes(new ArrayList<>());
	}
	
	public Respuesta (final List<T> datos, final List<String> mensajes) {
		super();
		setDatos(datos);
		setMensajes(mensajes);
	
	}

	public final List<T> getDatos(){
		return datos;
	}

	public final List<String> getMensajes() {
		return mensajes;
	}

	public final void setDatos(List<T> datos) {
		this.datos = datos;
	}

	public final void setMensajes(List<String> mensajes) {
		this.mensajes = mensajes;
	}
	
	
}
