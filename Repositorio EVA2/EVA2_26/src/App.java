import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String usuario, pwd;

        String USUARIO = "Admin";
        String PASSWORD="Admin";
        Scanner read = new Scanner(System.in);

        while(true){
            System.out.println("Usuario:");
            usuario= read.nextLine();
            System.out.println("Password");
            pwd=read.nextLine();
            if(usuario.equals(USUARIO)&&pwd.equals(PASSWORD)){
                break;
            }
            System.out.println("Bienvenido al sistema");
            

        }
            
    }
}
