package builderMode;

import java.util.ArrayList;

/**
 * @author: bxguo
 * @time: 2018/12/25 14:38
 */
public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<String>();

    public static final String START = "start";
    public static final String STOP = "stop";
    public static final String ALARM = "alarm";

    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();

    final public void run(){
        for (String s : sequence) {
            switch (s) {
                case START:
                    this.start();
                    break;
                case STOP:
                    this.stop();
                    break;
                case ALARM:
                    this.alarm();
                    break;
                default:
                    break;
            }
        }
    }

    public final void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
