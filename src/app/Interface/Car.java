package app.Interface;

public class Car implements Transport {

    @Override
    public void move() {
        System.out.println("Товар доставляється вантажівкою.");
    }
}
