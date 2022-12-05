import mundial.Equipo;
import mundial.Grupo;
import mundial.Partido;
import mundial.Resultado;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args){

        Grupo C = new Grupo("Mundial Qatar 2022, Grupo C");

        //equipos
        Equipo Argentina = new Equipo("Argentina");
        Equipo Mexico = new Equipo("Mexico");
        Equipo arabiaSaudita = new Equipo("Arabia Saudita");
        Equipo Polonia = new Equipo("Polonia");

        //partidos
        Partido nro1 = new Partido(new Date(2022,10,22), Argentina, arabiaSaudita, new Resultado(1, 2, false,false));
        Partido nro2 = new Partido(new Date(2022,10,22), Polonia, Mexico, new Resultado(0,0, false, true));
        Partido nro3 = new Partido(new Date(2022,10,26), Argentina, Mexico, new Resultado(2,0, true, false));
        Partido nro4 = new Partido(new Date(2022,10,26), Polonia, arabiaSaudita, new Resultado(2,0, true, false));
        Partido nro5 = new Partido(new Date(2022,10,30), Argentina, Polonia, new Resultado(2,0, true, false));
        Partido nro6 = new Partido(new Date(2022,10,30), Mexico, arabiaSaudita, new Resultado(2,1, true, false));

        //se agregan los equipos al grupo C
        C.addEquipo(Argentina);
        C.addEquipo(arabiaSaudita);
        C.addEquipo(Polonia);
        C.addEquipo(Mexico);

        //se agregan los partidos al grupo C
        C.addPartido(nro1);
        C.addPartido(nro2);
        C.addPartido(nro3);
        C.addPartido(nro4);
        C.addPartido(nro5);
        C.addPartido(nro6);

        //impresion de pantalla
        System.out.println(C);
        

    }
}
