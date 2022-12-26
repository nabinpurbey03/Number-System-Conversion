/**
 * Program to convert Hexadecimal to Decimal
 */
package NumberSystem;

public class HexadecimalToDecimal {
    void conversion(String n) {
        String digits = "0123456789ABCDEF";
        n = n.toUpperCase();
        int val = 0;
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        System.out.println("Decimal number = " + val);
    }
}
