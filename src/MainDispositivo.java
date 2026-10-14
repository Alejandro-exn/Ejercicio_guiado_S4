public class MainDispositivo {
    static void main() {

        Dispositivo d1= new Dispositivo("Celular","Iphone");
        Dispositivo d2=new Dispositivo("Laptop", "HP");
        Dispositivo d3=new Dispositivo("Audifonos", "Samsung");

        System.out.println(Dispositivo.getCantidadDis());

    }
}
