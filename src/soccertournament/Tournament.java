
package soccertournament;

public class Tournament {
    private String tname = "";
    private int ttcount = 0;
    private Team listOfTeam[];
    
    //constructor
    
    public Tournament(){}
    
    public Tournament(String name)
    {
        this.tname = name;
        listOfTeam = new Team[20];
    }
    
    public void addTeam(Team t)
    {
        listOfTeam[ttcount] = t;
        ttcount++;
    }
    
    public void removeTeam(Team t)
    {
        for(int i = 0; i <ttcount; i++)
            {
                if(listOfTeam[i] == t)
                {
                    listOfTeam[i] = null;
                    for(int j=i; j<ttcount-1;j++)
                    {
                        listOfTeam[j]=listOfTeam[j+1];
                    }
                    ttcount--;
                }
            }
    }
    
    public void showInfo()
    {
        System.out.println("Tornament Name : " + this.tname);
        System.out.println("Teams Are : ");
        for(int i=0; i<ttcount; i++)
        {
            //System.out.println(listOfTeam[i]);
            listOfTeam[i].showTname();
        }
    }
}
