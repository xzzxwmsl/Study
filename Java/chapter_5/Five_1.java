package chapter_5;

import java.util.Scanner;
// while
public class Five_1 {
    public static void main(String[] args) {
        int flag;
        int randomInt=(int)(Math.random()*100);
        Scanner input=new Scanner(System.in);
        flag=input.nextInt();
        while(flag!=randomInt){
            if(flag<randomInt){
                System.out.printf("Higher than %d, try again !\n",flag);
            }else{
                System.out.printf("Lower than %d, try again !\n", flag);
            }
            flag=input.nextInt();
        }
        System.out.println("Right ! Answer is "+randomInt);
    }
}