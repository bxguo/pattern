package tree;

/**
 * @author: bxguo
 * @time: 2018/11/22 11:31
 */
public class BSTtest {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.put(1,"第一个");
        System.out.println(bst);

        String val = bst.get(1);
        System.out.println(val);
    }
}
