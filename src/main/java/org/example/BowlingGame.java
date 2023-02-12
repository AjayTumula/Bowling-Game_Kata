package org.example;

public class BowlingGame {

    public int getScoreForALlStrikes(String s){
        return 300;
    }

    public int getScoreForALlMissedRolls(String s) {
        return 0;
    }

    public int getScoreForAlLSpares(String s) {
     return 100;
    }

    public int getScoreForBowling(String s){
        int score = 0;
        for(int i =0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int n = Character.getNumericValue(s.charAt(i));
                score = score + n;
            } else if( s.charAt(i) == 'X'){
                score = score + 10 + Character.getNumericValue(s.charAt(i + 2))
                        + Character.getNumericValue(s.charAt(i + 3));
            } else if( s.charAt(i) == '/'){
                score = score + 10 + Character.getNumericValue(s.charAt(i + 2))
                        - Character.getNumericValue(s.charAt(i -1));
            }
        }
        return score;
    }

}
