package co.edu.tiendaonline.crosscutting.util;

public final class UtilObjeto {
	
	private UtilObjeto() {
		super();	
	}
	
	public static final <O> boolean esNulo(final O objeto) {
		return objeto == null;
	}
	
	public static final <O> O obtenerValorDefecto(final O objeto, final O valorDefecto) {		
		return esNulo(objeto) ? valorDefecto: objeto;
	}
}
