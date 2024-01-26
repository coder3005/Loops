package PS4;

import java.util.*;

public class table {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int mul;
        for(int i=1;i<=10;i++) {
            mul=n*i;
            System.out.println(n+"*"+i+"="+mul);
        }
        r.close();
    }
}
