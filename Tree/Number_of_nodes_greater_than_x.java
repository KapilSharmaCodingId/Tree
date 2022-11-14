/*
 Code : Number of nodes greater than x
 
Given a tree and an integer x, find and return number of Nodes which are greater than x.
Input format :
Single Line : First Integer denotes x and rest of the elements in level order form separated by space. Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output Format :
Count of nodes greater than x
Sample Input 1 :
35 10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
3
Sample Input 2 :
10 10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 2:
5
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
public class Number_of_nodes_greater_than_x {
    public static int numNodeGeater(TreeNode<Integer> root,int x){
        int count = 0;
        if(root == null){
            return 0;
        }
        if(root.data > x){
            count++;
        }
        for(TreeNode<Integer>child : root.children){
            count = count + numNodeGeater(child, x);
        }
        return count;
    }
}
