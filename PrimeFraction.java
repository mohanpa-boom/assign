package assign;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFraction {

	public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            int a=sc.nextInt();
            ArrayList<Integer> al=factorize(a);
            for (Integer m:al) {
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
    private static ArrayList<Integer> factorize(int a) {
        int i=2;
        ArrayList<Integer> al=new ArrayList<Integer>();
        while (i*i<=a) {
            if (a%i==0) {
                al.add(i);
                a/=i;
            } else {
                i++;
            }
        }
        al.add(a);
        return al;
    }
    
}
