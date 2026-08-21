class Gerente extends Empleado {

    private double bono;

    public Gerente(String nombre, int edad, double salarioBase, double bono) {
        super(nombre, edad, "Gerente", salarioBase); // 3) CONSTRUCTOR del padre (Empleado)
        this.bono = bono;
        System.out.println("[Constructor Gerente] Bono asignado: $" + bono);
    }

    // 4) MÉTODO sobrescrito: mismo nombre/firma que en Empleado,
    //    pero con un cálculo distinto (incluye el bono).
    @Override
    public double calcularPago() {
        return getSalarioBase() + bono;
    }

    // Método propio, exclusivo de Gerente
    public void aprobarPresupuesto() {
        System.out.println(getNombre() + " aprueba el presupuesto del área.");
    }
}
 