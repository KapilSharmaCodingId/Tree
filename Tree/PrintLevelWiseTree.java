/*
 Code : Print Level Wise
 
Given a generic tree, print the input tree in level wise order. That is, print the elements at same level in one line (separated by space). Print different levels in differnet lines.
Input format :
Elements in level order form separated by space (as per done in class). Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output Format :
Level wise print
Sample Input :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output :
10
20 30 40 
40 50
 */

class TreeNode<T>{
    public T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}

public class PrintLevelWiseTree {
    public static void printLevelWiseTree(TreeNode<Integer>root){
    
        if(root == null){
            return ;
        }

        QueueUsingLL<TreeNode<Integer>>q = new QueueUsingLL<TreeNode<>();
        TreeNode<Integer>nullNode = new TreeNode<Integer>(Integer.MIN_VALUE);
        q.enqueue(root);
        q.enqueue(nullNode);
        System.out.println(root.data);
        while(q.size() != 1){
            TreeNode<Integer>temp = null;
            try{
                temp = q.dequeue();
            }catch(QueueEmptyException e){

            }

            if(temp == nullNode){
                q.enqueue(nullNode);
                System.out.println();
                continue;
            }

            for(int i = 0;i < temp.children.size();++i){
                System.out.println(temp.children.get(i).data+" ");
                q.enqueue(temp.children.get(i));
            }
        }
    }
}
