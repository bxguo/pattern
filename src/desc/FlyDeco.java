package desc;

/**
 * @author: bxguo
 * @time: 2018/9/19 16:09
 */
public class FlyDeco extends Decorator {

    public FlyDeco(Swan swan) {
        super(swan);
    }

    @Override
    public void fly() {
        System.out.println("会飞了哦噢噢噢噢");
    }
}
