package loop;

import java.util.Scanner;

public class reverse1 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        while(n>0) {
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
        r.close();
    }
}
