package loop;

import java.util.*;

public class quesbreak {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        do {
            System.out.println("enter your number : ");
            int n=r.nextInt();
            if(n%10==0) {
                break;
            }
            System.out.println(n);
        } while (true);
        r.close();
    }
}
