package chapter_6;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hex = input.nextLine();
        System.out.println(hex2Dec(hex));
    }

    public static int hex2Dec(String hex) {
        int re=0;
        for(int i=0;i<hex.length();i++){
            re=16*re+hexChar2Dec(hex.charAt(i));
        }
        return re;
    }

    public static int hexChar2Dec(char c) {
        if (Character.isDigit(c)) {
            return c - '0';
        } else {
            c = Character.toLowerCase(c);
            return 10 + c - 'a';
        }
    }
}