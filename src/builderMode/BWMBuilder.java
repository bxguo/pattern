package builderMode;

import java.util.ArrayList;

/**
 * @author: bxguo
 * @time: 2018/12/26 17:29
 */
public class BWMBuilder extends CarBuilder {
    @Override
    CarModel getCar(ArrayList<String> sequence) {
        BMWModel bmwModel = new BMWModel();
        bmwModel.setSequence(sequence);
        return bmwModel;
    }
}
