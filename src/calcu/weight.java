package calcu;

import java.util.Scanner;

public class weight {
    public void wght(){
        Scanner sc=new Scanner(System.in);

        double wc1, wc2, res=0;
        int f,t, m;

        String w1="Microgram",w2="Milligram",w3="Gram",w4="Kilogram",w5="Quintal",w6="Tonne",w7="Carat",w8="Pound";
        String wg1="";
        String wg2="";
        System.out.println("\n\t\t\t-------------------------");
        System.out.println("\t\t\t|    Weight converter   |");
        System.out.println("\t\t\t-------------------------\n");

        System.out.println("Units : ");
        System.out.println("1. Microgram                        5. Quintal");
        System.out.println("2. Milligram                        6. Tonne");
        System.out.println("3. Gram                             7. Carat");
        System.out.println("4. Kilogram                         8. Pound");

        System.out.println("\nEnter units to convert");
        System.out.print("From : ");
        f=sc.nextInt();
        System.out.print("To :");
        t=sc.nextInt();

        switch (f){
            case 1->wg1=w1;
            case 2->wg1=w2;
            case 3->wg1=w3;
            case 4->wg1=w4;
            case 5->wg1=w5;
            case 6->wg1=w6;
            case 7->wg1=w7;
            case 8->wg1=w8;
        }
        switch (t){
            case 1->wg2=w1;
            case 2->wg2=w2;
            case 3->wg2=w3;
            case 4->wg2=w4;
            case 5->wg2=w5;
            case 6->wg2=w6;
            case 7->wg2=w7;
            case 8->wg2=w8;
        }

        System.out.print("\nEnter "+wg1+" : ");
        wc1=sc.nextDouble();

        if (f==1){    //Microgram
            switch (t){
                case 1->res = wc1 * 1;
                case 2->res = wc1 * 0.001;
                case 3->res = wc1 * 0.000001;
                case 4->res = wc1 * 0.000000001;
                case 5->res = wc1 * 0.00000000001;
                case 6->res = wc1 * 0.000000000001;
                case 7->res = wc1 * 0.000005;
                case 8->res = wc1 * 0.00000000220462;
            }
        }
        else if (f==2){    //Milligram
            switch (t){
                case 1->res = wc1 * 1000;
                case 2->res = wc1 * 1;
                case 3->res = wc1 * 0.001;
                case 4->res = wc1 * 0.000001;
                case 5->res = wc1 * 0.00000001;
                case 6->res = wc1 * 0.000000001;
                case 7->res = wc1 * 0.005;
                case 8->res = wc1 * 0.00000220462;
            }
        }
        else if (f==3){    //Gram
            switch (t) {
                case 1 -> res = wc1 * 1000000;
                case 2 -> res = wc1 * 1000;
                case 3 -> res = wc1 * 1;
                case 4 -> res = wc1 * 0.001;
                case 5 -> res = wc1 * 0.00001;
                case 6 -> res = wc1 * 0.000001;
                case 7 -> res = wc1 * 5;
                case 8 -> res = wc1 * 0.00220462;
            }
        }
        else if (f==4){    //Kilogram
            switch (t){
                case 1->res = wc1 * 1000000000;
                case 2->res = wc1 * 1000000;
                case 3->res = wc1 * 1000;
                case 4->res = wc1 * 1;
                case 5->res = wc1 * 0.01;
                case 6->res = wc1 * 0.001;
                case 7->res = wc1 * 5000;
                case 8->res = wc1 * 2.20462;
            }
        }
        else if (f==5){    //Quintal
            switch (t){
                case 1->res = wc1 * Math.pow(10,11);
                case 2->res = wc1 * 100000000;
                case 3->res = wc1 * 100000;
                case 4->res = wc1 * 100;
                case 5->res = wc1 * 1;
                case 6->res = wc1 * 0.1;
                case 7->res = wc1 * 500000;
                case 8->res = wc1 * 220.462;
            }
        }
        else if (f==6){    //Tonne
            switch (t){
                case 1->res = wc1 * Math.pow(10,12);
                case 2->res = wc1 * Math.pow(10,9);
                case 3->res = wc1 * 1000000;
                case 4->res = wc1 * 1000;
                case 5->res = wc1 * 10;
                case 6->res = wc1 * 1;
                case 7->res = wc1 * 5000000;
                case 8->res = wc1 * 2204.62;
            }
        }
        else if (f==7){    //Carat
            switch (t){
                case 1->res = wc1 * 200000;
                case 2->res = wc1 * 200;
                case 3->res = wc1 * 0.2;
                case 4->res = wc1 * 0.0002;
                case 5->res = wc1 * 0.000002;
                case 6->res = wc1 * 0.0000002;
                case 7->res = wc1 * 1;
                case 8->res = wc1 * 0.000440924;
            }
        }
        else if (f==8){    //Pound
            switch (t){
                case 1->res = wc1 * (40536*Math.pow(10,8));
                case 2->res = wc1 * 453592;
                case 3->res = wc1 * 453.592;
                case 4->res = wc1 * 0.453592;
                case 5->res = wc1 * 0.00453592;
                case 6->res = wc1 * 0.000453592;
                case 7->res = wc1 * 2267.96;
                case 8->res = wc1 * 1;
            }
        }
        else {
            System.out.println("Invalid Input! :(");
            wght();
        }


        System.out.println(wg2+" : "+res);
        System.out.println("\n=>"+wc1+" "+wg1+" is equal to "+res+" "+wg2);

        System.out.println("\nDo you want to more calculation.");
        System.out.println("1. Yes ");
        System.out.println("2. No");
        System.out.print("Enter : ");
        m=sc.nextInt();
        if (m==1){
            wght();
        }
    }
}
