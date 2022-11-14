/*
 Next larger element
 
Given a generic tree and an integer n. Find and return the node with next larger element in the Tree i.e. find a node with value just greater than n.
Return NULL if no node is present with value greater than n.
Input format :

Line 1 : Integer n

Line 2 : Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Output format : Node with value just greater than n.

Sample Input 1 :
18
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
20
Sample Input 2 :
21
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 2:
30
 */

public class Next_larger_element {
    
    public static TreeNode<Integer>findNextLargeNode(TreeNode<Integer>root,int n){
        if(root == null){
            return null;
        }
        TreeNode<Integer>nextLargeNode = null;
        if(root.data > n){
            nextLargeNode = root;
        }
        for(TreeNode<Integer>child : root.children){
            TreeNode<Integer> nextLargeInChild = findNextLargeNode(child, n);
            if(nextLargeInChild != null){
                if(nextLargeNode == null || nextLargeNode.data > nextLargeInChild.data){
                    nextLargeNode = nextLargeInChild;
                }
            }
        }
        return nextLargeNode;
    }
}
