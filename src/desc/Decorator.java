package desc;

/**
 * @author: bxguo
 * @time: 2018/9/19 16:06
 */
public class Decorator implements Swan {

    private Swan swan;

    public Decorator(Swan swan) {
        this.swan = swan;
    }

    @Override
    public void fly() {
        swan.fly();
    }

    @Override
    public void cry() {
        swan.cry();
    }

    @Override
    public void desc() {
        swan.desc();
    }
}
