/*
 Code : Sum of nodes
Send Feedback
Given a generic tree, count and return the sum of all nodes present in the given tree.
Input format :
Elements in level order form separated by space (as per done in class). Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output Format :
Sum of all nodes
Sample Input :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output :
190
 */

import java.util.ArrayList;

class TreeNode<T>{
    public T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}

public class SumOfNodes {
    
    public static int sumofAllNode(TreeNode<Integer>root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int total = 0;
        for(int i = 0;i < root.children.size();i++){
            total+=sumofAllNode(root.children.get(i));
        }
        return root.data+total;
    }
}
