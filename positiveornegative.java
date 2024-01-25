package PS3;

import java.util.*;

public class positiveornegative { 
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter a number : ");
        int n=r.nextInt();
        if(n>0) {
            System.out.println("number is positive");
        }
        else if(n<0) {
            System.out.println("number is negative");
        }
        else {
            System.out.println("number is zero");
        }
        r.close();
    }
    
}
