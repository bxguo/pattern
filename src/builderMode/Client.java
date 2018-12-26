package builderMode;

import java.util.ArrayList;

/**
 * @author: bxguo
 * @time: 2018/12/26 17:12
 */
public class Client {
    public static void main(String[] args) {
        CarBuilder benzBuilder = new BenzBuilder();
        CarModel carModel = benzBuilder.getCarModel();
        carModel.run();
    }
}
