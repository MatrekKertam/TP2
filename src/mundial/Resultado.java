package mundial;

public class Resultado {

    private int golesLocal;
    private int golesVisitante;
    private boolean ganoLocal;
    private boolean empato;

    public Resultado(int golesLocal, int golesVisitante, boolean gano, boolean empato) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.ganoLocal = ganoLocal;
        this.empato = empato;
    }

    public int getGolesLocal(){
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public boolean ganoLocal(){
        return ganoLocal;
    }
    public boolean empate(){
        return empato;
    }

    @Override
    public String toString() {
        return  "Goles del equipo local= " + golesLocal +
                " Goles del equipo visitante= " + golesVisitante +
                ", Gano el equipo local: " + ganoLocal +
                ", Empataron: " + empato;
    }
}
