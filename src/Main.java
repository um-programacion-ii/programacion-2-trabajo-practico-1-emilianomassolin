import vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        // Crear 3 vehículos
        Vehiculo v1 = new Vehiculo("ABC123", "Ford", 2015, 1500.0);
        Vehiculo v2 = new Vehiculo("XYZ789", "Chevrolet", 2020, 1000.0);
        Vehiculo v3 = new Vehiculo("LMN456", "Toyota", 2018, 1200.0);

        // Mostrar la info de cada uno
        System.out.println("Vehículo 1:");
        imprimirVehiculo(v1);

        System.out.println("\nVehículo 2:");
        imprimirVehiculo(v2);

        System.out.println("\nVehículo 3:");
        imprimirVehiculo(v3);
    }

    private static void imprimirVehiculo(Vehiculo v) {
        System.out.println("Patente: " + v.getPatente());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Año: " + v.getAnio());
        System.out.println("Capacidad de carga (kg): " + v.getCapacidadCargaKg());
    }
}
