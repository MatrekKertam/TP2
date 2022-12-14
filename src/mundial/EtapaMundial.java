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

    public void addPartido(Partido partidos){
        this.partidos.add(partidos);
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public ArrayList<Partido> getPartidos(){
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public void addEquipo(Equipo equipos)   {
        this.equipos.add(equipos);
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public ArrayList<Equipo> getEquiposQueAvanzan(){
        return equipos;
    }
}
