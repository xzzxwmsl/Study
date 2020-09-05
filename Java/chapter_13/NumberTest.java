package chapter_13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class NumberTest {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(new BigDecimal("2.2222222213123333"));
        numbers.add(new BigInteger("1231231231"));
        numbers.add(new BigDecimal(Math.pow(10, 19)+""));
        numbers.add(Math.pow(10, 3));
        System.out.println(getMaxNumber(numbers));
    }

    public static Number getMaxNumber(ArrayList<Number> numbers) {
        if (numbers.size() == 0 || numbers == null)
            return null;

        Number maxValue = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (maxValue.doubleValue() < numbers.get(i).doubleValue()) {
                maxValue = numbers.get(i);
            }
        }
        return maxValue;
    }
}
