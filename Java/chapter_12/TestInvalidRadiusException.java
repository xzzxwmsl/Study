package chapter_12;

public class TestInvalidRadiusException {
    public static void main(String[] args) {
        try{
            new CircleTestInvalidRadiusException(1);
            new CircleTestInvalidRadiusException(-1);
            new CircleTestInvalidRadiusException(0);
        }catch(InvalidRadiusException ex){
            System.out.println(ex);
            System.out.println(ex.getRadius());
        }finally{
            System.out.println("Numbers of Objects : "+ CircleTestInvalidRadiusException.getNumberOfObjects());
        }
    }
}

class CircleTestInvalidRadiusException {
    private double radius;
    private static int numberOfObjects = 0;

    CircleTestInvalidRadiusException() throws InvalidRadiusException {
        this(1.0);
    }

    CircleTestInvalidRadiusException(double Nradius) throws InvalidRadiusException{
        // this.radius = radius;
        setRadius(Nradius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new InvalidRadiusException(newRadius);
        }
    }

    public static int getNumberOfObjects() {
        return CircleTestInvalidRadiusException.numberOfObjects;
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }
}