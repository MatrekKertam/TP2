package mundial;

import java.util.ArrayList;

public class EtapaMundial {

    private String descripcionEtapa;
    private ArrayList<Partido> partidos;
    private ArrayList<Equipo> equipos;

    EtapaMundial(){
        this.partidos = new ArrayList<Partido>();
        this.equipos = new ArrayList<Equipo>();
    }

    public String getDescripcionEtapa(){
        return descripcionEtapa;
    }

    public void addPartido(ArrayList<Partido> partidos){
        this.partidos = partidos;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public ArrayList<Partido> getPartidos(){
        return partidos;
    }

    public ArrayList<Equipo> getEquiposQueAvanzan(){
        return equipos;
    }
}
