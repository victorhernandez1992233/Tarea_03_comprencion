public class main {
    public static void main(String[] args) {

        System.out.println("=== 6) INSTANCIAS (OBJETOS) ===");

        Empleado miEmpleado = new Empleado("Laura", 28, "Analista", 1200.0);
        Gerente miGerente = new Gerente("Carlos", 40, 2000.0, 500.0);

        System.out.println("\n=== 4) USO DE MÉTODOS (heredados y propios) ===");
        miEmpleado.saludar();   // heredado de Persona
        miGerente.saludar();    // heredado de Persona (vía Empleado)
        miGerente.aprobarPresupuesto(); // método exclusivo de Gerente

        System.out.println("\n=== 2) ENCAPSULAMIENTO EN ACCIÓN ===");
        System.out.println(miEmpleado.getNombre() + " gana un salario base de $" + miEmpleado.getSalarioBase());
        miEmpleado.setEdad(-5); // el setter valida y rechaza el cambio

        System.out.println("\n=== 5) HERENCIA: mismo método, comportamiento distinto ===");
        miEmpleado.mostrarRecibo(); // usa calcularPago() de Empleado
        miGerente.mostrarRecibo();  // usa calcularPago() SOBRESCRITO en Gerente
    }
}