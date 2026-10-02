
/**
 * Simulates a Rock-Paper-Scissors match: 
 *    many ongoing games, keeping track of the score
 * Starting Code for use in class
 *
 * @author Michael Buescher
 * @version 2025
 */
public class RPSMatch
{
    private int compWins, humanWins, ties;
    private String humanPlay, compPlay;

    /**
     * Constructor for objects of class RPSMatch.
     * Nothing exciting here; it just sets the totals to 0 to start
     */
    public RPSMatch()
    {
        compWins = 0;
        humanWins = 0;
        ties = 0;
    }

    // --------------------------------------------------------
    // Accessor Methods to get the values from the match
    // --------------------------------------------------------
    public String getHumanPlay()
    {
        return humanPlay;
    }
    
    public String getComputerPlay()
    {
        findComputerPlay();
        return compPlay;
    }
    
    public int getHumanWins()
    {
        return humanWins;
    }
    
    public int getComputerWins()
    {
        return compWins;
    }
    
    public int getTies()
    {
        return ties;
    }
    
    public void setHumanPlay (String play)
    {
        humanPlay = play;
    }
    
    /**
     * This method choosed a random number 0, 1, or 2 to be
     * the computer's play. It then returns a String based
     * on that random number, either "rock" or "paper" or "scissors"
     * 
     * You will modify this method in Phase 2
     * 
     * @return   A String based on the computer's choice
     */
    public String findComputerPlay()
    {
        int n = (int)(Math.random() * 3);
        switch (n)
        {
            case 0 : compPlay = "Rock"; break;
            case 1 : compPlay = "Paper"; break;
            case 2 : compPlay = "Scissors"; break;
        }
        
        return compPlay;
    }
    
    /** 
     * This is the code that you will write in Phase 1.
     * 
     * getResult() determines the winner of the Rock-Paper-Scissors 
     * match between the user and the computer. The user's choice is
     * stored in the private instance variable String humanPlay 
     * and the computer's choice is stored in compPlay.
     *
     * One of the private instance variables compWins, humanWins, or ties
     * is updated as appropriate
     * 
     * @return  A String explaining the result
     */
    public String getResult()
    {
       
        return "Nothing to see here. Move along!";
    }
    
}
