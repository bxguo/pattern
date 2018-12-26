package builderMode;

import java.util.ArrayList;

/**
 * @author: bxguo
 * @time: 2018/12/26 17:55
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<String>();

    public CarModel getBenzAAA(){
        BenzModel benz = new BenzModel();
        sequence.add(CarModel.START);
        sequence.add(CarModel.STOP);
        sequence.add(CarModel.ALARM);
        benz.setSequence(sequence);
        return benz;
    }
    public CarModel getBenzBBB(){
        BenzModel benz = new BenzModel();
        sequence.add(CarModel.ALARM);
        sequence.add(CarModel.START);
        sequence.add(CarModel.STOP);
        benz.setSequence(sequence);
        return benz;
    }
    public CarModel getBWMAAA(){
        BenzModel benz = new BenzModel();
        sequence.add(CarModel.START);
        sequence.add(CarModel.ALARM);
        sequence.add(CarModel.STOP);
        benz.setSequence(sequence);
        return benz;
    }
}
