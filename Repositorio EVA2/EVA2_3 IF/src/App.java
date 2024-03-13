import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce la calificacion:");
        int califa = read.nextInt();
        if(califa >= 70 && califa<80){
            System.out.println("Usted aprobó!");
        } else if(califa>=80 && califa<90){
            System.out.println("Usted aprobó y destacó!");
        }else if(califa>=90){
            System.out.println("Usted sacó una calificación de excelencia!");
        }else if(califa<70){
            System.out.println("Usted reprobó");
        }
    }
}
