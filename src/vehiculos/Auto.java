package vehiculos;

/**
 * Clase que representa un auto, subclase de Vehiculo.
 */
public class Auto extends Vehiculo {
    private int cantidadPasajeros;

    public Auto(String patente, String marca, int anio, double capacidadCargaKg, int cantidadPasajeros) {
        super(patente, marca, anio, capacidadCargaKg);
        if (cantidadPasajeros <= 0) {
            throw new IllegalArgumentException("La cantidad de pasajeros debe ser mayor a cero.");
        }
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        if (cantidadPasajeros <= 0) {
            throw new IllegalArgumentException("La cantidad de pasajeros debe ser mayor a cero.");
        }
        this.cantidadPasajeros = cantidadPasajeros;
    }
}
