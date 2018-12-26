package builderMode;

import java.util.ArrayList;

/**
 * @author: bxguo
 * @time: 2018/12/26 17:22
 */
public abstract class CarBuilder {
    abstract CarModel getCar(ArrayList<String> sequence);
}
