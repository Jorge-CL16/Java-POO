public class Vehiculos {

    private String marca = "Audi";
    private  int anio = 2024;

    void datosVehivulo() {
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anio);
    }

    public static void main(String[] args){
        Vehiculos auto1 = new Vehiculos();
        TipoVehiculo mitipo = new TipoVehiculo();
        auto1.datosVehivulo();
        System.out.println("Tipo: " + mitipo.tipo1);
    }
}
