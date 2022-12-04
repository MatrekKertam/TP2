import mundial.Equipo;
import mundial.Grupo;
import mundial.Partido;
import mundial.Resultado;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args){



        Equipo Argentina = new Equipo("Argentina");
        Equipo Mexico = new Equipo("Mexico");
        Equipo arabiaSaudita = new Equipo("Arabia Saudita");
        Equipo Polonia = new Equipo("Polonia");

        Grupo C = new Grupo("Mundial Qatar 2022, Grupo C");

        Partido nro1 = new Partido(new Date(22/11/2022), Argentina, arabiaSaudita, new Resultado(1, 2, false,false));
        Partido nro2 = new Partido(new Date(22/11/2022), Polonia, Mexico, new Resultado(0,0, false, true));
        Partido nro3 = new Partido(new Date(26/11/2022), Argentina, Mexico, new Resultado(2,0, true, false));
        Partido nro4 = new Partido(new Date(26/11/2022), Polonia, arabiaSaudita, new Resultado(2,0, true, false));
        Partido nro5 = new Partido(new Date(30/11/2022), Argentina, Polonia, new Resultado(2,0, true, false));
        Partido nro6 = new Partido(new Date(30/11/2022), Mexico, arabiaSaudita, new Resultado(2,1, true, false));



        System.out.println(nro1);
    }
}
