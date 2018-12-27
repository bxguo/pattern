package builderMode;

import java.util.ArrayList;

/**
 * @author: bxguo
 * @time: 2018/12/26 17:12
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Director director = new Director();
            CarModel benzAAA = director.getBenzAAA();
            benzAAA.run();
        }
    }
}
