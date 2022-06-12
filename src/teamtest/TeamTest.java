package teamtest;

public class TeamTest {
    public static void main(String[] args){
        Integer teamSize=Input.getInteger("player list size: ");
        Team team=new Team(teamSize);
        Integer option;
        Integer number;
        String name;
        do{
            System.out.println("0: quit");
            System.out.println("1: add player");
            System.out.println("2: display");
            option=Input.getInteger("option: ");
            switch (option){
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1:
                    // no error checking assumes space available and player number is unique
                    number=Input.getInteger("number: ");
                    name=Input.getString("name: ");
                    team.addPlayer(number,name);
                    break;
                case 2:
                    System.out.println(team);
                    break;
                default:
                    System.out.println("invalid option");
            }
        }while(option!=0);
    }
}
