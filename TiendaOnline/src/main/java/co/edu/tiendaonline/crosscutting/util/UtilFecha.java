package co.edu.tiendaonline.crosscutting.util;

import java.sql.Date;
import java.util.Objects;

public class UtilFecha {
    public static final Date FECHABASE = Date.valueOf("2500-12-31");

    private UtilFecha() {
        super();
    }

    public static final boolean esNulo(final Date fecha) {
        return Objects.isNull(fecha) || fecha == FECHABASE;
    }

    public static final Date obtenerValorDefecto(final Date fecha, final Date valorDefecto) {
        return esNulo(fecha) ? valorDefecto : fecha;
    }
}

