public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Elige si quieres 1.-CARA 2.-CRUZ");
        double moneda= Math.random();
        if(moneda>5){
            System.out.println("CRUZ");
        }else{
            System.out.println("CARA");
        }

    }
}
