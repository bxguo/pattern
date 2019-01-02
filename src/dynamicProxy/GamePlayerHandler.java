package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: bxguo
 * @time: 2018/12/28 17:07
 */
public class GamePlayerHandler implements InvocationHandler {

    Class cls = null;
    Object obj = null;

    public GamePlayerHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(this.obj, args);

        if (method.getName().endsWith("login")) {
            System.out.println("---------正在使用登录方法---------");
        }
        return invoke;
    }
}
