package PS4;

import java.util.*;

public class evenoddsum {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int sumodd=0;
        int sumeven=0;
        for(int i=1;i<=n;i++) {
            if(i%2==0) {
                sumeven=sumeven+i;
            }
            
            if(i%2!=0) {
                sumodd=sumodd+i;
            }
            
        }
        System.out.println("sum of even is : "+sumeven);
        System.out.println("sum of odd is : "+sumodd);
        r.close();
    }
}
