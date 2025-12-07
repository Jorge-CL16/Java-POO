package Clases;

//Creacion de una clase
class Automovil {

    //Crear atributos para una clase
    String marca = "Honda";
    String modelo = "CRV";
    int anio = 2025;
    int cant_ruedas = 4;
    boolean camara = true;


    public static void main(String[] args) {
        //instanciar una clase / crear un objeto
        Automovil auto1 = new Automovil();

        //consultar valores de los objetos
        System.out.println("Marca: " + auto1.marca);
        System.out.println("Modelo: " + auto1.modelo);
        System.out.println("Año: " + auto1.anio);
        System.out.println("cantidad de ruedas: " + auto1.cant_ruedas);
        System.out.println("Cuenta con camara: " + auto1.camara);

    }
}