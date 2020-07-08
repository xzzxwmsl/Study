package chapter_12;


public class CircleClassTest {
    public static void main(String[] args) {
        try {
            CircleWithException circleOne = new CircleWithException(2.0);

            CircleWithException circleTwo = new CircleWithException(-1);

        } catch ( IllegalArgumentException ex) {
            System.out.println(ex.toString());
            System.out.println("--------------");
            ex.printStackTrace();
        }
        
        System.out.println(CircleWithException.getNumberOfObjects());
    }
}

