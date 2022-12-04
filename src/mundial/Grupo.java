package mundial;

import java.util.ArrayList;

public class Grupo extends EtapaMundial {

    private ArrayList<Equipo> equipos;

    Grupo(){
        super();
    }

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return equipos;
    }
}
