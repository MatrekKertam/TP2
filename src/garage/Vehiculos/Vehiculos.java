package garage.Vehiculos;

import garage.sistemaGaraje.Garaje;

public class Vehiculos extends Garaje {

    private String motor;
    private int cantidadDeCombustible;
    private String patente;
    private String marca;
    private int ruedas;
    private int kilometros;
    private String aviso;

    @Override
    public boolean getEspacioDisponible() {
        if (espacioDisponible=false) {
            System.out.println("No hay más lugar en el garage");
        }
        else{
            System.out.println("Hay espacio disponible");
        }
        return super.getEspacioDisponible();
    }
}



