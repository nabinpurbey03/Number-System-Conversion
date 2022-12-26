/**
 * Program to convert Decimal into Hexadecimal
 */
package NumberSystem;

public class DecimalToHexadecimal {
    void conversion(int n) {
        int a[] = new int[10];
        int i;
        for (i = 0; n != 0; i++) {
            a[i] = n % 16;
            n = n / 16;
        }
        System.out.print("Hexadecimal number = ");
        for (i = i - 1; i >= 0; i--) {
            if (a[i] == 10) {
                System.out.print("A ");
            } else if (a[i] == 11) {
                System.out.print("B ");
            } else if (a[i] == 12) {
                System.out.print("C ");
            } else if (a[i] == 13) {
                System.out.print("C ");
            } else if (a[i] == 14) {
                System.out.print("D ");
            } else if (a[i] == 15) {
                System.out.print("E ");
            } else if (a[i] == 16) {
                System.out.print("F ");
            } else {
                System.out.print(a[i] + " ");
            }
        }

    }
}
