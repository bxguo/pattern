package tree;


/**
 * 二叉查找树
 * @author: bxguo
 * @time: 2018/11/22 10:49
 */
public class BST {
    /**
     * 根节点
     */
    private Node root;

    /**
     * 节点数量
     */
    public int size(){
        return size(root);
    }
    private int size(Node x){
        if (x == null) {
            return 0;
        } else {
            return x.N;
        }
    }

    /**
     * 查
     * @param key
     * @return
     */
    public String get(Integer key){
        return get(root, key);
    }
    private String get(Node x, Integer key){
        if (x == null || key == null) {
            return null;
        } else {
            int i = key.compareTo(x.key);

            if (i == 0) {
                return x.val;
            } else if (i > 0 ){
                return get(x.right, key);
            }else {
                return get(x.left, key);
            }
        }
    }

    /**
     *  增
     * @param key
     * @param val
     */
    public void put(Integer key, String val){
        root = put(root, key, val);
    }
    private Node put(Node x, Integer key, String val){
        if (x == null) {
            return new Node(key, val, 1);
        }

        int i = key.compareTo(x.key);
        if (i == 0) {
            x.val = val;
            return x;
        } else if (i > 0 ){
            x.right = put(x.right, key, val);
        }else {
            x.left = put(x.left, key, val);
        }
        return x;
    }



    /**
     * 节点定义
     */
    private class Node {

        private Integer key;
        private String val;
        private Node left, right;
        private int N;

        public Node(Integer key, String val, int n) {
            this.key = key;
            this.val = val;
            N = n;
        }

    }
}
