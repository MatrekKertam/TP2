package mundial;

import java.util.ArrayList;

public class Grupo extends EtapaMundial {

    private ArrayList<Equipo> equipos;

    Grupo() {
        super();
    }

    public Grupo(String descripcionEtapa){
        super();
        setDescripcionEtapa(descripcionEtapa);
        this.equipos = new ArrayList<>();

    }
    public void setEquipoQuePasa(Equipo equipos){
        this.equipos.add(equipos);
    }
    @Override
    public ArrayList<Partido> getPartidos() {
        return super.getPartidos();
    }

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return equipos;
    }

    @Override
    public String toString() {
        return getDescripcionEtapa() +"\nEquipos: " + getEquipos() +"\nPartidos: " + getPartidos();
    }
}
