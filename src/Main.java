import vehiculos.Vehiculo;
import vehiculos.VehiculoPrinter;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC123", "Ford", 2015, 1500.0);
        Vehiculo v2 = new Vehiculo("XYZ789", "Chevrolet", 2020, 1000.0);
        Vehiculo v3 = new Vehiculo("LMN456", "Toyota", 2018, 1200.0);

        VehiculoPrinter printer = new VehiculoPrinter();

        System.out.println("Vehículo 1:");
        printer.imprimir(v1);

        System.out.println("\nVehículo 2:");
        printer.imprimir(v2);

        System.out.println("\nVehículo 3:");
        printer.imprimir(v3);
    }
}
