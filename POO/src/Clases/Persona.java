package Clases;

class Persona {

    String nombre = "Jorge";
    int edad = 21;
    double peso = 86.30;
    boolean soltero = true;

    String getSaludo(){ //metodo get
        return "Hola a todos";
    }

    int getEdad() {
        return edad;
    }

    //crear metodo set
    void DimePeso() {
        if (peso > 70 && edad > 30){
            System.out.println(nombre + " Debe hacer ejercicio");
        } else{
            System.out.println(nombre + " estas en tu peso correcto");
        }
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println(persona1.getSaludo() + "\n" + "Mi edad es: " + persona1.getEdad());
        persona1.DimePeso();
    }
}
