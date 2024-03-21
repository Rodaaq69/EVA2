import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean cash, clima;
        int opclana= 0;
        int opcclima=0;
        cash = false;
        clima = false;
        Scanner read = new Scanner(System.in);
        System.out.println("¿Hay lana?  1.-si 2.-no");
        opclana=read.nextInt();
        if(opclana==1){
            cash=true;
        }else{
            cash=false;
        }
        System.out.println("Esta rico el clima? 1.-si 2.-no");
        opcclima=read.nextInt();
        if(opcclima==1){
            clima=true;
        }else{
            clima=false;
        }
    

        if(cash==true && clima==true){
            System.out.println("Que se arme la carnita asada");
        }else if(cash==true && clima==false){
            System.out.println("hay lana, pero el clima esta horrible");
        }else if(cash==false && clima==true){
            System.out.println("El clima esta de perlas, pero estamos pobres");
        }else{
            System.out.println("No tienes ni ganas de vivir");
        }
    }
}
