import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la cantidad maxima en bodega.");
        int cantMax = lector.nextInt();

        System.out.println("Ingrese la cantidad minima en bodega.");
        int cantMin = lector.nextInt();

        System.out.println("Ingrese la cantidad actual en bodega.");
        int cantAct = lector.nextInt();

        if(cantAct>cantMax){
            System.out.println("Hay sobrecupo en bodega, por favor liberar");
        }else if(cantAct<cantMin){
            System.out.println("Hay que hacer un pedido");
        }else{
            System.out.println("No hay que hacer pedido");
        }

    }
}
