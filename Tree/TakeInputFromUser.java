import java.util.ArrayList;
import java.util.Scanner; 

class TreeNode<T>{
    public T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}public class TakeInputFromUser {      
    
    public static TreeNode<Integer> takeInput(){            //Function of taking input from User
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter next node data");
        n = s.nextInt();
        TreeNode<Integer>root = new TreeNode<>(n);
        System.out.println("Enter no. of children = "+ n);
        int childCount = s.nextInt();
        for(int i = 0;i < childCount;i++){
            TreeNode<Integer>child = takeInput();
            root.children.add(child);
        }
        return root;
    }
    
    public static void print(TreeNode<Integer>root){
        String s = root.data + ":";
        for(int i = 0;i < root.children.size();i++){
            s = s + root.children.get(i).data+",";
        }
        System.out.println(s);
        for(int i = 0;i < root.children.size();i++){
            print(root.children.get(i));
        }
    }
    
    public static void main(String[] args) {

        TreeNode<Integer> root = takeInput();
        print(root);
    }


    // Better

    // Example = input -> 4 2 1 0 2 0

    // public static void main(String[] args) {

    //     Scanner s = new Scanner(System.in);
    //     TreeNode<Integer> root = takeInput(s);
    //     print(root);
    // }
    

    // public static TreeNode<Integer> takeInput(Scanner s){            //Function of taking input from User
    //     int n;
    //     System.out.println("Enter next node data");
    //     n = s.nextInt();
    //     TreeNode<Integer>root = new TreeNode<>(n);
    //     System.out.println("Enter no. of children = "+ n);
    //     int childCount = s.nextInt();
    //     for(int i = 0;i < childCount;i++){
    //         TreeNode<Integer>child = takeInput(s);
    //         root.children.add(child);
    //     }
    //     return root;
    // }
}
