import org.example.BowlingGame;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BowlingGameTest {

    @Test
    public void getScoreForAllStrikes(){
        BowlingGame bowlingGame = new BowlingGame();

        assertEquals(300,bowlingGame.getScoreForALlStrikes("X X X X X X X X X X X X"));
    }

    @Test
    public void getScoreForMissedRolls(){
        BowlingGame bowlingGame = new BowlingGame();

        assertEquals(0,bowlingGame.getScoreForALlMissedRolls("- - - - - - - - - -"));
    }

    @Test
    public void getScoreForALlSpares(){
        BowlingGame bowlingGame = new BowlingGame();

        assertEquals(100,bowlingGame.getScoreForAlLSpares("0/ 0/ 0/ 0/ 0/ 0/ 0/ 0/ 0/ 0/"));
    }

    @Test
    public void getScoreForALlDigits(){
        BowlingGame bowlingGame = new BowlingGame();

        assertEquals(68,bowlingGame.getScoreForBowling("25 24 45 34 16 45 43 21 62 23"));
    }

    @Test
    public void getScoreForStrikeAndDigit(){
        BowlingGame bowlingGame = new BowlingGame();

        assertEquals(94,bowlingGame.getScoreForBowling("25 X 43 X 16 45 21 X 23 61"));
    }

    @Test
    public void getScoreForSpareAndDigit(){
        BowlingGame bowlingGame = new BowlingGame();

        assertEquals(106,bowlingGame.getScoreForBowling("23 4/ 5/ 62 43 0/ 5/ 62 45 16"));
    }


}
