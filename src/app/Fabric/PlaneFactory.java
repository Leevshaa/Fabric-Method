package app.Fabric;

import app.Interface.Plane;
import app.Interface.Transport;

public class PlaneFactory extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
