package shipei;

/**
 * @author: bxguo
 * @time: 2018/9/19 16:34
 */
public class UglyDuck extends Swaning implements Duck {

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void cry() {
        super.cry();
    }

    @Override
    public void desc() {
        System.out.println("还会游泳");
        super.desc();
    }
}
