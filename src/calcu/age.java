package calcu;

import java.time.*;
import java.util.*;

public class age {
    public void aged(){
        Scanner sc=new Scanner(System.in);

        int m;

        System.out.println("\n\t\t\t-------------------------");
        System.out.println("\t\t\t|    Age Calculator     |");
        System.out.println("\t\t\t-------------------------\n");

        System.out.println("Enter your age : ");
        System.out.println("Year : ");
        int yr=sc.nextInt();
        System.out.println("Month : ");
        int mn= sc.nextInt();
        System.out.println("Date : ");
        int dt= sc.nextInt();

        LocalDate dob = LocalDate.of(yr, mn, dt);
        LocalDate current = LocalDate.now();
        Period p = Period.between(dob, current);

        System.out.println("Your Age is : ");
        System.out.println(p.getYears()+" Year "+p.getMonths()+" Month "+p.getDays()+" Days");

        System.out.println("\nDo you want to more calculation.");
        System.out.println("1. Yes ");
        System.out.println("2. No");
        System.out.print("Enter : ");
        m=sc.nextInt();
        if (m==1){
            aged();
        }
    }
}
