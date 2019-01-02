package dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author: bxguo
 * @time: 2018/12/28 17:19
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer();
        GamePlayerHandler handler = new GamePlayerHandler(player);

        Class[] interfaces = {IGamePlayer.class};
        ClassLoader classLoader = player.getClass().getClassLoader();
        IGamePlayer instance = (IGamePlayer) Proxy.newProxyInstance(classLoader, interfaces, handler);

        instance.login();
        instance.killBoss();
        instance.upgrade();

    }
}
