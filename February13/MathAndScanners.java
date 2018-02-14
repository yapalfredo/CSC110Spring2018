import java.util.Scanner;

public class MathAndScanners {
    public static void main(String[] args){
        
        Scanner kb = new Scanner(System.in);
   
        System.out.println("Please enter value for X = ");
        int x = kb.nextInt();
        System.out.println("Please enter value for Y = ");
        int y = kb.nextInt();
        
        System.out.println("X + Y = " + (x + y));
        System.out.println("Y / X = " + ((float)y/x));
        System.out.println("X^2 + Y^2 = " + (Math.pow(x, 2) + Math.pow(y, 2)));
        System.out.println("Square Root of Y^3 * 5 = " + (Math.sqrt(Math.pow(y, 3) * 5)));
        System.out.println("LOG base 10 y^3/x^2 = " + Math.log10((Math.pow(y, 3) / Math.pow(x, 2))));
    }
}
