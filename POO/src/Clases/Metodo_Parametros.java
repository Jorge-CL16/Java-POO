package Clases;

class Metodo_Parametros {

    int Sumar(int a, int b){
        return a + b;
    }
    int Restar(int a, int b){
        return a - b;
    }

    int Multiplicacion(int a, int b, int c){
        return a * b * c;
    }

    double potencia(double base, double exponente){
        return Math.pow(base, exponente);
    }

    public static void main(String[] args) {
        Metodo_Parametros operacion = new Metodo_Parametros();
        System.out.println("Suma: " + operacion.Sumar(40,50));
        System.out.println("Resta: " + operacion.Restar(80,20));
        System.out.println("Multiplicacion: " + operacion.Multiplicacion(3,2,8));
        System.out.println("Potencia de " + operacion.potencia(10,2 ));
    }
}
