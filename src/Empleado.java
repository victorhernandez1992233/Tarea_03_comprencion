class Empleado extends Persona {

    // Atributos propios de Empleado (además de lo heredado)
    private double salarioBase; // 2) ENCAPSULAMIENTO: también private
    private String puesto;

    // 3) CONSTRUCTOR de la subclase
    public Empleado(String nombre, int edad, String puesto, double salarioBase) {
        super(nombre, edad);              // llama al constructor del PADRE (Persona)
        this.puesto = puesto;
        this.salarioBase = salarioBase;
        System.out.println("[Constructor Empleado] Puesto: " + puesto);
    }

    // Getter propio (encapsulamiento)
    public double getSalarioBase() {
        return salarioBase;
    }

    public String getPuesto() {
        return puesto;
    }

    public double calcularPago() {
        return salarioBase;
    }

    public void mostrarRecibo() {
        System.out.println(getNombre() + " (" + puesto + ") -> pago: $" + calcularPago());
    }
}
 