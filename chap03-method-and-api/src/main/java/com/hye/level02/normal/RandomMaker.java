package com.hye.level02.normal;

import java.util.Random;

public class RandomMaker {
    public int randomNumber(int min, int max) {
        int random = (int) (Math.random() * (max - min + 1)) + min;
        return random;
    }

        public String randomUpperAlphabet(int length){
            String alpabet = "";
        for(int i = 0; i < length; i++){
             alpabet += (char)((int)(Math.random() * 26 + 'A'));
        }
            return alpabet;
        }

        public String rockPaperScissors(){
        String[] rps = {"rock",  "paper", "scissors"};
        Random random = new Random();
        int randomIndex = random.nextInt(rps.length);
        return rps[randomIndex];
    }

    public String tossCoin(){
        String[] coin = {"front", "back"};
        Random random = new Random();
        int randomIndex = random.nextInt(coin.length);
        return coin[randomIndex];
    }
}
