/**
 * Program to convert Decimal to Octal
 */
package NumberSystem;

public class DecimalToOctal {
    void conversion(int n) {
        int a[] = new int[10];
        int i;
        for (i = 0; n != 0; i++) {
            a[i] = n % 8;
            n = n / 8;
        }
        System.out.print("Octal number = ");
        for (i = i - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
