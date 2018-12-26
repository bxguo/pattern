package builderMode;

/**
 * @author: bxguo
 * @time: 2018/12/26 17:06
 */
public class BenzModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("奔驰启动");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰停车");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰--哔哔哔---");
    }
}
