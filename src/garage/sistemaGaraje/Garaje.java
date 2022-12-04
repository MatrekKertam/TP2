package garage.sistemaGaraje;

import garage.Vehiculos.Vehiculos;

import java.util.Date;

public class Garaje {

    private int capacidad;
    private Date horarioDeApertura;
    private String direccion;
    private int stockDeRuedas;
    private int precioDeRuedas;
    protected boolean espacioDisponible;
    private Vehiculos kilometrosTotales;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Date getHorarioDeApertura() {
        return horarioDeApertura;
    }

    public void setHorarioDeApertura(Date horarioDeApertura) {
        this.horarioDeApertura = horarioDeApertura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getStockDeRuedas() {
        return stockDeRuedas;
    }

    public void setStockDeRuedas(int stockDeRuedas) {
        this.stockDeRuedas = stockDeRuedas;
    }

    public int getPrecioDeRuedas() {
        return precioDeRuedas;
    }

    public void setPrecioDeRuedas(int precioDeRuedas) {
        this.precioDeRuedas = precioDeRuedas;
    }

    public boolean getEspacioDisponible() {
        return espacioDisponible;
    }

    public void setEspacioDisponible(boolean espacioDisponible) {
        this.espacioDisponible = espacioDisponible;
    }

    public Vehiculos getKilometrosTotales() {
        return kilometrosTotales;
    }

    public void setKilometrosTotales(Vehiculos kilometrosTotales) {
        this.kilometrosTotales = kilometrosTotales;
    }
}
