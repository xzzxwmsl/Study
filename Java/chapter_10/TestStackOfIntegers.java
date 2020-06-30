package chapter_10;

import javax.naming.ldap.ManageReferralControl;

public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers(4);
        System.out.println(stackOfIntegers.isEmpty() + " " + stackOfIntegers.getSize());
        for (int i = 0; i < 8; i++) {
            stackOfIntegers.push((int) (Math.random() * 10));
        }
        System.out.println(stackOfIntegers.isEmpty() + " " + stackOfIntegers.getSize());
        for (int i = 0; i < 5; i++) {
            System.out.print(stackOfIntegers.pop()+" ");
        }
        System.out.println();
        while(!stackOfIntegers.isEmpty()){
            System.out.print(stackOfIntegers.pop()+" ");
        }
    }
}