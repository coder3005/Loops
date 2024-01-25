package PS3;

import java.util.*;

public class weekday {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter week number ");
        int a=r.nextInt();
        switch(a) {
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thursday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            case 7 : System.out.println("Sunday");
            break;
            default : System.out.println("you have entered wrong week day number");
        }
        r.close();
    }
}
