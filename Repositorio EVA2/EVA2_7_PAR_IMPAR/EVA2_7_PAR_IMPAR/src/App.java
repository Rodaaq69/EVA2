import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = read.nextInt();
        int div=0;
        int res=0;
        div =num/2;
        System.out.println("El resultado de la division es "+ num+"/2= "+ div);
        res=num%2;
        System.out.println("El residuo de la division es "+ num+"/2= "+ res);
        //Determinar si el numero es par o impar
        if(res==1){
            System.out.println("El numero es impar");
        }else{
            System.out.println("El numero es par");
        }
    }
}
