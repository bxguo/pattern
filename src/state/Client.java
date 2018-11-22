package state;

/**
 * @author: bxguo
 * @time: 2018/9/20 11:28
 */
public class Client {
    public static void main(String[] args) {
        Human human = new Human();

        human.setState(Human.adult);

        human.work();
    }

}
