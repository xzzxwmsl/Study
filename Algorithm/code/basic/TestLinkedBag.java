package code.basic;

import java.util.Random;

public class TestLinkedBag {
    public static void main(String[] args) {
        LinkedBag<String> bag = new LinkedBag<>();
        for (String string : bag) {
            System.out.println(string);
        }

        System.out.println("-----------------------");
        
        for (int i = 0; i < 10; i++) {
            bag.add(getRandomString(i * 2 + 1));
        }

        for (String string : bag) {
            System.out.println(string);
        }

    }

    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
