package builderMode;

/**
 * @author: bxguo
 * @time: 2018/12/26 17:06
 */
public class BMWModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("宝马启动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停车");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马--哔哔哔---");
    }
}
