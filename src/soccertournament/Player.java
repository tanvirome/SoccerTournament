
package soccertournament;

public class Player {
    private String playerName = "";
    private String playerPosition = "";
    
    //constructor
    public Player(){};
    
    public Player(String name, String pos)
    {
        this.playerName = name;
        this.playerPosition = pos;
    }
    
    public String getpname()
    {
        return playerName;
    }
    
    public String getppos()
    {
        return playerPosition;
    }
    
     public void showInfop()
     {
         System.out.println("Player Name : "+ this.playerName);
         System.out.println("Player Position : "+ this.playerPosition);
     }
}
