/**
 * Program to convert Octal to Decimal
 */
package NumberSystem;

import static java.lang.Math.pow;

public class OctalToDecimal {
    void conversion(int n) {
        int i = 0;
        int dec = 0;
        while (n != 0) {
            int r = n % 10;
            n = n / 10;
            dec += r * pow(8, i);
            ++i;
        }
        System.out.println("Decimal number = " + dec);
    }
}
