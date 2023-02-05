package calcu;
import java.util.Scanner;
import java.math.*;
public class length {
    public void len(){
        Scanner sc=new Scanner(System.in);
        int f, t, m;
        double lc1, lc2, res=0;

        String l1="Picometer",l2="Nanometer",l3="Milimeter",l4="Centimeter",l5="Decimeter",l6="Meter",l7="Kilometer",l8="Inch",l9="Foot",l10="Mile",l11="Nautical Mile";
        String lt1="";
        String lt2="";
        System.out.println("\n\t\t\t-------------------------");
        System.out.println("\t\t\t|    Length converter   |");
        System.out.println("\t\t\t-------------------------\n");

        System.out.println("Metric Unit :                       Imperial unit : ");
        System.out.println("1. Picometer                        8. Inch");
        System.out.println("2. Nanometer                        9. Foot");
        System.out.println("3. Milimeter                        10. Mile");
        System.out.println("4. Centimeter                       11. Nautical Mile");
        System.out.println("5. Decimeter");
        System.out.println("6. Meter");
        System.out.println("7. Kilometer");

        System.out.println("\nEnter units to convert");
        System.out.print("From : ");
        f=sc.nextInt();
        System.out.print("To :");
        t=sc.nextInt();

        switch (f){
            case 1->lt1=l1;
            case 2->lt1=l2;
            case 3->lt1=l3;
            case 4->lt1=l4;
            case 5->lt1=l5;
            case 6->lt1=l6;
            case 7->lt1=l7;
            case 8->lt1=l8;
            case 9->lt1=l9;
            case 10->lt1=l10;
            case 11->lt1=l11;
        }
        switch (t){
            case 1->lt2=l1;
            case 2->lt2=l2;
            case 3->lt2=l3;
            case 4->lt2=l4;
            case 5->lt2=l5;
            case 6->lt2=l6;
            case 7->lt2=l7;
            case 8->lt2=l8;
            case 9->lt2=l9;
            case 10->lt2=l10;
            case 11->lt2=l11;
        }

        System.out.print("\nEnter "+lt1+" : ");
        lc1=sc.nextDouble();

        //Picometer
        if(f==1) {
            if (t == 2) {
                res = lc1 * 0.001;
            } else if (t == 3) {
                res = lc1 * 0.000000001;
            } else if (t == 4) {
                res = lc1 * 0.0000000001;
            } else if (t == 5) {
                res = lc1 * 0.00000000001;
            } else if (t == 6) {
                res = lc1 * 0.0000000000001;
            } else if (t == 7) {
                res = lc1 * 0.000000000000001;
            } else if (t == 8) {
                res = lc1 * 0.000000003937;
            } else if (t == 9) {
                res = lc1 * 0.0000000000328084;
            } else if (t == 10) {
                res = lc1 * 0.00000000000000062137119;
            } else if (t == 11) {
                res = lc1 * 0.00000000000000053996;
            }
        }
        else if (f==2){
            if (t == 1) {
                res = lc1 * 1000;
            } else if (t == 2) {
                res = lc1 *1;
            } else if (t == 3) {
                res = lc1 * 0.000001;
            } else if (t == 4) {
                res = lc1 * 0.0000001;
            } else if (t == 5) {
                res = lc1 * 0.00000001;
            } else if (t == 6) {
                res = lc1 * 0.000000001;
            } else if (t == 7) {
                res = lc1 * 0.000000000001;
            } else if (t == 8) {
                res = lc1 * 0.000000003937;
            } else if (t == 9) {
                res = lc1 * 0.000000032808;
            } else if (t == 10) {
                res = lc1 * 0.0000000000000621371;
            } else if (t==11) {
                res= lc1 * 0.00000000000054;
            }
        }
        else if (f==3){        //Milimeter
            if (t == 1) {
                res = lc1 * 1000000;
            } else if (t == 2) {
                res = lc1 *1000;
            } else if (t == 3) {
                res = lc1 * 1;
            } else if (t == 4) {
                res = lc1 * 0.1;
            } else if (t == 5) {
                res = lc1 * 0.01;
            } else if (t == 6) {
                res = lc1 * 0.001;
            } else if (t == 7) {
                res = lc1 * 0.000001;
            } else if (t == 8) {
                res = lc1 * 0.0393701;
            } else if (t == 9) {
                res = lc1 * 0.00328084;
            } else if (t == 10) {
                res = lc1 * 0.000000621371;
            } else if (t==11) {
                res= lc1 * 0.000000539957;
            }
        }
        else if (f==4){    //Centimeter
            if (t == 1) {
                res = lc1 * 100000000;
            } else if (t == 2) {
                res = lc1 *10000000;
            } else if (t == 3) {
                res = lc1 * 10;
            } else if (t == 4) {
                res = lc1 * 1;
            } else if (t == 5) {
                res = lc1 * 0.1;
            } else if (t == 6) {
                res = lc1 * 0.01;
            } else if (t == 7) {
                res = lc1 * 0.00001;
            } else if (t == 8) {
                res = lc1 * 0.393701;
            } else if (t == 9) {
                res = lc1 * 0.0328084;
            } else if (t == 10) {
                res = lc1 * 0.00000621371;
            } else if (t==11) {
                res= lc1 * 0.00000539957;
            }
        }
        else if (f==5){    //Decimeter
            if (t == 1) {
                res = lc1 * Math.pow(10, 11) ;
            } else if (t == 2) {
                res = lc1 *100000000;
            } else if (t == 3) {
                res = lc1 * 100;
            } else if (t == 4) {
                res = lc1 * 10;
            } else if (t == 5) {
                res = lc1 * 1;
            } else if (t == 6) {
                res = lc1 * 0.1;
            } else if (t == 7) {
                res = lc1 * 0.0001;
            } else if (t == 8) {
                res = lc1 * 3.937;
            } else if (t == 9) {
                res = lc1 * 0.328084;
            } else if (t == 10) {
                res = lc1 * 0.0000621371;
            } else if (t == 11) {
                res= lc1 * 0.0000539957;
            }
        }
        else if (f==6){    //Meter
            if (t == 1) {
                res = lc1 * Math.pow(10, 12) ;
            } else if (t == 2) {
                res = lc1 * Math.pow(10, 9);
            } else if (t == 3) {
                res = lc1 * 1000;
            } else if (t == 4) {
                res = lc1 * 100;
            } else if (t == 5) {
                res = lc1 * 10;
            } else if (t == 6) {
                res = lc1 * 1;
            } else if (t == 7) {
                res = lc1 * 0.001;
            } else if (t == 8) {
                res = lc1 * 39.3701;
            } else if (t == 9) {
                res = lc1 * 3.28084;
            } else if (t == 10) {
                res = lc1 * 0.000621371;
            } else if (t == 11) {
                res= lc1 * 0.000539957;
            }
        }
        else if (f==7){    //Kilometer
            if (t == 1) {
                res = lc1 * Math.pow(10, 15) ;
            } else if (t == 2) {
                res = lc1 * Math.pow(10, 12);
            } else if (t == 3) {
                res = lc1 * 1000000;
            } else if (t == 4) {
                res = lc1 * 100000;
            } else if (t == 5) {
                res = lc1 * 10000;
            } else if (t == 6) {
                res = lc1 * 1000;
            } else if (t == 7) {
                res = lc1 * 1;
            } else if (t == 8) {
                res = lc1 * 39370.1;
            } else if (t == 9) {
                res = lc1 * 3280.84;
            } else if (t == 10) {
                res = lc1 * 0.621371;
            } else if (t == 11) {
                res= lc1 * 0.539957;
            }
        }
        else if (f==8){    //Inch
            if (t == 1) {
                res = lc1 * (2.54 * Math.pow(10, 10)) ;
            } else if (t == 2) {
                res = lc1 * (2.54 * Math.pow(10, 7));
            } else if (t == 3) {
                res = lc1 * 25.4;
            } else if (t == 4) {
                res = lc1 * 2.54;
            } else if (t == 5) {
                res = lc1 * 0.254;
            } else if (t == 6) {
                res = lc1 * 0.0254;
            } else if (t == 7) {
                res = lc1 * (2.54 * Math.pow(10, -5));
            } else if (t == 8) {
                res = lc1 * 1;
            } else if (t == 9) {
                res = lc1 * 0.0833333;
            } else if (t == 10) {
                res = lc1 * (1.57828 * Math.pow(10, -5));
            } else if (t == 11) {
                res= lc1 * (1.37149 * Math.pow(10, -5));
            }
        }
        else if (f==9){    //Feet
            if (t == 1) {
                res = lc1 * (3.048 * Math.pow(10, 11)) ;
            } else if (t == 2) {
                res = lc1 * (3.048 * Math.pow(10, 8));
            } else if (t == 3) {
                res = lc1 * 304.8;
            } else if (t == 4) {
                res = lc1 * 30.48;
            } else if (t == 5) {
                res = lc1 * 3.048;
            } else if (t == 6) {
                res = lc1 * 0.3048;
            } else if (t == 7) {
                res = lc1 * 0.0003048;
            } else if (t == 8) {
                res = lc1 * 12;
            } else if (t == 9) {
                res = lc1 * 1;
            } else if (t == 10) {
                res = lc1 * 0.000189394;
            } else if (t == 11) {
                res= lc1 * 0.000164579;
            }
        }
        else if (f==10){    //Miles
            if (t == 1) {
                res = lc1 * (1.609 * Math.pow(10, 15)) ;
            } else if (t == 2) {
                res = lc1 * (1.609 * Math.pow(10, 12));
            } else if (t == 3) {
                res = lc1 * (1.609 * Math.pow(10, 6));
            } else if (t == 4) {
                res = lc1 * 160934;
            } else if (t == 5) {
                res = lc1 * 16093.4;
            } else if (t == 6) {
                res = lc1 * 1609.34;
            } else if (t == 7) {
                res = lc1 * 1.60934;
            } else if (t == 8) {
                res = lc1 * 63360;
            } else if (t == 9) {
                res = lc1 * 5280;
            } else if (t == 10) {
                res = lc1 * 1;
            } else if (t == 11) {
                res= lc1 * 0.868976;
            }
        }
        else if (f==11){    //Nautical miles
            if (t == 1) {
                res = lc1 * (1.852 * Math.pow(10, 15)) ;
            } else if (t == 2) {
                res = lc1 * (1.852 * Math.pow(10, 12));
            } else if (t == 3) {
                res = lc1 * (1.852 * Math.pow(10, 6));
            } else if (t == 4) {
                res = lc1 * 185200;
            } else if (t == 5) {
                res = lc1 * 18520;
            } else if (t == 6) {
                res = lc1 * 1852;
            } else if (t == 7) {
                res = lc1 * 1.852;
            } else if (t == 8) {
                res = lc1 * 72913.386;
            } else if (t == 9) {
                res = lc1 * 6076.12;
            } else if (t == 10) {
                res = lc1 * 1.151;
            } else if (t == 11) {
                res= lc1 * 1;
            }
        }
        else {
            System.out.println("Invalid Input! :(");
            len();
        }

        System.out.println(lt2+" : "+res);
        System.out.println("\n=>"+lc1+" "+lt1+" is equal to "+res+" "+lt2);

        System.out.println("\nDo you want to more calculation.");
        System.out.println("1. Yes ");
        System.out.println("2. No");
        System.out.print("Enter : ");
        m=sc.nextInt();
        if (m==1){
            len();
        }
    }
}
