package proxy;

/**
 * @author: bxguo
 * @time: 2018/7/23 15:12
 */
public class CalculatorProxy implements Calculator {

    private Calculator calculator;

    public CalculatorProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        return calculator.add(a, b);
    }
}
