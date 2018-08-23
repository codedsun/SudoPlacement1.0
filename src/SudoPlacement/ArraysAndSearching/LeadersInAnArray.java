package SudoPlacement.ArraysAndSearching;

import java.util.Scanner;

/**
 * @author : codedsun
 * Created on 23/08/18
 */
public class LeadersInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        int a[];int c;
        while (t-- >= 1) {
            c = 0;
            n = sc.nextInt();
            a = new int[n];
            for(int i =0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                for(int j = i+1; j<n; j++) {
                    if(a[i] > a[j]){
                        c=1;
                    }
                    else{
                        c=0;
                        break;
                    }
                }
                if(c==1) {
                    System.out.print(a[i]+" ");
                }
            }
            System.out.print(a[n-1]);
        }
    }
}
