package builderMode;

import java.util.ArrayList;

/**
 * @author: bxguo
 * @time: 2018/12/26 17:12
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add(CarModel.ALARM);
        sequence.add(CarModel.START);
        sequence.add(CarModel.STOP);

        BenzModel benz = new BenzModel();
        benz.setSequence(sequence);
        benz.run();
    }
}
