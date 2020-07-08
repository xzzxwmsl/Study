package chapter_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuotienWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = div(a, b);
            System.out.println("Result is : " + c);
        } catch (ArithmeticException | InputMismatchException exception) {
            System.out.println(exception);
            exception.printStackTrace();
            System.out.println(exception.toString());
            System.out.println(exception.getMessage());
        }
        System.out.println("FINALLY");
        // } catch (InputMismatchException ex) {
        // System.out.println("Should input Integer");
        // ex.printStackTrace();
        // System.out.println(ex.toString());
        // System.out.println(ex.getMessage());
        // }
    }

    public static int div(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("除数不能为0");

        return a / b;
    }
}