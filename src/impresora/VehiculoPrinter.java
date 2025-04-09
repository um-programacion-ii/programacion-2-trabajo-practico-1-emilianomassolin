package impresora;

import vehiculos.Camion;
import vehiculos.Auto;
import vehiculos.Vehiculo;

public class VehiculoPrinter {
    public void imprimir(Vehiculo v) {
        System.out.println("Patente: " + v.getPatente());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Año: " + v.getAnio());
        System.out.println("Capacidad de carga (kg): " + v.getCapacidadCargaKg());

        if (v instanceof Camion c) {
            System.out.println("¿Tiene acoplado?: " + (c.isTieneAcoplado() ? "Sí" : "No"));
        }

        if (v instanceof Auto a) {
            System.out.println("Cantidad de pasajeros: " + a.getCantidadPasajeros());
        }
    }
}

