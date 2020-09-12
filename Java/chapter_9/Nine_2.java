package chapter_9;

import java.util.Date;
import java.util.Random;


public class Nine_2 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date now is : " + date.toString());
        System.out.println("Time from 1970.1.1 to now have " + date.getTime() + " milliseconds.");
        Random random = new Random();
        for(int i=3;i<10;i++){
            System.out.print(random.nextInt(5)+" ");
        }


    }
}