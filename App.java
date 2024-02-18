package Uppg_2_vilkor;

import java.util.Scanner;

public class App {
    public static void main(String[] args)throws Exception{
        Scanner tangentbord = new Scanner(System.in);

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

        System.out.println("Vad är klockan?: ");
        int tid = tangentbord.nextInt();

        if(tid<7){
            System.out.println("Du borde värkligen gå och lägga dig");
        } else if (tid>=7&&tid<=8){
            System.out.println("dags att gå upp");
        } else if (tid==12){
            System.out.println("Dags att äta");
        } else if (tid>=23){
            System.out.println("Dags att gå och lägga sig");
        }

        System.out.println("Skriv in din ålder: ");
        int ålder = tangentbord.nextInt();
        if(ålder >=18){
            System.out.println("Du får komma in i klubben");
        } else if (ålder<18){
            System.out.println("Du får inte komma in i klubben");
        }

        System.out.println("Skriv in användarnamn: ");
        String namn = tangentbord.nextLine();
        System.out.println("Skriv in lösenordet: ");
        String lösen = tangentbord.nextLine();
        int point = 0;

        if(namn.equalsIgnoreCase("root")){
            point=1;
            System.out.println("Skriv in lösenordet:");
        } 
        if(lösen.equalsIgnoreCase("passwd")){
            point=point+1;
            System.out.println(point);
        }
        System.out.println(point);
        if(point==2){
            System.out.println("Du är inloggad!");
        }
    }
    
}
