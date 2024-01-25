package loop;

import java.util.*;

public class prime2 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int count=0;
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                count++;
                continue;
            }
        }
        if(count>0) {
            System.out.println("number is not prime");
        }
        else {
            System.out.println("number is prime");
        }
        r.close();
    }
}
