package Uppg_2_vilkor;

public class App {
    public static void main(String[] args)throws Exception{
        int litetTal=10;
        int stortTal=0;
        int tal1 = 10;
        int tal2 = 0;

        if(litetTal<1000){
            stortTal+=1000;
            System.out.println(litetTal+"är mindre än "+stortTal);
        } else {
            System.out.println(litetTal+"är mindre än "+stortTal);
        }

        System.out.println("litetTal = "+litetTal+",stortTal = "+stortTal);
        //Koden funkar inte pga variabeln "stortTal" är gjord inom en if sats och den dör efter }

        if(tal2>tal1){
            System.out.println(tal2+" är större än "+tal1);
        } else {
            System.out.println(tal2+" är mindre än "+tal1);
        }
    }
    
}
