/**
 * Main class to execute all the other classes...
 */
package NumberSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) {
            System.out.println("            Enter your choice:");
            System.out.println("Enter 1 to convert Decimal to Binary.");
            System.out.println("Enter 2 to convert Decimal to Octal.");
            System.out.println("Enter 3 to convert Decimal to Hexadecimal.");
            System.out.println("Enter 4 to convert Binary into Decimal.");
            System.out.println("Enter 5 to convert Octal to Decimal.");
            System.out.println("Enter 6 to convert Hexadecimal to Decimal.");
            int choice = ob.nextInt();
            while (choice < 1 || choice > 6) {
                System.out.println("Invalid input, please try again.");
                choice = ob.nextInt();
            }

            switch (choice) {
                case 1 -> {
                    System.out.println("Please input Decimal number:");
                    int in1 = ob.nextInt();
                    DecimalToBinary dtb = new DecimalToBinary();
                    dtb.conversion(in1);
                }
                case 2 -> {
                    System.out.println("Please input Decimal number:");
                    int in2 = ob.nextInt();
                    DecimalToOctal dto = new DecimalToOctal();
                    dto.conversion(in2);
                }
                case 3 -> {
                    System.out.println("Please input Decimal number:");
                    int in3 = ob.nextInt();
                    DecimalToHexadecimal dth = new DecimalToHexadecimal();
                    dth.conversion(in3);
                }
                case 4 -> {
                    System.out.println("Please input Binary number:");
                    int in4 = ob.nextInt();
                    BinaryToDecimal btd = new BinaryToDecimal();
                    btd.conversion(in4);
                }
                case 5 -> {
                    System.out.println("Please input Octal number:");
                    int in5 = ob.nextInt();
                    OctalToDecimal otd = new OctalToDecimal();
                    otd.conversion(in5);
                }
                case 6 -> {
                    System.out.println("Please input Hexadecimal value:");
                    ob.nextLine(); // To clear the buffer
                    String in6 = ob.nextLine();
                    HexadecimalToDecimal htd = new HexadecimalToDecimal();
                    htd.conversion(in6);
                }
            }
        }
    }
}
