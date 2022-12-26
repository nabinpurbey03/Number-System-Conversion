/**
 * Program to convert Decimal to Binary
 */
package NumberSystem;

public class DecimalToBinary {
    void conversion(int n) {
        int a[] = new int[10];
        int i;
        for (i = 0; n != 0; i++) {
            a[i] = n % 2;
            n = n / 2;
        }
        System.out.print("Binary = ");
        for (i = i - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }
}
