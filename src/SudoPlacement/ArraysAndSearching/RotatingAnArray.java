package SudoPlacement.ArraysAndSearching;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 21/08/18
 */
public class RotatingAnArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        int c = 0;
        while (t-- >= 1) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int d = sc.nextInt();
            int b[] = new int[n];
            for (i = d; i < n; i++) {
                b[c] = a[i];
                c++;
            }

            for (i = 0; i < d; i++) {
                b[c] = a[i];
                c++;
            }

            for (i = 0; i < n; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }
}
