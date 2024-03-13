import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int valor1=read.nextInt();
        System.out.println("Ingrese el segundo valor");
        int valor2 = 0;
        if(valor1 > valor2){
            System.out.println(valor1+" es mayor que "+valor2);
        }else{
            System.out.println(valor2+" es mayor que "+valor1);
        }
        if(valor1==valor2){
            System.out.println("Los valores son los mismos");
        }
        

    }
}
