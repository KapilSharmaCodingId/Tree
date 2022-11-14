import java.util.ArrayList;
//Implement the tree 
class TreeNode<T>{
    public T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}

class TreeUse{

    public static void main(String[] args) {
        
        TreeNode<Integer>root = new TreeNode<>(4);
        TreeNode<Integer>node1 = new TreeNode<>(2);
        TreeNode<Integer>node2 = new TreeNode<>(3);
        TreeNode<Integer>node3 = new TreeNode<>(5);
        TreeNode<Integer>node4 = new TreeNode<>(6);
    
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node3.children.add(node4);

        System.out.println(root);
    }
}