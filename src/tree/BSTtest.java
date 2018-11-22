package tree;

/**
 * @author: bxguo
 * @time: 2018/11/22 11:31
 */
public class BSTtest {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.put(1,"第一个");
        bst.put(4,"第二个");
        bst.put(2,"第三个");
        bst.put(3,"第四个");
        bst.put(7,"第五个");
        bst.put(6,"第六个");
        System.out.println(bst);

        for (int i = 0; i < 8; i++) {
            String val = bst.get(i);
            System.out.println(i+"::"+val);
        }
    }
}
