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

    @Override
    public ArrayList<Partido> getPartidos() {
        return super.getPartidos();
    }

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return super.getEquiposQueAvanzan();
    }
}
