/*
 Node having sum of children and node is max
Send Feedback
Given a tree, find and return the node for which sum of data of all children and the node itself is maximum. In the sum, data of node itself and data of immediate children is to be taken.
Input format :

Line 1 : Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Output format : Node with maximum sum.

Sample Input 1 :
5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
Sample Output 1 :
1
 */

public class Node_having_sum_of_children_and_node_is_max {
    static class MaxNodePair<T>{
        TreeNode<T> node;
        int sum;
    }

    public static TreeNode<Integer>maxSumNode(TreeNode<Integer> root){
        return maxSumNodeHelper(root).node;
    }

    public static MaxNodePair<Integer>maxSumNodeHelper(TreeNode<Integer>root){
        if(root == null){
            MaxNodePair<Integer>pair = new MaxNodePair<>();
            pair.node = null;
            pair.sum = Integer.MIN_VALUE;
            return pair;
        }
        int sum = root.data;
        for(TreeNode<Integer>child : root.children){
            sum += child.data;
        }
        MaxNodePair<Integer>ans = new MaxNodePair<>();
        ans.node = root;
        ans.sum = sum;
        for(TreeNode<Integer>child : root.children){
            MaxNodePair<Integer>childAns = maxSumNodeHelper(child);
            if(childAns.sum > ans.sum){
                ans = childAns;
            }
        }
        return ans;
    }
    
}
