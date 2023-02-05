package calcu;
import java.util.Scanner;
public class currency {

    static double convert(int t,double cc, double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10, double a11, double a12, double a13, double a14, double a15, double a16, double a17, double a18, double a19, double a20, double a21, double a22, double a23, double a24 ){
        double r=0;
        switch (t){
            case 1->r = cc * a1;  //Indian Rupee (INR)
            case 2->r = cc * a2;  //US Dollar (USD)
            case 3->r = cc * a3;  //Chinese Yuan (CNY)
            case 4->r = cc * a4;  //Pound Sterling (GBP)
            case 5->r = cc * a5;  // Japanese Yen (JPY)
            case 6->r = cc * a6;  // Euro (EUR)
            case 7->r = cc * a7;  //Korean Won (KRW)
            case 8->r = cc * a8;  //Argentine Peso (ARS)
            case 9->r = cc * a9;  //Australian Dollar (AUD)
            case 10->r = cc * a10;  //Brazilian Real (BRl)
            case 11->r = cc * a11;  //Russian Ruble (RUB)
            case 12->r = cc * a12;  //Indonesian Rupiah (IDR)
            case 13->r = cc * a13;  //Iraqi Dinar (IQD)
            case 14->r = cc * a14;  //Kuwaiti Dinar (KWD)
            case 15->r = cc * a15;  //Mexican Peso (MXN)
            case 16->r = cc * a16;  //New Zealand Dollar (NZD)
            case 17->r = cc * a17;  //Omani Rial (OMR)
            case 18->r = cc * a18;  //Pakistani Rupee (PKR)
            case 19->r = cc * a19;  //Iranian Rial (IRR)
            case 20->r = cc * a20;  //UAE Dir-ham (AED)
            case 21->r = cc * a21;  //Saudi Riyal (SAR)
            case 22->r = cc * a22;  //Swedish Krona (SEK)
            case 23->r = cc * a23;  //Veitnamese Dong (VND)
            case 24->r = cc * a24;  //South African Rand (ZAR)
        }
        return r;
    }
    public void curr(){
        Scanner sc=new Scanner(System.in);
        int f, t, m;
        double cc, res=0.00;

        String c1="Indian Rupee (INR)", c2="US Dollar (USD)", c3="Chinese Yuan (CNY)", c4="Pound Sterling (GBP)", c5="Japanese Yen (JPY)", c6="Euro (EUR)",
                c7="Korean Won (KRW)", c8="Argentine Peso (ARS)", c9="Australian Dollar (AUD)", c10="Brazilian Real (BRl)", c11="Russian Ruble (RUB)", c12="Indonesian Rupiah (IDR)",
                c13="Iraqi Dinar (IQD)", c14="Kuwaiti Dinar (KWD)", c15="Mexican Peso (MXN)", c16="New Zealand Dollar (NZD)", c17="Omani Rial (OMR)", c18="Pakistani Rupee (PKR)",
                c19="Iranian Rial (IRR)", c20="UAE Dir-ham (AED)", c21="Saudi Riyal (SAR)", c22="Swedish Krona (SEK)", c23="Veitnamese Dong (VND)", c24="South African Rand (ZAR)";

        String cu1="", cu2="";
        System.out.println("\n\t\t\t-------------------------");
        System.out.println("\t\t\t|    Currency Calculator   |");
        System.out.println("\t\t\t-------------------------\n");

        System.out.println("Currencies  : ");
        System.out.println("1. Indian Rupee (INR)                       13. Iraqi Dinar (IQD)");
        System.out.println("2. US Dollar (USD)                          14. Kuwaiti Dinar (KWD)");
        System.out.println("3. Chinese Yuan (CNY)                       15. Mexican Peso (MXN)");
        System.out.println("4. Pound Sterling (GBP)                     16. New Zealand Dollar (NZD)");
        System.out.println("5. Japanese Yen (JPY)                       17. Omani Rial (OMR)");
        System.out.println("6. Euro (EUR)                               18. Pakistani Rupee (PKR)");
        System.out.println("7. Korean Won (KRW)                         19. Iranian Rial (IRR)");
        System.out.println("8. Argentine Peso (ARS)                     20. UAE Dir-ham (AED)");
        System.out.println("9. Australian Dollar (AUD)                  21. Saudi Riyal (SAR)");
        System.out.println("10. Brazilian Real (BRl)                    22. Swedish Krona (SEK)");
        System.out.println("11. Russian Ruble (RUB)                     23. Veitnamese Dong (VND)");
        System.out.println("12. Indonesian Rupiah (IDR)                 24. South African Rand (ZAR)");

        System.out.println("\nEnter currency to convert");
        System.out.print("From : ");
        f=sc.nextInt();
        System.out.print("To :");
        t=sc.nextInt();

        switch (f){
            case 1->cu1=c1;
            case 2->cu1=c2;
            case 3->cu1=c3;
            case 4->cu1=c4;
            case 5->cu1=c5;
            case 6->cu1=c6;
            case 7->cu1=c7;
            case 8->cu1=c8;
            case 9->cu1=c9;
            case 10->cu1=c10;
            case 11->cu1=c11;
            case 12->cu1=c12;
            case 13->cu1=c13;
            case 14->cu1=c14;
            case 15->cu1=c15;
            case 16->cu1=c16;
            case 17->cu1=c17;
            case 18->cu1=c18;
            case 19->cu1=c19;
            case 20->cu1=c20;
            case 21->cu1=c21;
            case 22->cu1=c22;
            case 23->cu1=c23;
            case 24->cu1=c24;
        }
        switch (t){
            case 1->cu2=c1;
            case 2->cu2=c2;
            case 3->cu2=c3;
            case 4->cu2=c4;
            case 5->cu2=c5;
            case 6->cu2=c6;
            case 7->cu2=c7;
            case 8->cu2=c8;
            case 9->cu2=c9;
            case 10->cu2=c10;
            case 11->cu2=c11;
            case 12->cu2=c12;
            case 13->cu2=c13;
            case 14->cu2=c14;
            case 15->cu2=c15;
            case 16->cu2=c16;
            case 17->cu2=c17;
            case 18->cu2=c18;
            case 19->cu2=c19;
            case 20->cu2=c20;
            case 21->cu2=c21;
            case 22->cu2=c22;
            case 23->cu2=c23;
            case 24->cu2=c24;
        }

        System.out.print("\nEnter "+cu1+" : ");
        cc=sc.nextDouble();

        if (f==1){    //Indian Rupee (INR)
            switch (t){
                case 1->res = cc * 1;  //Indian Rupee (INR)
                case 2->res = cc * 0.012;  //US Dollar (USD)
                case 3->res = cc * 0.84;  //Chinese Yuan (CNY) 
                case 4->res = cc * 0.010;  //Pound Sterling (GBP)
                case 5->res = cc * 1.60;  // Japanese Yen (JPY) 
                case 6->res = cc * 0.011;  // Euro (EUR) 
                case 7->res = cc * 16.41;  //Korean Won (KRW)
                case 8->res = cc * 2.25;  //Argentine Peso (ARS)    
                case 9->res = cc * 0.018;  //Australian Dollar (AUD)  
                case 10->res = cc * 0.064;  //Brazilian Real (BRl) 
                case 11->res = cc * 0.84;  //Russian Ruble (RUB)
                case 12->res = cc * 184.27;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 17.81;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.0037;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 0.23;  //Mexican Peso (MXN)
                case 16->res = cc * 0.019;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.0047;  //Omani Rial (OMR)
                case 18->res = cc * 2.80;  //Pakistani Rupee (PKR)
                case 19->res = cc * 513.95;  //Iranian Rial (IRR)
                case 20->res = cc * 0.045;  //UAE Dir-ham (AED)
                case 21->res = cc * 0.046;  //Saudi Riyal (SAR)
                case 22->res = cc * 0.13;  //Swedish Krona (SEK)
                case 23->res = cc * 287.95;  //Vietnamese Dong (VND)
                case 24->res = cc * 0.21;  //South African Rand (ZAR)
            }
        }
        else if (f==2){    //US Dollar (USD)
            switch (t){
                case 1->res = cc * 81.43;  //Indian Rupee (INR)
                case 2->res = cc * 1;  //US Dollar (USD)
                case 3->res = cc * 6.78;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.81;  //Pound Sterling (GBP)
                case 5->res = cc * 130.19;  // Japanese Yen (JPY)
                case 6->res = cc * 0.92;  // Euro (EUR)
                case 7->res = cc * 1227.98;  //Korean Won (KRW)
                case 8->res = cc * 183.45;  //Argentine Peso (ARS)
                case 9->res = cc * 1.43;  //Australian Dollar (AUD)
                case 10->res = cc * 5.21;  //Brazilian Real (BRl)
                case 11->res = cc * 68.67;  //Russian Ruble (RUB)
                case 12->res = cc * 15017.40;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 1450.11;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.31;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 18.85;  //Mexican Peso (MXN)
                case 16->res = cc * 1.54;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.39;  //Omani Rial (OMR)
                case 18->res = cc * 228.40;  //Pakistani Rupee (PKR)
                case 19->res = cc * 41850.00;  //Iranian Rial (IRR)
                case 20->res = cc * 3.67;  //UAE Dir-ham (AED)
                case 21->res = cc * 3.76;  //Saudi Riyal (SAR)
                case 22->res = cc * 10.24;  //Swedish Krona (SEK)
                case 23->res = cc * 23450.00;  //Vietnamese Dong (VND)
                case 24->res = cc * 17.15;  //South African Rand (ZAR)
            }
        }
        else if (f==3){    //Chinese Yuan (CNY)
            switch (t){
                case 1->res = cc * 12.00;  //Indian Rupee (INR)
                case 2->res = cc * 0.15;  //US Dollar (USD)
                case 3->res = cc * 1;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.12;  //Pound Sterling (GBP)
                case 5->res = cc * 19.19;  // Japanese Yen (JPY)
                case 6->res = cc * 0.14;  // Euro (EUR)
                case 7->res = cc * 181.22;  //Korean Won (KRW)
                case 8->res = cc * 27.04;  //Argentine Peso (ARS)
                case 9->res = cc * 0.21;  //Australian Dollar (AUD)
                case 10->res = cc * 0.77;  //Brazilian Real (BRl)
                case 11->res = cc * 10.11;  //Russian Ruble (RUB)
                case 12->res = cc * 2215.03;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 213.74;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.045;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 2.78;  //Mexican Peso (MXN)
                case 16->res = cc * 0.23;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.057;  //Omani Rial (OMR)
                case 18->res = cc * 33.66;  //Pakistani Rupee (PKR)
                case 19->res = cc * 6168.47;  //Iranian Rial (IRR)
                case 20->res = cc * 0.54;  //UAE Dir-ham (AED)
                case 21->res = cc * 0.55;  //Saudi Riyal (SAR)
                case 22->res = cc * 1.51;  //Swedish Krona (SEK)
                case 23->res = cc * 3456.41;  //Vietnamese Dong (VND)
                case 24->res = cc * 2.53;  //South African Rand (ZAR)
            }
        }
        else if (f==4){    //Pound Sterling (GBP)
            switch (t){
                case 1->res = cc * 100.56;  //Indian Rupee (INR)
                case 2->res = cc * 1.24;  //US Dollar (USD)
                case 3->res = cc * 8.38;  //Chinese Yuan (CNY)
                case 4->res = cc * 1;  //Pound Sterling (GBP)
                case 5->res = cc * 161.10;  // Japanese Yen (JPY)
                case 6->res = cc * 1.14;  // Euro (EUR)
                case 7->res = cc * 1518.01;  //Korean Won (KRW)
                case 8->res = cc * 226.62;  //Argentine Peso (ARS)
                case 9->res = cc * 1.77;  //Australian Dollar (AUD)
                case 10->res = cc * 6.43;  //Brazilian Real (BRl)
                case 11->res = cc * 84.85;  //Russian Ruble (RUB)
                case 12->res = cc * 18534.50;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 1791.90;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.38;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 23.30;  //Mexican Peso (MXN)
                case 16->res = cc * 1.91;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.48;  //Omani Rial (OMR)
                case 18->res = cc * 282.23;  //Pakistani Rupee (PKR)
                case 19->res = cc * 51714.05;  //Iranian Rial (IRR)
                case 20->res = cc * 4.54;  //UAE Dir-ham (AED)
                case 21->res = cc * 4.64;  //Saudi Riyal (SAR)
                case 22->res = cc * 12.65;  //Swedish Krona (SEK)
                case 23->res = cc * 28973.41;  //Vietnamese Dong (VND)
                case 24->res = cc * 21.20;  //South African Rand (ZAR)
            }
        }
        else if (f==5){    //Japanese Yen (JPY)
            switch (t){
                case 1->res = cc * 0.63;  //Indian Rupee (INR)
                case 2->res = cc * 0.0077;  //US Dollar (USD)
                case 3->res = cc * 0.052;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.0062;  //Pound Sterling (GBP)
                case 5->res = cc * 1;  // Japanese Yen (JPY)
                case 6->res = cc * 0.0071;  // Euro (EUR)
                case 7->res = cc * 9.49;  //Korean Won (KRW)
                case 8->res = cc * 1.42;  //Argentine Peso (ARS)
                case 9->res = cc * 0.011;  //Australian Dollar (AUD)
                case 10->res = cc * 0.040;  //Brazilian Real (BRl)
                case 11->res = cc * 0.53;  //Russian Ruble (RUB)
                case 12->res = cc * 115.08;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 11.21;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.0023;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 0.14;  //Mexican Peso (MXN)
                case 16->res = cc * 0.012;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.0030;  //Omani Rial (OMR)
                case 18->res = cc * 1.78;  //Pakistani Rupee (PKR)
                case 19->res = cc * 321.81;  //Iranian Rial (IRR)
                case 20->res = cc * 0.028;  //UAE Dir-ham (AED)
                case 21->res = cc * 0.029;  //Saudi Riyal (SAR)
                case 22->res = cc * 0.078;  //Swedish Krona (SEK)
                case 23->res = cc * 180.10;  //Vietnamese Dong (VND)
                case 24->res = cc * 0.13;  //South African Rand (ZAR)
            }
        }
        else if (f==6){    //Euro (EUR)
            switch (t){
                case 1->res = cc * 88.69;  //Indian Rupee (INR)
                case 2->res = cc * 1.09;  //US Dollar (USD)
                case 3->res = cc * 7.37;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.88;  //Pound Sterling (GBP)
                case 5->res = cc * 141.50;  // Japanese Yen (JPY)
                case 6->res = cc * 1;  // Euro (EUR)
                case 7->res = cc * 1341.63;  //Korean Won (KRW)
                case 8->res = cc * 200.31;  //Argentine Peso (ARS)
                case 9->res = cc * 1.55;  //Australian Dollar (AUD)
                case 10->res = cc * 5.67;  //Brazilian Real (BRl)
                case 11->res = cc * 74.71;  //Russian Ruble (RUB)
                case 12->res = cc * 16277.51;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 1585.74;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.33;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 20.48;  //Mexican Peso (MXN)
                case 16->res = cc * 1.68;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.42;  //Omani Rial (OMR)
                case 18->res = cc * 251.52;  //Pakistani Rupee (PKR)
                case 19->res = cc * 45522.26;  //Iranian Rial (IRR)
                case 20->res = cc * 3.99;  //UAE Dir-ham (AED)
                case 21->res = cc * 4.08;  //Saudi Riyal (SAR)
                case 22->res = cc * 11.10;  //Swedish Krona (SEK)
                case 23->res = cc * 25479.97;  //Vietnamese Dong (VND)
                case 24->res = cc * 18.77;  //South African Rand (ZAR)
            }
        }
        else if (f==7){    //Korean Won (KRW)
            switch (t){
                case 1->res = cc * 0.066;  //Indian Rupee (INR)
                case 2->res = cc * 0.00081;  //US Dollar (USD)
                case 3->res = cc * 0.0055;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.00066;  //Pound Sterling (GBP)
                case 5->res = cc * 0.11;  // Japanese Yen (JPY)
                case 6->res = cc * 0.00074;  // Euro (EUR)
                case 7->res = cc * 1;  //Korean Won (KRW)
                case 8->res = cc * 0.15;  //Argentine Peso (ARS)
                case 9->res = cc * 0.0012;  //Australian Dollar (AUD)
                case 10->res = cc * 0.0042;  //Brazilian Real (BRl)
                case 11->res = cc * 0.056;  //Russian Ruble (RUB)
                case 12->res = cc * 12.12;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 1.18;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.00025;  //Kuwaiti Dinar (KWD)
                case 15->res = cc *0.015 ;  //Mexican Peso (MXN)
                case 16->res = cc * 0.0012;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.00031;  //Omani Rial (OMR)
                case 18->res = cc * 0.19;  //Pakistani Rupee (PKR)
                case 19->res = cc * 33.91;  //Iranian Rial (IRR)
                case 20->res = cc * 0.0030;  //UAE Dir-ham (AED)
                case 21->res = cc * 0.0030;  //Saudi Riyal (SAR)
                case 22->res = cc * 0.0083;  //Swedish Krona (SEK)
                case 23->res = cc * 18.98;  //Vietnamese Dong (VND)
                case 24->res = cc * 0.014;  //South African Rand (ZAR)
            }
        }
        else if (f==8){    //Argentine Peso (ARS)
            res=convert(t, cc, 0.44, 0.0054, 0.037, 0.0044, 0.71, 0.0050, 6.70, 1, 0.0077, 0.028, 0.37, 81.25,7.92, 0.0017, 0.10, 0.0084, 0.0021, 1.26, 227.27, 0.020, 0.020,0.055, 127.21, 0.094);
        }
        else if (f==9){    //Australian Dollar (AUD)
            switch (t){
                case 1->res = cc * 58.02;  //Indian Rupee (INR)
                case 2->res = cc * 0.71;  //US Dollar (USD)
                case 3->res = cc * 4.83;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.57;  //Pound Sterling (GBP)
                case 5->res = cc * 92.29;  // Japanese Yen (JPY)
                case 6->res = cc * 0.65;  // Euro (EUR)
                case 7->res = cc * 877.47;  //Korean Won (KRW)
                case 8->res = cc * 131.69;  //Argentine Peso (ARS)
                case 9->res = cc * 1;  //Australian Dollar (AUD)
                case 10->res = cc * 3.61;  //Brazilian Real (BRl)
                case 11->res = cc * 49.12;  //Russian Ruble (RUB)
                case 12->res = cc * 10648.97;  //Indonesian Rupiah (IDR)
                case 13->res = cc *1033.22 ;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.22;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 13.38;  //Mexican Peso (MXN)
                case 16->res = cc * 1.10;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.27;  //Omani Rial (OMR)
                case 18->res = cc *164.12 ;  //Pakistani Rupee (PKR)
                case 19->res = cc * 30023.82;  //Iranian Rial (IRR)
                case 20->res = cc * 2.61;  //UAE Dir-ham (AED)
                case 21->res = cc * 2.67;  //Saudi Riyal (SAR)
                case 22->res = cc * 7.28;  //Swedish Krona (SEK)
                case 23->res = cc * 16687.84;  //Vietnamese Dong (VND)
                case 24->res = cc * 12.15;  //South African Rand (ZAR)
            }
        }
        else if (f==10){    //Brazilian Real (BRl)
            switch (t){
                case 1->res = cc * 16.07;  //Indian Rupee (INR)
                case 2->res = cc * 0.20;  //US Dollar (USD)
                case 3->res = cc * 1.34;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.16;  //Pound Sterling (GBP)
                case 5->res = cc * 25.59;  // Japanese Yen (JPY)
                case 6->res = cc * 0.18;  // Euro (EUR)
                case 7->res = cc * 243.06;  //Korean Won (KRW)
                case 8->res = cc * 36.46;  //Argentine Peso (ARS)
                case 9->res = cc * 0.28;  //Australian Dollar (AUD)
                case 10->res = cc * 1;  //Brazilian Real (BRl)
                case 11->res = cc * 13.60;  //Russian Ruble (RUB)
                case 12->res = cc * 2950.12;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 286.23;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.060;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 3.71;  //Mexican Peso (MXN)
                case 16->res = cc * 0.30;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.076;  //Omani Rial (OMR)
                case 18->res = cc * 45.45;  //Pakistani Rupee (PKR)
                case 19->res = cc * 8317.57;  //Iranian Rial (IRR)
                case 20->res = cc * 0.72;  //UAE Dir-ham (AED)
                case 21->res = cc * 0.74;  //Saudi Riyal (SAR)
                case 22->res = cc * 2.02;  //Swedish Krona (SEK)
                case 23->res = cc * 4621.96;  //Vietnamese Dong (VND)
                case 24->res = cc * 3.37;  //South African Rand (ZAR)
            }
        }
        else if (f==11){    //Russian Ruble (RUB)
            switch (t){
                case 1->res = cc * 1.18;  //Indian Rupee (INR)
                case 2->res = cc * 0.014;  //US Dollar (USD)
                case 3->res = cc * 0.098;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.012;  //Pound Sterling (GBP)
                case 5->res = cc * 1.88;  // Japanese Yen (JPY)
                case 6->res = cc * 0.013;  // Euro (EUR)
                case 7->res = cc * 17.86;  //Korean Won (KRW)
                case 8->res = cc * 2.68;  //Argentine Peso (ARS)
                case 9->res = cc * 0.020;  //Australian Dollar (AUD)
                case 10->res = cc * 0.074;  //Brazilian Real (BRl)
                case 11->res = cc * 1;  //Russian Ruble (RUB)
                case 12->res = cc * 216.90;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 21.04;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.0044;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 0.27;  //Mexican Peso (MXN)
                case 16->res = cc * 0.022;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.0056;  //Omani Rial (OMR)
                case 18->res = cc * 3.34;  //Pakistani Rupee (PKR)
                case 19->res = cc * 611.45;  //Iranian Rial (IRR)
                case 20->res = cc * 0.053;  //UAE Dir-ham (AED)
                case 21->res = cc * 0.054;  //Saudi Riyal (SAR)
                case 22->res = cc * 0.15;  //Swedish Krona (SEK)
                case 23->res = cc * 339.78;  //Vietnamese Dong (VND)
                case 24->res = cc * 0.25;  //South African Rand (ZAR)
            }
        }
        else if (f==12){    //Indonesian Rupiah (IDR)
            switch (t){
                case 1->res = cc * 0.0054;  //Indian Rupee (INR)
                case 2->res = cc * 0.000067;  //US Dollar (USD)
                case 3->res = cc * 0.00045;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.000054;  //Pound Sterling (GBP)
                case 5->res = cc * 0.0087;  // Japanese Yen (JPY)
                case 6->res = cc * 0.0046;  // Euro (EUR)
                case 7->res = cc * 0.082;  //Korean Won (KRW)
                case 8->res = cc * 0.012;  //Argentine Peso (ARS)
                case 9->res = cc * 0.000094;  //Australian Dollar (AUD)
                case 10->res = cc * 0.00034;  //Brazilian Real (BRl)
                case 11->res = cc * 0.0046;  //Russian Ruble (RUB)
                case 12->res = cc * 1;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 0.097;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.000020;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 0.0013;  //Mexican Peso (MXN)
                case 16->res = cc * 0.00010;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.000026;  //Omani Rial (OMR)
                case 18->res = cc * 0.015;  //Pakistani Rupee (PKR)
                case 19->res = cc * 2.82;  //Iranian Rial (IRR)
                case 20->res = cc * 0.00025;  //UAE Dir-ham (AED)
                case 21->res = cc * 0.00025;  //Saudi Riyal (SAR)
                case 22->res = cc * 0.00068;  //Swedish Krona (SEK)
                case 23->res = cc * 1.57;  //Vietnamese Dong (VND)
                case 24->res = cc * 0.0011;  //South African Rand (ZAR)
            }
        }
        else if (f==13){    //Iraqi Dinar (IQD)
            switch (t){
                case 1->res = cc * 0.056;  //Indian Rupee (INR)
                case 2->res = cc * 0.00069;  //US Dollar (USD)
                case 3->res = cc * 0.0046;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.00055;  //Pound Sterling (GBP)
                case 5->res = cc * 0.089;  // Japanese Yen (JPY)
                case 6->res = cc * 0.00063;  // Euro (EUR)
                case 7->res = cc * 0.84;  //Korean Won (KRW)
                case 8->res = cc * 0.13;  //Argentine Peso (ARS)
                case 9->res = cc * 0.00097;  //Australian Dollar (AUD)
                case 10->res = cc * 0.0035;  //Brazilian Real (BRl)
                case 11->res = cc * 0.048;  //Russian Ruble (RUB)
                case 12->res = cc * 10.28;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 1;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.00021;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 0.013;  //Mexican Peso (MXN)
                case 16->res = cc * 0.0011;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.00026;  //Omani Rial (OMR)
                case 18->res = cc * 0.18;  //Pakistani Rupee (PKR)
                case 19->res = cc * 28.94;  //Iranian Rial (IRR)
                case 20->res = cc * 0.0025;  //UAE Dir-ham (AED)
                case 21->res = cc * 0.0026;  //Saudi Riyal (SAR)
                case 22->res = cc * 0.0071;  //Swedish Krona (SEK)
                case 23->res = cc * 16.10;  //Vietnamese Dong (VND)
                case 24->res = cc * 0.012;  //South African Rand (ZAR)
            }
        }
        else if (f==14){    //Kuwaiti Dinar (KWD)
            switch (t){
                case 1->res = cc * 4.34;  //Indian Rupee (INR)
                case 2->res = cc * 3.28;  //US Dollar (USD)
                case 3->res = cc * 0.36;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.043;  //Pound Sterling (GBP)
                case 5->res = cc * 6.92;  // Japanese Yen (JPY)
                case 6->res = cc * 0.049;  // Euro (EUR)
                case 7->res = cc * 4022.53;  //Korean Won (KRW)
                case 8->res = cc * 9.93;  //Argentine Peso (ARS)
                case 9->res = cc * 0.075;  //Australian Dollar (AUD)
                case 10->res = cc * 0.27;  //Brazilian Real (BRl)
                case 11->res = cc * 229.03;  //Russian Ruble (RUB)
                case 12->res = cc * 797.11;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 77.62;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.016;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 61.51;  //Mexican Peso (MXN)
                case 16->res = cc * 5.04;  //New Zealand Dollar (NZD)
                case 17->res = cc * 1.26;  //Omani Rial (OMR)
                case 18->res = cc * 852.34;  //Pakistani Rupee (PKR)
                case 19->res = cc * 1;  //Iranian Rial (IRR)
                case 20->res = cc * 12.04;  //UAE Dir-ham (AED)
                case 21->res = cc * 12.30;  //Saudi Riyal (SAR)
                case 22->res = cc * 33.82;  //Swedish Krona (SEK)
                case 23->res = cc * 76888.84;  //Vietnamese Dong (VND)
                case 24->res = cc * 56.72;  //South African Rand (ZAR)
            }
        }
        else if (f==15){    //Mexican Peso (MXN)
            switch (t){
                case 1->res = cc * 4.34;  //Indian Rupee (INR)
                case 2->res = cc * 0.053;  //US Dollar (USD)
                case 3->res = cc * 0.36;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.043;  //Pound Sterling (GBP)
                case 5->res = cc * 6.92;  // Japanese Yen (JPY)
                case 6->res = cc * 0.049;  // Euro (EUR)
                case 7->res = cc * 65.36;  //Korean Won (KRW)
                case 8->res = cc * 9.93;  //Argentine Peso (ARS)
                case 9->res = cc * 0.075;  //Australian Dollar (AUD)
                case 10->res = cc * 0.27;  //Brazilian Real (BRl)
                case 11->res = cc * 3.73;  //Russian Ruble (RUB)
                case 12->res = cc * 797.45;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 77.65;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.016;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 1;  //Mexican Peso (MXN)
                case 16->res = cc * 0.082;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.020;  //Omani Rial (OMR)
                case 18->res = cc * 13.85;  //Pakistani Rupee (PKR)
                case 19->res = cc * 2246.22;  //Iranian Rial (IRR)
                case 20->res = cc * 0.20;  //UAE Dir-ham (AED)
                case 21->res = cc * 0.20;  //Saudi Riyal (SAR)
                case 22->res = cc * 0.55;  //Swedish Krona (SEK)
                case 23->res = cc * 1249.21;  //Vietnamese Dong (VND)
                case 24->res = cc * 0.92;  //South African Rand (ZAR)
            }
        }
        else if (f==16){    //New Zealand Dollar (NZD)
            switch (t){
                case 1->res = cc * 52.97;  //Indian Rupee (INR)
                case 2->res = cc * 0.65;  //US Dollar (USD)
                case 3->res = cc * 4.39;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.52;  //Pound Sterling (GBP)
                case 5->res = cc * 84.52;  // Japanese Yen (JPY)
                case 6->res = cc * 0.60;  // Euro (EUR)
                case 7->res = cc * 798.26;  //Korean Won (KRW)
                case 8->res = cc * 121.22;  //Argentine Peso (ARS)
                case 9->res = cc * 0.92;  //Australian Dollar (AUD)
                case 10->res = cc * 3.32;  //Brazilian Real (BRl)
                case 11->res = cc * 45.43;  //Russian Ruble (RUB)
                case 12->res = cc * 9733.56;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 947.91;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.20;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 12.21;  //Mexican Peso (MXN)
                case 16->res = cc * 1;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.25;  //Omani Rial (OMR)
                case 18->res = cc * 169.06;  //Pakistani Rupee (PKR)
                case 19->res = cc * 27417.02;  //Iranian Rial (IRR)
                case 20->res = cc * 2.39;  //UAE Dir-ham (AED)
                case 21->res = cc * 2.44;  //Saudi Riyal (SAR)
                case 22->res = cc * 6.71;  //Swedish Krona (SEK)
                case 23->res = cc * 15246.21;  //Vietnamese Dong (VND)
                case 24->res = cc * 11.27;  //South African Rand (ZAR)
            }
        }
        else if (f==17){    //Omani Rial (OMR)
            switch (t){
                case 1->res = cc * 212.18;  //Indian Rupee (INR)
                case 2->res = cc * 2.60;  //US Dollar (USD)
                case 3->res = cc * 17.55;  //Chinese Yuan (CNY)
                case 4->res = cc * 2.11;  //Pound Sterling (GBP)
                case 5->res = cc * 338.52;  // Japanese Yen (JPY)
                case 6->res = cc * 2.40;  // Euro (EUR)
                case 7->res = cc * 3199.12;  //Korean Won (KRW)
                case 8->res = cc * 484.53;  //Argentine Peso (ARS)
                case 9->res = cc * 3.69;  //Australian Dollar (AUD)
                case 10->res = cc * 13.29;  //Brazilian Real (BRl)
                case 11->res = cc * 183.16;  //Russian Ruble (RUB)
                case 12->res = cc * 38928.67;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 3804.50;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.79;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 48.79;  //Mexican Peso (MXN)
                case 16->res = cc * 4.03;  //New Zealand Dollar (NZD)
                case 17->res = cc * 1;  //Omani Rial (OMR)
                case 18->res = cc * 678.38;  //Pakistani Rupee (PKR)
                case 19->res = cc * 109614.33;  //Iranian Rial (IRR)
                case 20->res = cc * 9.54;  //UAE Dir-ham (AED)
                case 21->res = cc * 9.75;  //Saudi Riyal (SAR)
                case 22->res = cc * 27.06;  //Swedish Krona (SEK)
                case 23->res = cc * 60904.79;  //Vietnamese Dong (VND)
                case 24->res = cc * 45.27;  //South African Rand (ZAR)
            }
        }
        else if (f==18){    //Pakistani Rupee (PKR)
            switch (t){
                case 1->res = cc * 0.31;  //Indian Rupee (INR)
                case 2->res = cc * 0.0038;  //US Dollar (USD)
                case 3->res = cc * 0.026;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.0031;  //Pound Sterling (GBP)
                case 5->res = cc * 0.50;  // Japanese Yen (JPY)
                case 6->res = cc * 0.0035;  // Euro (EUR)
                case 7->res = cc * 4.72;  //Korean Won (KRW)
                case 8->res = cc * 0.71;  //Argentine Peso (ARS)
                case 9->res = cc * 0.0054;  //Australian Dollar (AUD)
                case 10->res = cc * 0.020;  //Brazilian Real (BRl)
                case 11->res = cc * 0.27;  //Russian Ruble (RUB)
                case 12->res = cc * 57.41;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 5.61;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.0012;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 0.072;  //Mexican Peso (MXN)
                case 16->res = cc * 0.0059;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.0015;  //Omani Rial (OMR)
                case 18->res = cc * 1;  //Pakistani Rupee (PKR)
                case 19->res = cc * 161.59;  //Iranian Rial (IRR)
                case 20->res = cc * 0.014;  //UAE Dir-ham (AED)
                case 21->res = cc * 0.014;  //Saudi Riyal (SAR)
                case 22->res = cc * 0.040;  //Swedish Krona (SEK)
                case 23->res = cc * 89.78;  //Vietnamese Dong (VND)
                case 24->res = cc * 0.067;  //South African Rand (ZAR)
            }
        }
        else if (f==19){    //Iranian Rial (IRR)
            switch (t){
                case 1->res = cc * 0.0019;  //Indian Rupee (INR)
                case 2->res = cc * 0.000024;  //US Dollar (USD)
                case 3->res = cc * 0.00016;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.000019;  //Pound Sterling (GBP)
                case 5->res = cc * 0.0031;  // Japanese Yen (JPY)
                case 6->res = cc * 0.000022;  // Euro (EUR)
                case 7->res = cc * 0.029;  //Korean Won (KRW)
                case 8->res = cc * 0.0044;  //Argentine Peso (ARS)
                case 9->res = cc * 0.000034;  //Australian Dollar (AUD)
                case 10->res = cc * 0.00012;  //Brazilian Real (BRl)
                case 11->res = cc * 0.0017;  //Russian Ruble (RUB)
                case 12->res = cc * 0.36;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 0.035;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.0000072;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 0.00044;  //Mexican Peso (MXN)
                case 16->res = cc * 0.000037;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.0000091;  //Omani Rial (OMR)
                case 18->res = cc * 0.0062;  //Pakistani Rupee (PKR)
                case 19->res = cc * 1;  //Iranian Rial (IRR)
                case 20->res = cc * 0.000087;  //UAE Dir-ham (AED)
                case 21->res = cc * 0.000089;  //Saudi Riyal (SAR)
                case 22->res = cc * 0.00025;  //Swedish Krona (SEK)
                case 23->res = cc * 0.56;  //Vietnamese Dong (VND)
                case 24->res = cc * 0.00041;  //South African Rand (ZAR)
            }
        }
        else if (f==20){    //UAE Dir-ham (AED)
            switch (t){
                case 1->res = cc * 22.24;  //Indian Rupee (INR)
                case 2->res = cc * 0.27;  //US Dollar (USD)
                case 3->res = cc * 1.84;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.22;  //Pound Sterling (GBP)
                case 5->res = cc * 35.48;  // Japanese Yen (JPY)
                case 6->res = cc * 0.25;  // Euro (EUR)
                case 7->res = cc * 335.22;  //Korean Won (KRW)
                case 8->res = cc * 50.80;  //Argentine Peso (ARS)
                case 9->res = cc *0.39;  //Australian Dollar (AUD)
                case 10->res = cc * 1.39;  //Brazilian Real (BRl)
                case 11->res = cc * 19.20;  //Russian Ruble (RUB)
                case 12->res = cc * 4082.11;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 398.76;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.083;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 5.11;  //Mexican Peso (MXN)
                case 16->res = cc * 0.42;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.10;  //Omani Rial (OMR)
                case 18->res = cc * 71.10;  //Pakistani Rupee (PKR)
                case 19->res = cc * 11488.93;  //Iranian Rial (IRR)
                case 20->res = cc * 1;  //UAE Dir-ham (AED)
                case 21->res = cc * 1.02;  //Saudi Riyal (SAR)
                case 22->res = cc * 2.83;  //Swedish Krona (SEK)
                case 23->res = cc * 6383.57;  //Vietnamese Dong (VND)
                case 24->res = cc * 4.74;  //South African Rand (ZAR)
            }
        }
        else if (f==21){    //Saudi Riyal (SAR)
            switch (t){
                case 1->res = cc * 21.77;  //Indian Rupee (INR)
                case 2->res = cc * 0.27;  //US Dollar (USD)
                case 3->res = cc * 1.80;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.22;  //Pound Sterling (GBP)
                case 5->res = cc * 34.67;  // Japanese Yen (JPY)
                case 6->res = cc * 0.25;  // Euro (EUR)
                case 7->res = cc * 328.18;  //Korean Won (KRW)
                case 8->res = cc * 0.38;  //Argentine Peso (ARS)
                case 9->res = cc * 0.38;  //Australian Dollar (AUD)
                case 10->res = cc * 1.36;  //Brazilian Real (BRl)
                case 11->res = cc * 18.74;  //Russian Ruble (RUB)
                case 12->res = cc * 3997.81;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 390.28;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.081;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 5.00;  //Mexican Peso (MXN)
                case 16->res = cc * 0.41;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.10;  //Omani Rial (OMR)
                case 18->res = cc * 69.59;  //Pakistani Rupee (PKR)
                case 19->res = cc * 11244.55;  //Iranian Rial (IRR)
                case 20->res = cc * 0.98;  //UAE Dir-ham (AED)
                case 21->res = cc * 1;  //Saudi Riyal (SAR)
                case 22->res = cc * 2.77;  //Swedish Krona (SEK)
                case 23->res = cc * 124955.77;  //Vietnamese Dong (VND)
                case 24->res = cc * 4.64;  //South African Rand (ZAR)
            }
        }
        else if (f==22){    //Swedish Krona (SEK)
            switch (t){
                case 1->res = cc * 7.86;  //Indian Rupee (INR)
                case 2->res = cc * 0.096;  //US Dollar (USD)
                case 3->res = cc * 0.65;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.078;  //Pound Sterling (GBP)
                case 5->res = cc * 12.51;  // Japanese Yen (JPY)
                case 6->res = cc * 0.089;  // Euro (EUR)
                case 7->res = cc * 118.48;  //Korean Won (KRW)
                case 8->res = cc * 17.94;  //Argentine Peso (ARS)
                case 9->res = cc * 0.14;  //Australian Dollar (AUD)
                case 10->res = cc * 0.49;  //Brazilian Real (BRl)
                case 11->res = cc * 6.76;  //Russian Ruble (RUB)
                case 12->res = cc * 1442.66;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 140.83;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.029;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 1.80;  //Mexican Peso (MXN)
                case 16->res = cc * 0.15;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.037;  //Omani Rial (OMR)
                case 18->res = cc * 25.11;  //Pakistani Rupee (PKR)
                case 19->res = cc * 4057.47;  //Iranian Rial (IRR)
                case 20->res = cc * 0.35;  //UAE Dir-ham (AED)
                case 21->res = cc * 0.36;  //Saudi Riyal (SAR)
                case 22->res = cc * 1;  //Swedish Krona (SEK)
                case 23->res = cc * 2255.76;  //Vietnamese Dong (VND)
                case 24->res = cc * 1.67;  //South African Rand (ZAR)
            }
        }
        else if (f==23){    //Vietnamese Dong (VND)
            switch (t){
                case 1->res = cc * 0.0035;  //Indian Rupee (INR)
                case 2->res = cc * 0.000043;  //US Dollar (USD)
                case 3->res = cc * 0.00029;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.000035;  //Pound Sterling (GBP)
                case 5->res = cc * 0.0056;  // Japanese Yen (JPY)
                case 6->res = cc * 0.000039;  // Euro (EUR)
                case 7->res = cc * 0.053;  //Korean Won (KRW)
                case 8->res = cc * 0.0080;  //Argentine Peso (ARS)
                case 9->res = cc * 0.000061;  //Australian Dollar (AUD)
                case 10->res = cc * 0.00022;  //Brazilian Real (BRl)
                case 11->res = cc * 0.0030;  //Russian Ruble (RUB)
                case 12->res = cc * 0.64;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 0.062;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.000013;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 0.00080;  //Mexican Peso (MXN)
                case 16->res = cc * 0.000066;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.000016;  //Omani Rial (OMR)
                case 18->res = cc * 0.011;  //Pakistani Rupee (PKR)
                case 19->res = cc * 1.80;  //Iranian Rial (IRR)
                case 20->res = cc * 0.00016;  //UAE Dir-ham (AED)
                case 21->res = cc * 0.00016;  //Saudi Riyal (SAR)
                case 22->res = cc * 0.00044;  //Swedish Krona (SEK)
                case 23->res = cc * 1;  //Vietnamese Dong (VND)
                case 24->res = cc *0.00074 ;  //South African Rand (ZAR)
            }
        }
        else if (f==24){    //South African Rand (ZAR)
            switch (t){
                case 1->res = cc * 4.70;  //Indian Rupee (INR)
                case 2->res = cc * 0.057;  //US Dollar (USD)
                case 3->res = cc * 0.39;  //Chinese Yuan (CNY)
                case 4->res = cc * 0.047;  //Pound Sterling (GBP)
                case 5->res = cc * 7.47;  // Japanese Yen (JPY)
                case 6->res = cc * 0.053;  // Euro (EUR)
                case 7->res = cc * 70.83;  //Korean Won (KRW)
                case 8->res = cc * 10.71;  //Argentine Peso (ARS)
                case 9->res = cc * 0.082;  //Australian Dollar (AUD)
                case 10->res = cc * 0.29;  //Brazilian Real (BRl)
                case 11->res = cc * 4.04;  //Russian Ruble (RUB)
                case 12->res = cc * 861.87;  //Indonesian Rupiah (IDR)
                case 13->res = cc * 84.09;  //Iraqi Dinar (IQD)
                case 14->res = cc * 0.018;  //Kuwaiti Dinar (KWD)
                case 15->res = cc * 1.08;  //Mexican Peso (MXN)
                case 16->res = cc * 0.089;  //New Zealand Dollar (NZD)
                case 17->res = cc * 0.022;  //Omani Rial (OMR)
                case 18->res = cc * 15.00;  //Pakistani Rupee (PKR)
                case 19->res = cc * 2422.89;  //Iranian Rial (IRR)
                case 20->res = cc * 0.21;  //UAE Dir-ham (AED)
                case 21->res = cc * 0.22;  //Saudi Riyal (SAR)
                case 22->res = cc * 0.60;  //Swedish Krona (SEK)
                case 23->res = cc * 1346.84;  //Vietnamese Dong (VND)
                case 24->res = cc * 1;  //South African Rand (ZAR)
            }
        }
        else {
            System.out.println("Invalid Input! :(");
            curr();
        }

        System.out.println(cu2+" : "+res);
        System.out.println("\n=>"+cc+" "+cu1+" is equal to "+res+" "+cu2);

        System.out.println("\nDo you want to more calculation.");
        System.out.println("1. Yes ");
        System.out.println("2. No");
        System.out.print("Enter : ");
        m=sc.nextInt();
        if (m==1){
            curr();
        }
    }
}
