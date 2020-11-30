package ejercicio1;

public class ejercicio1propuesto {
    public static void main(String[] args) {
        int a, b, c;
        a = 31;
        b = 64;
        c = 200;

        if (a > b && a > c) {
            System.out.println("El mayor es A con el numero: " + a);
        } else if (b > a && b > c) {
            System.out.println("El mayor es B con el numero: " + b);
        } else {
            System.out.println("El mayor es C con el numero: " + c);
        }
    }
}
