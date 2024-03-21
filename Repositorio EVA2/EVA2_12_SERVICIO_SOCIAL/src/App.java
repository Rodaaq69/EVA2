import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int creditos, semestre;
        Scanner read = new Scanner(System.in);
        System.out.println("En que semestre estas?");
        semestre = read.nextInt();
        System.out.println("¿Cuantos credito tienes? ");
        creditos = read.nextInt();

        if(semestre>=6 && creditos>=150){
            System.out.println("Puedes hacer el servicio social");

        }else {
            System.out.println("No puedes hacer el servicio social");
        }
    }
}
