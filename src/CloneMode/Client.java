package CloneMode;

import java.util.ArrayList;

/**
 * @author: bxguo
 * @time: 2019/1/2 11:52
 */
public class Client {

    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("卧槽");
        thing.setName("张三");

        Thing clone = thing.clone();
        clone.setValue("牛逼");
        clone.setName("李四");

        ArrayList<String> value = thing.getValue();

        value.forEach(System.out::println);
        System.out.println("--------------------");
        System.out.println(thing.getName());
        System.out.println(clone.getName());
    }

}
