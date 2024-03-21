import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int año =read.nextInt();
        
        if (año%100 != 0 && año%4==0 || año%4==0 && año%400==0 ) {
            System.out.println("El año es bisisesto");
        }else{
            System.out.println("El año no es bisiesto");
        }
    }
}
