import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int dia=0;
        System.out.println("Introduce el dia de la semana");
        Scanner read = new Scanner(System.in);
        dia=read.nextInt();
        switch (dia) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Lunes"); break;
            case 3: System.out.println("Martes"); break;
            case 4: System.out.println("Miercoles"); break;
            case 5: System.out.println("Jueves"); break;
            case 6: System.out.println("Viernes"); break;
            case 7: System.out.println("Sabado"); break;
            default: System.out.println("Debes introducir un dia de la semana(1 al 7) ");
                break;
        }
    }
}
