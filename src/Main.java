import mundial.Equipo;
import mundial.Grupo;
import mundial.Partido;
import mundial.Resultado;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args){

        //creacion de un grupo
        Grupo C = new Grupo("Mundial Qatar 2022, Grupo C");

        //equipos
        Equipo Argentina = new Equipo("Argentina");
        Equipo Mexico = new Equipo("Mexico");
        Equipo arabiaSaudita = new Equipo("Arabia Saudita");
        Equipo Polonia = new Equipo("Polonia");

        //se agregan los equipos al grupo C
        C.addEquipo(Argentina);
        C.addEquipo(arabiaSaudita);
        C.addEquipo(Polonia);
        C.addEquipo(Mexico);

        //partidos y agregado de puntos
        Partido nro1 = new Partido(new Date(2022,10,22), Argentina, arabiaSaudita, new Resultado(1, 2, false,false));
        Partido nro2 = new Partido(new Date(2022,10,22), Polonia, Mexico, new Resultado(0,0, false, true));
        Partido nro3 = new Partido(new Date(2022,10,26), Argentina, Mexico, new Resultado(2,0, true, false));
        Partido nro4 = new Partido(new Date(2022,10,26), Polonia, arabiaSaudita, new Resultado(2,0, true, false));
        Partido nro5 = new Partido(new Date(2022,10,30), Argentina, Polonia, new Resultado(2,0, true, false));
        Partido nro6 = new Partido(new Date(2022,10,30), Mexico, arabiaSaudita, new Resultado(2,1, true, false));
        Argentina.setPuntos(6);
        Polonia.setPuntos(4);
        Mexico.setPuntos(4);
        arabiaSaudita.setPuntos(3);


        //se agregan los partidos al grupo C
        C.addPartido(nro1);
        C.addPartido(nro2);
        C.addPartido(nro3);
        C.addPartido(nro4);
        C.addPartido(nro5);
        C.addPartido(nro6);

        //impresion de pantalla
        System.out.println(C);
        System.out.println("\nPuntos del grupo: \n\n" + Argentina.getNombre() + " tiene " + Argentina.getPuntos() + " puntos\n"
                + Polonia.getNombre() + " tiene " + Polonia.getPuntos() + " puntos\n"
                + Mexico.getNombre() + " tiene " + Mexico.getPuntos() + " puntos\n"
                + arabiaSaudita.getNombre() + " tiene " + arabiaSaudita.getPuntos() + " puntos\n");

        C.setEquipoQuePasa(Argentina);
        C.setEquipoQuePasa(Polonia);

        System.out.println("Equipos del grupo C que avanzaron: " + C.getEquiposQueAvanzan());

    }
}
