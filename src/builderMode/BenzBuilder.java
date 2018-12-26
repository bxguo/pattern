package builderMode;

/**
 * @author: bxguo
 * @time: 2018/12/26 17:29
 */
public class BenzBuilder extends CarBuilder {

    @Override
    public CarModel getCarModel() {
        BenzModel benz = new BenzModel();
        sequence.add(CarModel.ALARM);
        sequence.add(CarModel.START);
        sequence.add(CarModel.STOP);
        benz.setSequence(sequence);
        return benz;
    }
}
