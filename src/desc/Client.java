package desc;

/**
 * @author: bxguo
 * @time: 2018/9/19 16:10
 */
public class Client {

    public static void main(String[] args) {
        Swan uglyDuck = new UglyDuck();

        uglyDuck.desc();
        uglyDuck.cry();
        uglyDuck.fly();

        System.out.println("---------------->");
        uglyDuck = new FlyDeco(uglyDuck);
        uglyDuck.fly();
    }
}
