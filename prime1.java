package loop;

import java.util.*;

public class prime1 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        if(n==2) {
            System.out.println("n is prime");
        }
        else {
                boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) { // n is a multiple of i (i not equal to 1 or n)
                isPrime=false;
            }
        }
        if(isPrime==true) {
            System.out.println("n is Prime");
        }
        else {
            System.out.println("n is not Prime");
        }
        }
        r.close();
        
    }
}