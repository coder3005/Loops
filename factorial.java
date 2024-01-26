import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner r=new  Scanner(System.in);
        int n=r.nextInt();
        int mul=1;
        
        for(int i=1;i<=n;i++) {
            mul=mul*i;
        }
        System.out.println("fact is : "+mul);
        r.close();
    }
}
