import java.util.Scanner;
public class Prueba{

	public static void main(String args[]){
		System.out.println("Hola, Mundo!");
		Scanner read = new Scanner(System.in);
		System.out.println("Ingresa tu nombre");
		String name = read.nextLine();
		System.out.println(name);
	}
}