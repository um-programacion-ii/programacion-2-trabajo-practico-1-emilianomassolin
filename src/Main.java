import vehiculos.Vehiculo;
import vehiculos.Camion;
import impresora.VehiculoPrinter;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("ABC123", "Ford", 2015, 1500.0);
        Camion v2 = new Camion("XYZ789", "Mercedes", 2018, 8000.0, true);
        Camion v3 = new Camion("LMN456", "Volvo", 2020, 10000.0, false);

        VehiculoPrinter printer = new VehiculoPrinter();

        System.out.println("Vehículo 1:");
        printer.imprimir(v1);

        System.out.println("\nVehículo 2:");
        printer.imprimir(v2);

        System.out.println("\nVehículo 3:");
        printer.imprimir(v3);
    }
}
