package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: bxguo
 * @time: 2018/7/23 15:17
 */
public class LogHandler implements InvocationHandler {

    private Object obj;

    public LogHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        this.doBefore();

        Object o = method.invoke(proxy, args);

        this.doAfter();

        return o;
    }

    private void doAfter(){
        System.out.println("前");
    }

    private void doBefore(){
        System.out.println("后");
    }

}
