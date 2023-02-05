package calcu;
import calcu.length;
import calcu.weight;
import calcu.volume;
import calcu.currency;
import java.util.Scanner;
public class other {
    public void othr(){
        Scanner sc=new Scanner(System.in);
        length ln=new length();
        weight wg=new weight();
        volume vm=new volume();
        currency cu=new currency();
        speed sp=new speed();
        age ag=new age();

        int n;

        System.out.println("\n\t\t\t-------------------------");
        System.out.println("\t\t\t|     Unit Converter    |");
        System.out.println("\t\t\t-------------------------\n");
        System.out.println("1. Length Calculator");
        System.out.println("2. Weight Calculator");
        System.out.println("3. Volume Calculator");
        System.out.println("4. Currency Calculator");
        System.out.println("5. Speed Calculator");
        System.out.println("6. Age Calculator");

        System.out.print("\nEnter : ");
        n=sc.nextInt();

        if (n==1){
            ln.len();
        }
        else if(n==2){
            wg.wght();
        }
        else if(n==3){
            vm.vol();
        }
        else if(n==4){
            cu.curr();
        }
        else if(n==5){
            sp.spd();
        }
        else if(n==6){
            ag.aged();
        }
        else {
            othr();
        }

        sc.close();

    }
}
