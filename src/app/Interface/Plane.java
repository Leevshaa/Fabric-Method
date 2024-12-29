package app.Interface;

public class Plane implements Transport {

    @Override
    public void move() {
        System.out.println("Товар доставляється літаком.");
    }
}
