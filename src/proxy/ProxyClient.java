package proxy;

import java.lang.reflect.Proxy;

/**
 * @author: bxguo
 * @time: 2018/7/23 15:15
 */
public class ProxyClient {

    public static void main(String[] args) {

        Calculator calculator = new CalculatorImpl();

        LogHandler handler = new LogHandler(calculator);

        Calculator c = (Calculator)Proxy.newProxyInstance(calculator.getClass().getClassLoader(), calculator.getClass().getInterfaces(), handler);

        System.out.println(c.add(1, 2));
    }
}
