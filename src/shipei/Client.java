package shipei;

/**
 * @author: bxguo
 * @time: 2018/9/19 16:10
 */
public class Client {

    public static void main(String[] args) {
        Swaning uglyDuck = new UglyDuck();
        uglyDuck.cry();
        uglyDuck.desc();
        uglyDuck.fly();
        System.out.println("--------------");


        Duck duck = new UglyDuck();
        duck.cry();
        duck.desc();
        duck.fly();
    }
}
