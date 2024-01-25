package PS3;

import java.util.*;

public class leapyear {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter the year : ");
        int a=r.nextInt();
        if(a%4==0) {
            if(a%100==0) {
                if(a%400==0) {
                    System.out.println("leap year");
                }
                else {
                    System.out.println("not a leap year");
                }
            }
            else {
                System.out.println("leap year");
            }
        }
        else {
            System.out.println("not a leap year");
        }
        r.close();
    }
}
/* second method
boolean x=(a%4)==0;
boolean y=(a%a00)!=0;
boolean z=((a%100==0) && (a%400==0));
if(x && (y||z)) {
    System.out.println("leap year");
}
else {
    System.out.println("not a leap year");
}
 */
