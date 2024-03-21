import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        String dia=read.nextLine();
        System.out.println("Introduce un dia de la semana");
        if (dia.equals("lunes")) {
            System.out.println("1");
            
        }else if (dia.equals("martes")){
            System.out.println("2");
        }else if(dia.equals("miercoles")){
            System.out.println("3");
        }else if(dia.equals("jueves")){
        System.out.println("4");
        }else if(dia.equals("viernes")){
            System.out.println("5");
        }else if(dia.equals("sabado")) {
            System.out.println("6");
        }else if(dia.equals("domingo"))
        System.out.println("7");
    }
}
