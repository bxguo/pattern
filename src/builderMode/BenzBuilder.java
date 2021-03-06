package builderMode;

import java.util.ArrayList;

/**
 * @author: bxguo
 * @time: 2018/12/26 17:29
 */
public class BenzBuilder extends CarBuilder {
    @Override
    CarModel getCar(ArrayList<String> sequence) {
        BenzModel benzModel = new BenzModel();
        benzModel.setSequence(sequence);
        return benzModel;
    }
}
