import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Introduce una calificacion ");
            int calif=read.nextInt();
            if(calif>=0 && calif<=59){
                System.out.println("F");
            }else if(calif>=60 && calif<=69){
                System.out.println("D");
            }else if(calif>=70 && calif<=79){
                System.out.println("C");
            }else if(calif>=80 && calif<=89){
                System.out.println("B");
            }else if(calif>=90 && calif==100){
                System.out.println("A");
            }else{
                System.out.println("Calificacion no valida");
            }
        }
        
    }
}
