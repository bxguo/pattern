package dynamicProxy;

/**
 * @author: bxguo
 * @time: 2018/12/28 17:17
 */
public class GamePlayer implements IGamePlayer {

    @Override
    public void login() {
        System.out.println("张三登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println("张三在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println("张三升级了");
    }
}
