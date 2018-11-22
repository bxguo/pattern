package shipei;

/**
 * @author: bxguo
 * @time: 2018/9/19 16:33
 */
public class Swaning implements Swan{

    @Override
    public void fly() {
        System.out.println("会飞会飞");
    }

    @Override
    public void cry() {
        System.out.println("吱吱吱吱吱吱");

    }

    @Override
    public void desc() {
        System.out.println("雪白的羽毛");

    }
}
