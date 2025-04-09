package vehiculos;

public class VehiculoPrinter {
    public void imprimir(Vehiculo v) {
        System.out.println("Patente: " + v.getPatente());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Año: " + v.getAnio());
        System.out.println("Capacidad de carga (kg): " + v.getCapacidadCargaKg());
    }
}
