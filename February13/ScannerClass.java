package February13;

import java.util.Scanner;

        
public class ScannerClass {

    public static void main(String[] args) {
       // System.out.println("Whatever your desires");
       
        System.out.println("Please enter your name");
       
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        scanner.close();

        System.out.println("Your name is " + " " + myString );

           }
}
