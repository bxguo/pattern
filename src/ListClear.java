import java.util.ArrayList;
import java.util.List;

/**
 * @author: bxguo
 * @time: 2018/9/30 14:11
 */
public class ListClear {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");


        System.out.println(list);

        list.forEach(s -> System.out.println(list.indexOf(s)));

        list.clear();
        System.out.println(list);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.forEach(s -> System.out.println(list.indexOf(s)));

    }


}
