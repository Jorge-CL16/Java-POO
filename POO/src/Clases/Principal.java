package Clases;

import java.util.Scanner;

class Cliente{

    String NombreCliente;

    Cliente(String nombre){
        this.NombreCliente = nombre;
    }

    String getNombre(){
        return NombreCliente;
    }
}

class Prestamo {
    double cuota;

    Prestamo(double cuota){
        this.cuota = cuota;
    }

    void setAnalizarCuota(){
        if (cuota >= 10000) {
            System.out.println("Deuda cancelada");
        }else{
             double pendiente = 1000 - cuota;
            System.out.println("Abono a duda: " + cuota);
            System.out.println("Pendiente para saldo: " + pendiente);
        }
    }
}

class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese nombre...");
        Cliente persona = new Cliente(entrada.next());

        System.out.println("Ingrese cuota...");
        Prestamo deposito = new Prestamo(entrada.nextDouble());
    }
}
