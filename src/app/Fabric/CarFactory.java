package app.Fabric;

import app.Interface.Car;
import app.Interface.Transport;

public class CarFactory extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
