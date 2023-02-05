package calcu;

import java.util.Scanner;

public class volume {
    public void vol(){
        Scanner sc=new Scanner(System.in);
        int f, t, m;
        double vv, res=0.00;

        String v1="Millilitre", v2="Centilitre", v3="Litre", v4="Hectolitres", v5="Decilitre",v6="Cubic Millimetre", v7="Cubic Centimetre", v8="Cubic Metre", v9="Cubic Decimetre", v10="Cubic Foot",
                v11="Cubic Yard", v12="Cubic Inch", v13="Acer-foot", v14="UK Gallon", v15="US Gallon";
        String vl1="", vl2="";

        System.out.println("\n\t\t\t-------------------------");
        System.out.println("\t\t\t|    Volume Calculater   |");
        System.out.println("\t\t\t-------------------------\n");

        System.out.println("Units : ");
        System.out.println("1. Millilitre             6. Cubic Millimetre               11. Cubic Yard");
        System.out.println("2. Centilitre             7. Cubic Centimetre               12. Cubic Inch");
        System.out.println("3. Litre                  8. Cubic Metre                    13. Acer-foot");
        System.out.println("4. Hectolitres            9. Cubic Decimetre                14. UK Gallon");
        System.out.println("5. Decilitre              10. Cubic Foot                    15. US Gallon");

        System.out.println("\nEnter units to convert");
        System.out.print("From : ");
        f=sc.nextInt();
        System.out.print("To :");
        t=sc.nextInt();

        switch (f){
            case 1->vl1=v1;
            case 2->vl1=v2;
            case 3->vl1=v3;
            case 4->vl1=v4;
            case 5->vl1=v5;
            case 6->vl1=v6;
            case 7->vl1=v7;
            case 8->vl1=v8;
            case 9->vl1=v9;
            case 10->vl1=v10;
            case 11->vl1=v11;
            case 12->vl1=v12;
            case 13->vl1=v13;
            case 14->vl1=v14;
            case 15->vl1=v15;
        }
        switch (t){
            case 1->vl2=v1;
            case 2->vl2=v2;
            case 3->vl2=v3;
            case 4->vl2=v4;
            case 5->vl2=v5;
            case 6->vl2=v6;
            case 7->vl2=v7;
            case 8->vl2=v8;
            case 9->vl2=v9;
            case 10->vl2=v10;
            case 11->vl2=v11;
            case 12->vl2=v12;
            case 13->vl2=v13;
            case 14->vl2=v14;
            case 15->vl2=v15;
        }

        System.out.print("\nEnter "+vl1+" : ");
        vv=sc.nextDouble();

        if (f==1){    //Millilitre
            switch (t){
                case 1->res = vv * 1;  //Millilitre
                case 2->res = vv * 0.1;  //Centilitre
                case 3->res = vv * 0.001;  //Litre
                case 4->res = vv * 0.00001;  //Hectolitres
                case 5->res = vv * 0.01;  //Decilitre
                case 6->res = vv * 1000;  //Cubic Millimetre
                case 7->res = vv * 1; //Cubic Centimetre
                case 8->res = vv * 0.000001;  //Cubic Metre
                case 9->res = vv * 0.001; //Cubic Decimetre
                case 10->res = vv * 0.000035314724;  //Cubic Foot
                case 11->res = vv * 0.000001307952;  //Cubic Yard
                case 12->res = vv * 0.0610238445;  //Cubic Inch
                case 13->res = vv * (double) 8.107E-10;  //Acer-foot
                case 14->res = vv * 0.00021996915;  //UK Gallon
                case 15->res = vv * 0.0002641720514;  //US Gallon

            }
        }
        else if (f==2){    //Centilitre
            switch (t){
                case 1->res = vv * 10;  //Millilitre
                case 2->res = vv * 1;  //Centilitre
                case 3->res = vv * 0.01;  //Litre
                case 4->res = vv * 0.0001;  //Hectolitres
                case 5->res = vv * 0.1;  //Decilitre
                case 6->res = vv *  10000;  //Cubic Millimetre
                case 7->res = vv * 10; //Cubic Centimetre
                case 8->res = vv * 0.00001;  //Cubic Metre
                case 9->res = vv * 0.01; //Cubic Decimetre
                case 10->res = vv * 0.000353147248;  //Cubic Foot
                case 11->res = vv * 0.000013079528;  //Cubic Yard
                case 12->res = vv * 0.610238445022;  //Cubic Inch
                case 13->res = vv * (double) 8.107E-9;  //Acer-foot
                case 14->res = vv * 0.0021996915;  //UK Gallon
                case 15->res = vv * 0.0002641720524;  //US Gallon

            }
        }
        else if (f==3){    //Litre
            switch (t){
                case 1->res = vv * 1000;  //Millilitre
                case 2->res = vv * 100;  //Centilitre
                case 3->res = vv * 1;  //Litre
                case 4->res = vv * 0.01;  //Hectolitres
                case 5->res = vv * 10;  //Decilitre
                case 6->res = vv * 1000000;  //Cubic Millimetre
                case 7->res = vv * 1000; //Cubic Centimetre
                case 8->res = vv * 0.001;  //Cubic Metre
                case 9->res = vv * 1; //Cubic Decimetre
                case 10->res = vv * 0.0353147248;  //Cubic Foot
                case 11->res = vv * 0.0013079528;  //Cubic Yard
                case 12->res = vv * 61.0238445022;  //Cubic Inch
                case 13->res = vv * (double) 8.107E-7;  //Acer-foot
                case 14->res = vv * 0.2199691573;  //UK Gallon
                case 15->res = vv * 0.2641720514;  //US Gallon

            }
        }
        else if (f==4){    //Hectolitres
            switch (t){
                case 1->res = vv * 100000;  //Millilitre
                case 2->res = vv * 10000;  //Centilitre
                case 3->res = vv * 100;  //Litre
                case 4->res = vv * 1;  //Hectolitres
                case 5->res = vv * 1000;  //Decilitre
                case 6->res = vv * 100000000;  //Cubic Millimetre
                case 7->res = vv * 100000; //Cubic Centimetre
                case 8->res = vv * 0.1;  //Cubic Metre
                case 9->res = vv * 100; //Cubic Decimetre
                case 10->res = vv * 0.53147248;  //Cubic Foot
                case 11->res = vv * 0.13079528;  //Cubic Yard
                case 12->res = vv * 6102.38445022;  //Cubic Inch
                case 13->res = vv * 0.00008107;  //Acer-foot
                case 14->res = vv * 21.99691573;  //UK Gallon
                case 15->res = vv * 26.41720524;  //US Gallon

            }
        }

        else if (f==5){    //Decilitre
            switch (t){
                case 1->res = vv * 100;  //Millilitre
                case 2->res = vv * 10;  //Centilitre
                case 3->res = vv * 0.1;  //Litre
                case 4->res = vv * 0.001;  //Hectolitres
                case 5->res = vv * 1;  //Decilitre
                case 6->res = vv * 100000;  //Cubic Millimetre
                case 7->res = vv * 100; //Cubic Centimetre
                case 8->res = vv * 0.00001;  //Cubic Metre
                case 9->res = vv * 0.1; //Cubic Decimetre
                case 10->res = vv * 0.00353147248;  //Cubic Foot
                case 11->res = vv * 0.00013079528;  //Cubic Yard
                case 12->res = vv * 6.10238445022;  //Cubic Inch
                case 13->res = vv * (double) 8.107E-8;  //Acer-foot
                case 14->res = vv * 0.02199691573;  //UK Gallon
                case 15->res = vv * 0.02641720524;  //US Gallon

            }
        }
        else if (f==6){    //Cubic Millimetre
            switch (t){
                case 1->res = vv * 0.001;  //Millilitre
                case 2->res = vv * 0.0001;  //Centilitre
                case 3->res = vv * 0.000001;  //Litre
                case 4->res = vv * (double) 1E-8;  //Hectolitres
                case 5->res = vv * 0.00001;  //Decilitre
                case 6->res = vv * 1;  //Cubic Millimetre
                case 7->res = vv * 0.001; //Cubic Centimetre
                case 8->res = vv * (double) 1E-9;  //Cubic Metre
                case 9->res = vv * 0.000001; //Cubic Decimetre
                case 10->res = vv * (double) 3.53147248E-8;  //Cubic Foot
                case 11->res = vv * (double) 1.3079528E-9;  //Cubic Yard
                case 12->res = vv * 0.0000610238445022;  //Cubic Inch
                case 13->res = vv * (double) 8.107E-13;  //Acer-foot
                case 14->res = vv * (double) 2.199691573E-7;  //UK Gallon
                case 15->res = vv * (double) 2.641720524E-7;  //US Gallon

            }
        }
        else if (f==7){    //Cubic Centimetre
            switch (t){
                case 1->res = vv * 1;  //Millilitre
                case 2->res = vv * 0.1;  //Centilitre
                case 3->res = vv * 0.001;  //Litre
                case 4->res = vv * 0.00001;  //Hectolitres
                case 5->res = vv * 0.01;  //Decilitre
                case 6->res = vv * 1000;  //Cubic Millimetre
                case 7->res = vv * 1; //Cubic Centimetre
                case 8->res = vv * 0.000001;  //Cubic Metre
                case 9->res = vv * 0.001; //Cubic Decimetre
                case 10->res = vv * 0.0000353147248;  //Cubic Foot
                case 11->res = vv * 0.0000013079528;  //Cubic Yard
                case 12->res = vv * 0.0610238445022;  //Cubic Inch
                case 13->res = vv * (double) 8.107E-10;  //Acer-foot
                case 14->res = vv * 0.0002199691573;  //UK Gallon
                case 15->res = vv * 0.0002641720524;  //US Gallon

            }
        }

        else if (f==8){    //Cubic Metre
            switch (t){
                case 1->res = vv * 1000000;  //Millilitre
                case 2->res = vv * 100000;  //Centilitre
                case 3->res = vv * 1000;  //Litre
                case 4->res = vv * 10;  //Hectolitres
                case 5->res = vv * 10000;  //Decilitre
                case 6->res = vv * 1000000000;  //Cubic Millimetre
                case 7->res = vv * 1000000; //Cubic Centimetre
                case 8->res = vv * 1;  //Cubic Metre
                case 9->res = vv * 1000; //Cubic Decimetre
                case 10->res = vv * 35.3147248;  //Cubic Foot
                case 11->res = vv * 1.3079528;  //Cubic Yard
                case 12->res = vv * 61023.8445022;  //Cubic Inch
                case 13->res = vv * 0.0008107;  //Acer-foot
                case 14->res = vv * 219.9691573;  //UK Gallon
                case 15->res = vv * 264.1720524;  //US Gallon

            }
        }
        else if (f==9){    //Cubic Decimetre
            switch (t){
                case 1->res = vv * 1000;  //Millilitre
                case 2->res = vv * 100;  //Centilitre
                case 3->res = vv * 1;  //Litre
                case 4->res = vv * 0.01;  //Hectolitres
                case 5->res = vv * 10;  //Decilitre
                case 6->res = vv * 1000000;  //Cubic Millimetre
                case 7->res = vv * 1000; //Cubic Centimetre
                case 8->res = vv * 0.001;  //Cubic Metre
                case 9->res = vv * 1; //Cubic Decimetre
                case 10->res = vv * 0.0353147248;  //Cubic Foot
                case 11->res = vv * 0.0013079528;  //Cubic Yard
                case 12->res = vv * 61.0238445022;  //Cubic Inch
                case 13->res = vv * (double) 8.107E-7;  //Acer-foot
                case 14->res = vv * 0.2199691573;  //UK Gallon
                case 15->res = vv * 0.2641720524;  //US Gallon

            }
        }

        else if (f==10){    //Cubic Foot
            switch (t){
                case 1->res = vv * 28316.800022182;  //Millilitre
                case 2->res = vv * 283.16800022182;  //Centilitre
                case 3->res = vv * 28.316800022182;  //Litre
                case 4->res = vv * 0.28316800022182;  //Hectolitres
                case 5->res = vv * 283.16800022182;  //Decilitre
                case 6->res = vv * 28316800.022182;  //Cubic Millimetre
                case 7->res = vv * 28316.800022182; //Cubic Centimetre
                case 8->res = vv * 0.028316800022182;  //Cubic Metre
                case 9->res = vv * 28.316800022182; //Cubic Decimetre
                case 10->res = vv * 1;  //Cubic Foot
                case 11->res = vv * 0.0370370378760530090096;  //Cubic Yard
                case 12->res = vv * 1728.0000013535278787478004;  //Cubic Inch
                case 13->res = vv * 0.0000229564297779829474;  //Acer-foot
                case 14->res = vv * 6.2288226383119958472286;  //UK Gallon
                case 15->res = vv * 7.4805071792601844663368;  //US Gallon

            }
        }
        else if (f==11){    //Cubic Yard
            switch (t){
                case 1->res = vv * 764553.583279152;  //Millilitre
                case 2->res = vv * 76455.3583279152;  //Centilitre
                case 3->res = vv * 764.553583279152;  //Litre
                case 4->res = vv * 7.64553583279152;  //Hectolitres
                case 5->res = vv * 7645.53583279152;  //Decilitre
                case 6->res = vv * 764553583.279152;  //Cubic Millimetre
                case 7->res = vv * 764553.583279152; //Cubic Centimetre
                case 8->res = vv * 0.764553583279152;  //Cubic Metre
                case 9->res = vv * 764.553583279152; //Cubic Decimetre
                case 10->res = vv * 26.9999993883571344573696;  //Cubic Foot
                case 11->res = vv * 1;  //Cubic Yard
                case 12->res = vv * 46655.9989796267896230781344;  //Cubic Inch
                case 13->res = vv * 0.0006198235899644085264;  //Acer-foot
                case 14->res = vv * 168.1782074246104360986096;  //UK Gallon
                case 15->res = vv * 201.9736892646279059715648;  //US Gallon

            }
        }
        else if (f==12){    //Cubic Inch
            switch (t){
                case 1->res = vv * 764553.583279152;  //Millilitre
                case 2->res = vv * 76455.3583279152;  //Centilitre
                case 3->res = vv * 764.553583279152;  //Litre
                case 4->res = vv * 7.64553583279152;  //Hectolitres
                case 5->res = vv * 7645.53583279152;  //Decilitre
                case 6->res = vv * 764553583.279152;  //Cubic Millimetre
                case 7->res = vv * 764553.583279152; //Cubic Centimetre
                case 8->res = vv * 0.764553583279152;  //Cubic Metre
                case 9->res = vv * 764.553583279152; //Cubic Decimetre
                case 10->res = vv * 26.9999993883571344573696;  //Cubic Foot
                case 11->res = vv * 1;  //Cubic Yard
                case 12->res = vv * 46655.9989796267896230781344;  //Cubic Inch
                case 13->res = vv * 0.0006198235899644085264;  //Acer-foot
                case 14->res = vv * 168.1782074246104360986096;  //UK Gallon
                case 15->res = vv * 201.9736892646279059715648;  //US Gallon

            }
        }
        else if (f==13){    //Acer-foot
            switch (t){
                case 1->res = vv * 1233501911.927963488;  //Millilitre
                case 2->res = vv * 123350191.1927963488;  //Centilitre
                case 3->res = vv * 1233501.911927963488;  //Litre
                case 4->res = vv * 12335.01911927963488;  //Hectolitres
                case 5->res = vv * 12335019.11927963488;  //Decilitre
                case 6->res = vv * 1233501911927.963488;  //Cubic Millimetre
                case 7->res = vv * 1233501911.927963488; //Cubic Centimetre
                case 8->res = vv * 1233.501911927963488;  //Cubic Metre
                case 9->res = vv * 1233501.911927963488; //Cubic Decimetre
                case 10->res = vv * 43560.7805600098680031681024;  //Cubic Foot
                case 11->res = vv * 1613.3622795115332424273664;  //Cubic Yard
                case 12->res = vv * 75273028.8666584432996311356736;  //Cubic Inch
                case 13->res = vv * 1;  //Acer-foot
                case 14->res = vv * 271332.3760947329467605286624;  //UK Gallon
                case 15->res = vv * 325856.7317133341555772227712;  //US Gallon

            }
        }
        else if (f==14){    //UK Gallon
            switch (t){
                case 1->res = vv * 4546.091880673;  //Millilitre
                case 2->res = vv * 454.6091880673;  //Centilitre
                case 3->res = vv * 4.546091880673;  //Litre
                case 4->res = vv * 0.04546091880673;  //Hectolitres
                case 5->res = vv * 45.46091880673;  //Decilitre
                case 6->res = vv * 4546091.880673;  //Cubic Millimetre
                case 7->res = vv * 4546.091880673; //Cubic Centimetre
                case 8->res = vv * 0.004546091880673;  //Cubic Metre
                case 9->res = vv * 4.546091880673; //Cubic Decimetre
                case 10->res = vv * 0.1605439836814814337904;  //Cubic Foot
                case 11->res = vv * 0.0059460736043835162344;  //Cubic Yard
                case 12->res = vv * 277.4200040189031094859806;  //Cubic Inch
                case 13->res = vv * 0.0000036855166876616011;  //Acer-foot
                case 14->res = vv * 1;  //UK Gallon
                case 15->res = vv * 1.2009504225163623032652;  //US Gallon

            }
        }
        else if (f==15){    //US Gallon
            switch (t){
                case 1->res = vv * 3785.4117834;  //Millilitre
                case 2->res = vv * 378.54117834;  //Centilitre
                case 3->res = vv * 3.7854117834;  //Litre
                case 4->res = vv * 0.037854117834;  //Hectolitres
                case 5->res = vv * 37.854117834;  //Decilitre
                case 6->res = vv * 3785411.7834;  //Cubic Millimetre
                case 7->res = vv * 3785.4117834; //Cubic Centimetre
                case 8->res = vv * 0.0037854117834;  //Cubic Metre
                case 9->res = vv * 3.7854117834; //Cubic Decimetre
                case 10->res = vv * 0.13368077538544820832;  //Cubic Foot
                case 11->res = vv * 0.00495113994125102352;  //Cubic Yard
                case 12->res = vv * 231.00038004699718722348;  //Cubic Inch
                case 13->res = vv * 0.00000306883333280238;  //Acer-foot
                case 14->res = vv * 0.83267384002798812882;  //UK Gallon
                case 15->res = vv * 1;  //US Gallon

            }
        }
        else {
            System.out.println("Invalid Input! :(");
            vol();
        }

        System.out.println(vl2+" : "+res);
        System.out.println("\n=>"+vv+" "+vl1+" is equal to "+res+" "+vl2);

        System.out.println("\nDo you want to more calculation.");
        System.out.println("1. Yes ");
        System.out.println("2. No");
        System.out.print("Enter : ");
        m=sc.nextInt();
        if (m==1){
            vol();
        }
    }
}
