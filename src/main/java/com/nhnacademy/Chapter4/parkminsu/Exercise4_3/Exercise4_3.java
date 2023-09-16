package com.nhnacademy.Chapter4.parkminsu.Exercise4_3;

import java.util.HashMap;
import java.util.Map;

public class Exercise4_3 {
    private static final int SNAKEEYE = 2;
    public static void main(String[] args) {
        try{
//            DiceCollection dice = new DiceCollection();
            Map<Integer,Integer> test = new HashMap<>();
            for(int i = 0;i<10;i++){
                test.put(i,0);
            }
            for(int i = 0; i< 10;i++){
                test.put(i,i+1);
                System.out.println(test.get(i));
            }
//            simulation(dice);
        }catch (IllegalArgumentException e)
        {
            System.out.println("에러가 났습니다.");
        }
    }
    public static void simulation(DiceCollection dice){
        while (true){
            dice.rollOfDice();
            if(dice.checkSumOfTheDice(SNAKEEYE)){
                break;
            }
            System.out.printf("굴린 횟수: %d\n주사위1 눈: %d\n주사위2 눈: %d\n\n",
                    dice.getNumOfDiceRolled(),dice.getFirstDice(),dice.getSecondDice());
        }
        System.out.printf("최종 굴린 횟수: %d\n주사위1 눈: %d\n주사위2 눈: %d\n\n",
                dice.getNumOfDiceRolled(),dice.getFirstDice(),dice.getSecondDice());

    }
}
