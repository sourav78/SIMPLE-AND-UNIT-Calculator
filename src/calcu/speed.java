package calcu;

import java.util.Scanner;

public class speed {
    public void spd(){
        Scanner sc=new Scanner(System.in);
        int f, t, m;
        double sp, res=0.00;

        String s1="Speed of Light (c)", s2="Kilometre/Second (km/s)", s3="Mile/Hour (mph)", s4="Mach (ma)", s5="Inch/Second (in/s)",s6="Metre/Second (m/s)", s7="Kilometre/Hour (km/h)";
        String sp1="", sp2="";

        System.out.println("\n\t\t\t-------------------------");
        System.out.println("\t\t\t|    Speed Calculator   |");
        System.out.println("\t\t\t-------------------------\n");

        System.out.println("Units : ");
        System.out.println("1. Speed of Light (c)                  5. Inch/Second (in/s)");
        System.out.println("2. Kilometre/Second (km/s)             6. Metre/Second (m/s)");
        System.out.println("3. Mile/Hour (mph)                     7. Kilometre/Hour (km/h)");
        System.out.println("4. Mach (ma)");

        System.out.println("\nEnter units to convert");
        System.out.print("From : ");
        f=sc.nextInt();
        System.out.print("To :");
        t=sc.nextInt();

        switch (f){
            case 1->sp1=s1;
            case 2->sp1=s2;
            case 3->sp1=s3;
            case 4->sp1=s4;
            case 5->sp1=s5;
            case 6->sp1=s6;
            case 7->sp1=s7;
        }
        switch (t){
            case 1->sp2=s1;
            case 2->sp2=s2;
            case 3->sp2=s3;
            case 4->sp2=s4;
            case 5->sp2=s5;
            case 6->sp2=s6;
            case 7->sp2=s7;
        }

        System.out.print("\nEnter "+sp1+" : ");
        sp=sc.nextDouble();

        if (f==1){    //Speed of Light (c)
            switch (t){
                case 1->res = sp * 1;  //Speed of Light (c)
                case 2->res = sp * 299796.138625734500539633;  //Kilometre/Second (km/s)
                case 3->res = sp * 670624775.152896030699124484488;  //Mile/Hour (mph)
                case 4->res = sp * 880980.9329655834032857655338;  //Mach
                case 5->res = sp * 11802997661.590118719270893841007;  //Inch/Second
                case 6->res = sp * 299796138.625734500539633;  //Metre/Second
                case 7->res = sp * 1079266099.0526442019426788;  //Kilometre/Second
            }
        }
        else if (f==2){    //Kilometre/Second (km/s)
            switch (t){
                case 1->res = sp * 0.0000033356;  //Speed of Light (c)
                case 2->res = sp * 1;  //Kilometre/Second (km/s)
                case 3->res = sp * 2236.936;  //Mile/Hour (mph)
                case 4->res = sp * 2.9386;  //Mach
                case 5->res = sp * 39370.076;  //Inch/Second
                case 6->res = sp * 1000;  //Metre/Second
                case 7->res = sp * 3600;  //Kilometre/Hour (km/h)
            }
        }
        else if (f==3){    //Mile/Hour (mph)
            switch (t){
                case 1->res = sp * 1.49114681868412858E-9;  //Speed of Light (c)
                case 2->res = sp * 0.00044704005836555;  //Kilometre/Second (km/s)
                case 3->res = sp * 1;  //Mile/Hour (mph)
                case 4->res = sp * 0.00131367191551300523;  //Mach
                case 5->res = sp * 17.60000241401631437845;  //Inch/Second
                case 6->res = sp * 0.44704005836555;  //Metre/Second
                case 7->res = sp * 1.60934421011598;  //Kilometre/Second
            }
        }
        else if (f==4){    //Mach
            switch (t){
                case 1->res = sp * 0.0000011350983461512284768248;  //Speed of Light (c)
                case 2->res = sp * 0.340298101136595658;  //Kilometre/Second (km/s)
                case 3->res = sp * 761.225073164091744823888;  //Mile/Hour (mph)
                case 4->res = sp * 1;  //Mach
                case 5->res = sp * 13397.563125297760846516982;  //Inch/Second
                case 6->res = sp * 340.298101136595658;  //Metre/Second
                case 7->res = sp * 1225.0731640917443688;  //Kilometre/Second
            }
        }
        else if (f==5){    //Inch/Second
            switch (t){
                case 1->res = sp * 8.4724239440820016E-11;  //Speed of Light (c)
                case 2->res = sp * 0.00002539999983236;  //Kilometre/Second (km/s)
                case 3->res = sp * 0.05681817402500004896;  //Mile/Hour (mph)
                case 4->res = sp * 0.000074640439507373096;  //Mach
                case 5->res = sp * 1;  //Inch/Second
                case 6->res = sp * 0.02539999983236;  //Metre/Second
                case 7->res = sp * 0.091439999396496;  //Kilometre/Second
            }
        }
        else if (f==6){    //Metre/Second
            switch (t){
                case 1->res = sp * 3.3356E-9;  //Speed of Light (c)
                case 2->res = sp * 0.001;  //Kilometre/Second (km/s)
                case 3->res = sp * 2.236936;  //Mile/Hour (mph)
                case 4->res = sp * 0.0029386;  //Mach
                case 5->res = sp * 39.370079;  //Inch/Second
                case 6->res = sp * 1;  //Metre/Second
                case 7->res = sp * 3.6;  //Kilometre/Second
            }
        }
        else if (f==7){    //Kilometre/Hour (km/h)
            switch (t){
                case 1->res = sp * 9.265555555555562968E-10;  //Speed of Light (c)
                case 2->res = sp * 0.000277777777777778;  //Kilometre/Second (km/s)
                case 3->res = sp * 0.621371111111111608208;  //Mile/Hour (mph)
                case 4->res = sp * 0.0008162777777777784308;  //Mach
                case 5->res = sp * 10.936133055555564304462;  //Inch/Second
                case 6->res = sp * 0.277777777777778;  //Metre/Second
                case 7->res = sp * 1;  //Kilometre/Second
            }
        }
        else {
            System.out.println("Invalid Input! :(");
            spd();
        }

        System.out.println(sp2+" : "+res);
        System.out.println("\n=>"+sp+" "+sp1+" is equal to "+res+" "+sp2);

        System.out.println("\nDo you want to more calculation.");
        System.out.println("1. Yes ");
        System.out.println("2. No");
        System.out.print("Enter : ");
        m=sc.nextInt();
        if (m==1){
            spd();
        }

    }
}
