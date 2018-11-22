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
     * 最小值
     */
    public Integer min(){
        return min(root);
    }
    private Integer min(Node x){
        if (x.left == null) {
            return x.key;
        } else {
            return min(x.left);
        }
    }
    /**
     * 最大值
     */
    public Integer max(){
        return max(root);
    }
    private Integer max(Node x){
        if (x.left == null) {
            return x.key;
        } else {
            return max(x.left);
        }
    }

    /**
     * 向下取整
     * 原理就是在小的基础上找大的，向上取整刚好相反
     */
    public Integer floor(Integer key){
        return floor(root, key);
    }

    private Integer floor(Node x, Integer key) {

        if (x == null){
            return null;
        }

        int i = key.compareTo(x.key);

        //case 1 key刚好等于当前节点key，那么返回当前节点key
        if (i == 0) {
            return x.key;
        }

        //case 2 key小于当前节点key，那么左子树中寻找直到找到小于key的节点key
        if (i < 0){
            return floor(x.left, key);
        }

        //case 3 key大于当前节点key，那么向右子树中找寻直到找到大于key的节key
        Integer t = floor(x.right, key);
        if (t != null) {
            return t;
        } else {
            return x.key;
        }

    }

    /**
     * 节点定义
     */
    private class Node {

        private Integer key;
        private String val;
        private Node left, right;
        private int N;

        private Node(Integer key, String val, int n) {
            this.key = key;
            this.val = val;
            N = n;
        }

    }
}
