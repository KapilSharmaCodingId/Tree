/*
 Second Largest Element In Tree
 
Given a generic tree, find and return the node with second largest value in given tree. Return NULL if no node with required value is present.
Input format :
Elements in level order form separated by space (as per done in class). Order is - 

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output format:
Second Largest node data
Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
40
 */

import java.lang.annotation.Retention;

public class Second_Largest_Element_In_Tree {
    
    static class pair<T>{
        T first;
        T second;
        pair(T first,T second){
            this.first = first;
            this.second = second;
        }
    }

    public static TreeNode<Integer>findSecondLargest(TreeNode<Integer>root){
        return findSecondLargestHelper(root).second;
    }

    public static pair<TreeNode<Integer>>findSecondLargestHelper(TreeNode<Integer>root){
        pair<TreeNode<Integer>>output;
        if(root == null){
            output = new pair<TreeNode<Integer>>(null,null);
                return output;
            }
            output = new pair<TreeNode<Integer>>(root,null);
            for(TreeNode<Integer>child : root.children){
                pair<TreeNode<Integer>>childpair = findSecondLargestHelper(child);
                if(childpair.first.data > output.first.data){
                if(childpair.second == null || childpair.second.data < output.first.data){
                    output.second = output.first;
                    output.first = childpair.first;
                }else{
                   output.first = childpair.first;
                   output.second = childpair.second;
                }
            }else if(childpair.first.data.equals(output.first.data) && childpair.second!= null){
                  if(output.second == null || childpair.second.data > output.second.data){
                    output.second = childpair.second;
                  }
            }else if(output.first.data != childpair.first.data && (output.second == null || childpair.first.data > output.second.data)){
                output.second = childpair.first;
            }
        }
        return output;
        }
    }

