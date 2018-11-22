package DIP;

public class Driver implements IDriver{

    private ICar car;

    @Override
    public void driver(ICar car) {
        car.run();
    }
}
