import vehiculos.Vehiculo;
import vehiculos.Camion;
import vehiculos.Auto;
import impresora.VehiculoPrinter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Agregar vehículos
        vehiculos.add(new Vehiculo("ABC123", "Ford", 2015, 1500.0));
        vehiculos.add(new Camion("XYZ789", "Mercedes", 2018, 8000.0, true));
        vehiculos.add(new Camion("LMN456", "Volvo", 2020, 10000.0, false));
        vehiculos.add(new Auto("JKL321", "Toyota", 2022, 500.0, 5));

        VehiculoPrinter printer = new VehiculoPrinter();

        // Imprimir todos los vehículos
        System.out.println("===== LISTADO DE VEHÍCULOS =====");
        for (Vehiculo v : vehiculos) {
            printer.imprimir(v);
            System.out.println("----------------------------");
        }

        // Búsqueda por patente
        Scanner scanner = new Scanner(System.in);
        System.out.print("🔍 Ingrese una patente para buscar: ");
        String patenteBuscada = scanner.nextLine();

        Vehiculo encontrado = buscarPorPatente(vehiculos, patenteBuscada);

        if (encontrado != null) {
            System.out.println("\n Vehículo encontrado:");
            printer.imprimir(encontrado);
        } else {
            System.out.println("\n No se encontró un vehículo con esa patente.");
        }

        scanner.close();
    }

    /**
     * Busca un vehículo en la lista por su patente (sin importar mayúsculas/minúsculas).
     */
    public static Vehiculo buscarPorPatente(ArrayList<Vehiculo> lista, String patente) {
        for (Vehiculo v : lista) {
            if (v.getPatente().equalsIgnoreCase(patente)) {
                return v;
            }
        }
        return null;
    }
}
