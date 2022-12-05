package mundial;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Partido> partidosJugados;
    private int puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getPuntos(){
        return puntos;
    }

    public void setPuntos(int puntos){
        this.puntos= puntos;
    }


    @Override
    public String toString() {
        return nombre;
    }
}
