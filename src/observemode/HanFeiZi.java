package observemode;

import java.util.Observable;

/**
 * @author: bxguo
 * @time: 2019/1/9 11:03
 */
public class HanFeiZi extends Observable implements IHanFeiZi {



    @Override
    public void haveFun() {
        System.out.println("韩非子玩耍一波");
        super.setChanged();
        super.notifyObservers("观察到韩非子玩耍一波");
    }

    @Override
    public void haveBreakfast() {

    }
}
