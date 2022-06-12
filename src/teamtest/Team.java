package teamtest;

public class Team {
    private Player[] players;
    private Integer numberOfPlayers;
    
    public Team(Integer teamSize){
        this.players=new Player[teamSize];
        this.numberOfPlayers=0;
        
    }
    
    public void addPlayer(Integer number, String name){
        // no error checking - assumes space in array and number is unique
        this.players[this.numberOfPlayers]=new Player(number,name);
        this.numberOfPlayers++;
        
    }
    
    public String toString(){
        String teamDetails=new String();
        if (this.numberOfPlayers!=0)
            for(Integer player=0;player<this.numberOfPlayers;player++)
                teamDetails+=this.players[player]+"\n";
        else
            teamDetails+="player list is empty";
        
        return teamDetails;
    }
}
