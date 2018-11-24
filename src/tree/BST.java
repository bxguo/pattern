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
    int size(){
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
        x.N = size(x.left) + size(x.right) + 1;
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
    Integer floor(Integer key){
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
     * 向上取整
     * 原理就是在大的基础上找小的
     */
    public Integer ceiling(Integer key){
        return ceiling(root, key);
    }

    private Integer ceiling(Node x, Integer key) {

        if (x == null){
            return null;
        }

        int i = key.compareTo(x.key);

        //case 1 key刚好等于当前节点key，那么返回当前节点key
        if (i == 0) {
            return x.key;
        }

        //case 2 key大于当前节点key，那么右子树中寻找直到找到大于key的节点key
        if (i > 0){
            return ceiling(x.right, key);
        }

        //case 3 key小于当前节点key，那么向左子树中找寻直到找到小于key的节key
        Integer t = ceiling(x.left, key);
        if (t != null) {
            return t;
        } else {
            return x.key;
        }

    }

    /**
     * 查询排名为k的键
     */
    public Integer select(int k){
        Node node = select(root, k);
        if (node == null) {
            return null;
        }
        return node.key;
    }

    private Node select(Node root, int k) {

        if (root == null) {
            return null;
        }

        int size = size(root.left);
        if (size > k) {
            return select(root.left, k);
        } else if (size < k){
            return select(root.right, k - size - 1);
        }
        return root;
    }


    /**
     * 查询键key的排名
     */
    public int rank(Integer key){
        return rank(root, key);
    }

    private int rank(Node root, Integer key) {
        if (root == null) {
            return 0;
        }
        int to = root.key.compareTo(key);
        if (to > 0) {
            return rank(root.left, key);
        }else if (to < 0){
            return size(root.left) + 1 + rank(root.right, key);
        }
        return size(root.left);
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
