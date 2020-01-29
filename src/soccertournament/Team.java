
package soccertournament;

public class Team {
    private String teamName = "";
    private String couchName = "";
    private Player listOfPlayer[];
    public int playerCounter = 0;
    
    //constructor
    public Team(){}
    
    public Team(String tname, String cname)
    {
        this.teamName = tname;
        this.couchName = cname;
        listOfPlayer = new Player[22];
    }
    
    public void addPlayer(Player p)
    {
        if(playerCounter < 22)
        {
            listOfPlayer[playerCounter] = p;
            playerCounter++;
        }
        else
        {
            System.out.println("Team Has No Space To Add Player");
        }
    }
    
    public void removePlayer(Player p)
    {
        if(playerCounter > 0)
        {
            for(int i = 0; i <playerCounter; i++)
            {
                if(listOfPlayer[i] == p)
                {
                    listOfPlayer[i] = null;
                    for(int j=i; j<playerCounter-1;j++)
                    {
                        listOfPlayer[j]=listOfPlayer[j+1];
                    }
                    playerCounter--;
                }
            }
        }
        else
        {
            System.out.println("None");
        }
    }
    
    public void showInfot()
    {
        System.out.println("Team Name : " + this.teamName);
        System.out.println("Couch Name : " + this.couchName);
        System.out.println("Player List : ");
        for(int i=0; i<playerCounter; i++)
        {
            //System.out.println(listOfPlayer[i]);
            listOfPlayer[i].showInfop();
        }
    }
    public void showTname()
    {
        System.out.println(this.teamName);
    }
}
