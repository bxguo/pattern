package observemode;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: bxguo
 * @time: 2019/1/9 11:15
 */
public class LiWu implements Observer {

    @Override
    public void update(Observable observable, Object arg) {
        System.out.println("李武观察到了-----");
        System.out.println("观察内容：" + arg);
    }
}
