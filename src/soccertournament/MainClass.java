
package soccertournament;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // TODO code application logic here
        String pname;
        String ppos;
        int pc=0;
        String tname;
        String cname;
        
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter Team Name : ");
        tname = sc.nextLine();
        System.out.printf("Enter Coach Name : ");
        cname = sc.nextLine();
        Team t1 = new Team (tname, cname);
        
        do
        {
            System.out.println("Enter Player Name : ");
            pname = sc.nextLine();
            System.out.println("Player Position : ");
            ppos = sc.nextLine();
            Player p1 = new Player(pname,ppos);
            t1.addPlayer(p1);
            pc++;
            System.out.printf("Do You Want To Add More Player : ");
            char c;
            c=sc.next().charAt(0);
            if(c == 'y' || c == 'Y')
            {
                if(pc < 22)
                {
                    continue;
                }
                else
                {
                    System.out.println("Your Team Is Full");
                    break;
                }
            }
            if(c == 'n' || c == 'N')
            {
                break;
            }
        }while(true);
        
        
        
        //Player p1 = new Player("Messi", "Right Wing");
        
        
        //t1.addPlayer(p1);
        //t1.removePlayer(p1);
        //p1.showInfop();
        t1.showInfot();
        //Tournament t = new Tournament("la");
        //t.addTeam(t1);
        //t.showInfo();
        
    }
    
}
