public class Persona {

    String nombre;
    String apellido;
    int edad;
    double altura;

    public String mostrarNombre() {
        System.out.println("Me llamo " + this.nombre);
        return nombre;
    }

    public String mostrarApellido() {
        System.out.println("Mi apellido es " + this.apellido);
        return apellido;
    }

    public int mostrarEdad() {
        System.out.println("Tengo " + this.edad);
        return edad;
    }

    public double mostrarAltura() {
        System.out.println("Mido " + this.altura);
        return altura;
    }

}