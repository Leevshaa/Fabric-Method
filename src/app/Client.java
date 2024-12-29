package app;

import app.Fabric.CarFactory;
import app.Fabric.PlaneFactory;
import app.Interface.Transport;

public class Client {

    private void run() {

        CarFactory carFactory = new CarFactory();
        PlaneFactory planeFactory = new PlaneFactory();

        Transport car = carFactory.createTransport();
        Transport plane = planeFactory.createTransport();

        car.move();
        plane.move();
    }

    public void getRun() {
        run();
    }
}
