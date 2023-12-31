package co.edu.tiendaonline.crosscutting.util;

import java.util.UUID;

public class UtilUUID {
	public static final UUID UUIDBASE = new UUID(0L, 0L);
	
	private UtilUUID() {
		super();	
	}
	
	public static final UUID generarRandomUUID() {
		return UUID.randomUUID();
	}
	
	public static final boolean esNulo(final UUID uuid) {
		return (uuid == null) || (uuid == UUIDBASE);
	}
	
	public static final UUID obtenerValorDefecto(final UUID uuid, final UUID valorDefecto) {		
		return esNulo(uuid) ? valorDefecto: uuid;
	}
}
