package proxy;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: bxguo
 * @time: 2018/9/29 15:33
 */
public class tests {
    public static void main(String[] args) {
        ArrayList goods = new ArrayList();
        AtomicInteger index= new AtomicInteger();
        //plan 1
        //Thread p = new Thread(() -> {
        //    List<String> skuList = new ArrayList();
        //    goods.forEach(good -> {
        //        skuList.add(good.getName());
        //        if ((goods.indexOf(good) - index.get()) == 99) {
        //            //getjdPrice(skulist).//queue.put..............
        //            //queue.put.......
        //            index.set(goods.indexOf(good) + 1);
        //            skuList.clear();
        //        }
        //    });
        //});

       /* Integer index = 0
        for (int i = 0; i < 100; i++) {
            List<Student> goods = giftDao.getJd..Job(index, 100, 1);
            if (goods == null || goods.size()==0){
                break;
            }else {
                index++;
            }
        }


        while (true){
            //....



        }


        do {
            List<Student> goods = giftDao.getJd..Job(index, 100, 1);
            List<String> skuList = goods.stream().map(JdGoods::getSku).collect(Collectors.toList());
            List jdpriceList =  get...spider(skuList);
            queue.put(jdpriceList);
            index++;
        }while (goods.size() == 100);
*/










    }

}
