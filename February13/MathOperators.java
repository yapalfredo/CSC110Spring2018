
public class MathOperators {

    public static void main(String[] args) {
        int x = 2;
        int y = 19;

        System.out.println("X + Y = " + (x + y));
        System.out.println("X / Y = " + (x / y));
        System.out.println("X^2 + Y^2 = " + (Math.pow(x, 2) + Math.pow(y, 2)));
        System.out.println("Square Root of Y^3 * 5 = " + (Math.sqrt(Math.pow(y, 3) * 5)));
        System.out.println("LOG base 10 y^3/x^3 = " + Math.log10((Math.pow(y, 3) / Math.pow(x, 3))));
    }
}
