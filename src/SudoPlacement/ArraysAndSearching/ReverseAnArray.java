package SudoPlacement.ArraysAndSearching;

/**
 * @author : codedsun
 * Created on 25/08/18
 */

import java.util.Scanner;

/**
 * <a href="https://practice.geeksforgeeks.org/problems/reverse-an-array/0/?track=SP-Arrays%20and%20Searching"/>
 */
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        int a;
        while (t-- >= 1) {
            String s = "";
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                a = sc.nextInt();
                s = a+" "+s;
            }
            System.out.println(s);
        }

    }
}
