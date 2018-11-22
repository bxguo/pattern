package test1;

        import proxy.Student;

        import java.util.Arrays;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;
        import java.util.concurrent.ScheduledExecutorService;
        import java.util.concurrent.ScheduledThreadPoolExecutor;
        import java.util.stream.Collectors;

/**
 * @author: bxguo
 * @time: 2018/8/1 11:05
 */
public class foreachDemo {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("JSON");
        stu.setAge("23");
        stu.setAddress("中国上海");
        Map<String,Student> map=new HashMap<String,Student>();
        map.put("first", stu);

        ScheduledThreadPoolExecutor
    }


}
