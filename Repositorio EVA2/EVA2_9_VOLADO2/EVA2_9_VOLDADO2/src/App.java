import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese una opción 1.-CRUZ 2.-CARA");
        Scanner read = new Scanner(System.in);
        int opc=read.nextInt();
        double valor = Math.random();
        if(valor>.5){
            System.out.println("Moneda:CARA");
            if(opc==1){
                System.out.println("Perdiste");
            }else{
                System.out.println("GANASTE!");
            }
        }else{
            System.out.println("Moneda:CRUZ");
            if(opc==1){
                System.out.println("GANASTE!");
            }else{
                System.out.println("Perdiste");
            }
        }
    }
}
