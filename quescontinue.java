package loop;

import java.util.*;

public class quescontinue {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        do {
            System.out.println("enter your number : ");
            int n=r.nextInt();
            if(n%10==0) {
                continue;
            }
            System.out.println("number was : "+n);
        } while(true);
        
    }
}
