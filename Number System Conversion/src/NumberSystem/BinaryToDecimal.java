/**
 * Program to convert Binary to Decimal
 */
package NumberSystem;

import static java.lang.Math.pow;

public class BinaryToDecimal {
    void conversion(int n) {
        int dec = 0, i = 0;
        while (n != 0) {
            int r = n % 10;
            n = n / 10;
            dec += r * pow(2, i);
            ++i;
        }
        System.out.println("Decimal number = " + dec);
    }
}
