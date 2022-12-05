package mundial;

import java.util.Date;

public class Partido {

    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

    public Partido(Date fecha, Equipo local, Equipo visitante, Resultado resultado) {
        super();
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
        this.resultado = resultado;
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + " " + local + " VS " + visitante + " Resultado: " + resultado;
    }
}

