package observemode;

/**
 * @author: bxguo
 * @time: 2019/1/9 11:19
 */
public class Client {
    public static void main(String[] args) {
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(new LiSi());
        hanFeiZi.addObserver(new LiWu());
        hanFeiZi.haveFun();
    }
}
