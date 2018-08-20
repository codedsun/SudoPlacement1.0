package SudoPlacement.ArraysAndSearching;

/**
 * @author : codedsun
 * Created on 20/08/18
 */

import java.util.Scanner;

/**
 * <a href = "https://practice.geeksforgeeks.org/problems/immediate-smaller-element/0/?track=SP-Arrays%20and%20Searching"> </a>
 */

public class ImmediateSmallerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        while (t-- >= 1) {
            n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for(int i = 1;i< n ; i++) {
                if(a[i-1]>a[i]) {
                    System.out.print(a[i]+" ");
                }else{
                    System.out.print("-1"+" ");
                }
            }

                System.out.print("-1");

        }
    }
}
