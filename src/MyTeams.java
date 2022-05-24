
/**
 * Tester program for the Team class.
 * 
 * This program basically compare three soccer team by calculating Wins, Draws, Losses, Win Percentage( Pct ) and Points 
 * There are 38 games in total where Wins, Draws are randomly generated while loss is calculated from the Wins and Draws.
 * The Win Percentage( Pct ) and Points are calculated accordingly to the Value of Wins, Draws and Losses
 * 
 * Zoyace Shrestha
 * CS120 Section2
 * Fall 2019
 * 
 * Programming Assignment 2
 * September 23, 2019
 */
import java.util.Random;

public class MyTeams
{
    public static void main(String[] args)
    {
    	
    	Random rand = new Random();
    	
        // an example (much hated) Team
        Team arsenal = new Team("Arsenal", "Who cares", "EPL", 0, 0, 38, 0.000, 0);
        
//        // First Team ( Leicester City )
//        
//        int Wins;
//        int Draws;
//        int Loss;
//        double Pct;
//        int Points;
//        
//        // Second Team  ( Barcelona FC )
//        
//        int Wins2 ;
//        int Draws2 ;
//        int Loss2 ;
//        double Pct2 ;
//        int Points2 ;
//        
//        // Third Team  ( Dortmund FC )
//        
//        int Wins3 ;
//        int Draws3 ;
//        int Loss3 ;
//        double Pct3 ;
//        int Points3 ;
//        
//        // Calculation of First Team ( Leicester City )
//        
//        Wins = rand.nextInt( (34) + 2 );
//        Draws = rand.nextInt( 38 - Wins );
//        Loss = (38 - Wins - Draws) ;
//        Pct = ( Wins/(double)(38) );
//        Points = ( ( 3 * Wins) + (Draws) );
//        
//        // Calculation of Second Team ( Barcelona FC )
//        
//        Wins2 = rand.nextInt( (34) + 2 );
//        Draws2 = rand.nextInt( (38) - Wins2 );
//        Loss2 = ( 38 - Wins2 - Draws2 );
//        Pct2 = ( Wins2/ (double)(38) );
//        Points2 = ( 3* (Wins2) + (Draws) );
//        
//        // Calculation of Third Team ( Dortmund  FC )
//        
//        Wins3 = rand.nextInt( (34) + 2 );
//        Draws3 = rand.nextInt( 38 - Wins3 );
//        Loss3 = ( 38 - Wins3 - Draws3 );
//        Pct3 = ( Wins3 / (double)(38) );
//        Points3 = ( (3* Wins3) + Draws );
//               
//        // Team Attributes For Leicester City and Barcelona FC 
//        
//        Team Leicester = new Team("Leicester City", "Foxes", "EPL", Wins, Draws, Loss, Pct, Points);
//        Team Barcelona = new Team("Barcelona FC", "Blaugrana", "La Liga", Wins2, Draws2, Loss2, Pct2, Points2);
//       
//        //Team Attributes For Dortmund FC
//        
//        Team Dortmund = new Team();
//        Dortmund.setName("Dortmund");
//        Dortmund.setMascot("Borussia");
//        Dortmund.setLeague("Bundesliga");
//        Dortmund.setWins(Wins3);
//        Dortmund.setDraws(Draws3);
//        Dortmund.setLosses(Loss3);
//        Dortmund.setPct(Pct3);
//        Dortmund.setPoints(Points3);
//    
//        
//        // an example call to the print method
          arsenal.print();
          System.out.println();
//                        
//        // Comparing Three Teams
//        Team.compare( Leicester , Barcelona, Dortmund);
//        System.out.println();     
//                
          
          //Leicester 
          
         
          int win; 
          int loss;
          int draw;
          double winPcts;
          int points;
          
          win = rand.nextInt(34) + 2;
          draw = rand.nextInt(38 - win);
          loss = (38 - (win + draw));
          winPcts = ( win/(double)(38) );
          points = ( (3* win) + draw );
          
          int w2 = rand.nextInt(34) + 2;
          int d2 = rand.nextInt(38 - w2);
          int l2 = (38 - (w2 + d2));
          double wp2 = (w2/(double)(38));
          int p2 = ( 3* w2 +  d2);
          
          Team Leicester = new Team("Leicester" , "Foxes" , "EPL" , win , loss , draw , winPcts, points);
          Leicester.print();
          Team Barcelona = new Team("Barcelona" , "Dog" , "UEFA" , w2 , d2, l2, wp2, p2);
          Barcelona.print();
          
          Team.compare( Leicester, Barcelona, arsenal);
          
          
          
          
          
    }
}
