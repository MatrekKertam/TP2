package mundial;

import java.util.ArrayList;

public class Llave extends EtapaMundial{

    private ArrayList<Equipo> equipos;

    Llave(){
        super();
    }

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return equipos;
    }
}

