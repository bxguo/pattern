package desc;

/**
 * @author: bxguo
 * @time: 2018/9/19 16:05
 */
public class UglyDuck implements Swan {

    @Override
    public void fly() {
        System.out.println("不会飞");
    }

    @Override
    public void cry() {
        System.out.println("嘎嘎嘎~");
    }

    @Override
    public void desc() {
        System.out.println("灰黑灰黑的");

    }
}
