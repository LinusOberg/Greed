package c11log.greed;

import java.util.ArrayList;

/**
 * Created by Maria on 2015-01-19.
 */
public class scoreCalc {
    int score = 0;
    int totalScore = 0;
    public scoreCalc () {

    }

    public void saveScore(die[] dices){

    }

    public int calcScore(die[] dices){
        score = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;
        for(die oneDie : dices){
            switch (oneDie.getValue()){
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
                case 3:
                    threes++;
                    break;
                case 4:
                    fours++;
                    break;
                case 5:
                    fives++;
                    break;
                case 6:
                    sixes++;
                    break;
            }
        }
        //stege
        if(ones == 1 && twos == 1 && threes == 1 && fours == 1 && fives == 1 && sixes ==1){
            score = 1000;
            return 1000;
        }
        else {
            if(ones >= 3){
                score = score+1000;

            }
            if(twos >= 3){
                score = score+200;
            }
            if(threes >= 3){
                score = score+300;
            }
            if(fours >= 3){
                score = score+400;
            }
            if(fives >= 3){
                score = score+500;
            }
            if(sixes >= 3){
                score = score+600;
            }
            if(ones < 3){
                score = score+(ones*100);
            }
            if(fives < 3){
                score = score+(fives*50);
            }
        }
        return score;

    }
}
