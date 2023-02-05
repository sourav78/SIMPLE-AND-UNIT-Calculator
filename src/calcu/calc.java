package calcu;
import calcu.other;
import java.util.Scanner;
public class calc {
    public void simple(){
        int m;
        double n1, n2, r=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("\n\t\t\t-------------------------");
        System.out.println("\t\t\t|     Basic Calculator  |");
        System.out.println("\t\t\t-------------------------\n");
        System.out.println("|-------|-------|------|");
        System.out.println("|   9   |   8   |   7  |     |-------|------|------|");
        System.out.println("|-------|-------|------|     |   +   |   -  |   %  |");
        System.out.println("|   4   |   5   |   6  |     |-------|------|------|");
        System.out.println("|-------|-------|------|     |   *   |   /  |");
        System.out.println("|   1   |   2   |   3  |     |-------|------|");
        System.out.println("|-------|-------|------|");

        System.out.print("\nEnter 1st number : ");
        n1=sc.nextDouble();
        System.out.print("Enter operand : ");
        char o =sc.next().charAt(0);
        System.out.print("Enter 2nd number : ");
        n2=sc.nextDouble();


        switch (o) {
            case '+' -> r = n1 + n2;
            case '-' -> r = n1 - n2;
            case '*' -> r = n1 * n2;
            case '/' -> r = n1 / n2;
            case '%' -> r = n1 % n2;
        }
        System.out.println("Result is : "+r);

        System.out.println("\nDo you want to more calculation.");
        System.out.println("1. Yes ");
        System.out.println("2. No");
        System.out.print("Enter : ");
        m=sc.nextInt();
        if (m==1){
            simple();
        }
    }

    public void MainCalulator(){
        Scanner sc=new Scanner(System.in);
        calc ca=new calc();
        other ot=new other();

        int c;

        System.out.println("\n\t\t\t-------------------------");
        System.out.println("\t\t\t|       Calculator      |");
        System.out.println("\t\t\t-------------------------\n");
        System.out.println("1. Basic Calculator");
        System.out.println("2. Unit Converter");
        System.out.print("\nEnter : ");
        c=sc.nextInt();

        if (c==1){
            ca.simple();
        }
        else if (c==2) {
            ot.othr();
        }
        else {
            System.out.println("Invalid Input :(");
        }

        sc.close();
    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        calc ca=new calc();
//        other ot=new other();
//
//        int c;
//
//        System.out.println("\n\t\t\t-------------------------");
//        System.out.println("\t\t\t|       Calculator      |");
//        System.out.println("\t\t\t-------------------------\n");
//        System.out.println("1. Basic Calculator");
//        System.out.println("2. Unit Converter");
//        System.out.print("\nEnter : ");
//        c=sc.nextInt();
//
//        if (c==1){
//            ca.simple();
//        }
//        else if (c==2) {
//            ot.othr();
//        }
//        else {
//            System.out.println("Invalid Input :(");
//        }
//
//        sc.close();
//
//    }
}
