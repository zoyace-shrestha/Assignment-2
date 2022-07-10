public class Team
{
    // attributes
    private String name;
    private String mascot;
    private String league;
    private int wins;
    private int draws;
    private int losses;
    private double pct;
    private int points;

    /**
     * Constructors for objects of class Team
     */
    // default constructor
    public Team()
    {
        // initialise instance variables
        name = new String("NoName");
        mascot = new String("AnyCar");
        league = new String("Greenland Premier League");
        wins = 0;
        draws = 0;
        losses = 0;
        pct = 0.0;
        points = 0;
    }
    
    // constructor that takes Team attributes as parameters
    public Team(String name, String mascot, String league,
                int wins, int draws, int losses, double pct, int points)
    {
        this.name = new String(name);
        this.mascot = new String(mascot);
        this.league = new String(league);
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
        this.pct = pct;
        this.points = points;
    }
                   

    /**
     * print method for Team
     * 
     * @param   none
     * @return  none 
     */
    public void print()
    {
        System.out.println("  Team Information");
        System.out.println("-----------------------");
        System.out.printf(" Name:    %s%n", name);
        System.out.printf(" Mascot:  %s%n", mascot);
        System.out.printf(" League:  %s%n", league);
        System.out.printf(" Record:  %d-%d-%d%n", wins, draws, losses);
        System.out.printf(" Win Pct: %.3f%n", pct);
        System.out.printf(" Points:  %d%n", points);
    }
    
    
    /**
     * Compare method for teams
     * 
     * Print a table comparing data of three teams
     * 
     * @param  three car instances: team1, team2, team3
     * @return none
     */
    public static void compare(Team team1, Team team2, Team team3)
    {
         System.out.printf("%44s%n", "Team Comparison");
         System.out.println("----------------------------------------------------------------------");
         System.out.printf(" Name:            %-18s %-18s %-18s%n", team1.name, team2.name, team3.name);
         System.out.printf(" Mascot:          %-18s %-18s %-18s%n", team1.mascot, team2.mascot, team3.mascot);
         System.out.printf(" League:          %-18s %-18s %-18s%n", team1.league, team2.league, team3.league);
         System.out.printf(" Record:          %d-%d-%d" +
        		           "             %d-%d-%d" + 
        		           "             %d-%d-%d%n", team1.wins, team1.draws, team1.losses,
        		                                   team2.wins, team2.draws, team2.losses,
        		                                   team3.wins, team3.draws, team3.losses);                             
         System.out.printf(" Win Pct:         %-18.3f %-18.3f %-18.3f%n", team1.pct, team2.pct, team3.pct);
         System.out.printf(" Points:          %-18d %-18d %-18d%n", team1.points, team2.points, team3.points);
    }
    
    // getters -- methods that return the value of an attribute
    public String getName()
    {
        return name;
    }
    
    public String getMascot()
    {
        return mascot;
    }
    
    public String getLeague()
    {
        return league;
    }
    
    public int getWins()
    {
        return wins;
    }

    public int getDraws()
    {
        return draws;
    }

    public int getLosses()
    {
        return losses;
    }

    public double getPct()
    {
        return pct;
    }
    
    public int getPoints()
    {
        return points;
    }

    // setters -- methods that set (change) the value of an attribute
    public void setName(String newName)
    {
        name = new String(newName);
    }
    
    public void setMascot(String newMascot)
    {
        mascot = new String(newMascot);
    }
    
    public void setLeague(String newLeague)
    {
        league = newLeague;
    }
    
    public void setWins(int newWins)
    {
        wins = newWins;
    }
    
    public void setDraws(int newDraws)
    {
        draws = newDraws;
    }
    
    public void setLosses(int newLosses)
    {
        losses = newLosses;
    }
    
    public void setPct(double newPct)
    {
        pct = newPct;
    }
    
    public void setPoints(int newPoints)
    {
        points = newPoints;
    }
}
