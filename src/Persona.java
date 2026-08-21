class Persona {

    private String nombre;
    private int edad;

public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
    System.out.println("[Constructor Persona] Se registró a: " + nombre);
}

public String getNombre() {
    return nombre;
}

public int getEdad() {
    return edad;
}

public void setEdad(int nuevaEdad) {
    if (nuevaEdad > 0) {          // validación simple
        this.edad = nuevaEdad;
    } else {
        System.out.println("Edad inválida, no se actualizó.");
    }
}


public void saludar() {
    System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
}
}