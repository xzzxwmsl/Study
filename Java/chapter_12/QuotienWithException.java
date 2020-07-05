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
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        } catch (InputMismatchException ex) {
            System.out.println("Should input Integer");
        }
    }

    public static int div(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("除数不能为0");

        return a / b;
    }
}