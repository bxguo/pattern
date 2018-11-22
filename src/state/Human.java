package state;

/**
 * @author: bxguo
 * @time: 2018/9/20 11:19
 */
public class Human {

    public static final HumanState adult = new Adult();
    public static final HumanState child = new Child();
    public static final HumanState oid = new Oid();

    private HumanState state;

    public void setState(HumanState state) {
        this.state = state;
        //this.state.setHuman(this);
    }


    public void work(){
        this.state.work();
    }


}
