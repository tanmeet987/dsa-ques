import java.util.ArrayList;
public class binaryTree{
public static class Node{
    int data;
    Node left;
    Node right;
    Node(int data, Node left, Node right){
        this.data = data;
        this.left=left;
        this.right=right;

    }
    Node(int data){
        this(data, null , null);
        // this is basically called constructor chaining .

    }
}
public static void preorder(Node root, ArrayList<Integer> ans){
    if(root == null){
        return;
    }
    ans.add(root.data);
    preorder(root.left, ans);
    preorder(root.right, ans);
    

}
public static void postorder(Node root, ArrayList<Integer> ans){
    if(root==null)return;
    postorder(root.left, ans);
    postorder(root.right, ans);
    ans.add(root.data);
}
public static void inorder(Node root, ArrayList<Integer> ans){
    if(root == null)return;
    inorder(root.left,ans);
    ans.add(root.data);
    inorder(root.right,ans);
}
public static int size(Node node){
if(node == null) return 0;
int leftSize=size(node.left);
int rightSize=size(node.right);
return leftSize+rightSize+1;
}
public static int sum(Node node){
return node == null ? 0:sum(node.left)+sum(node.right)+node.data;
}
public static int min(Node node){
return node == null ?-(int)1e9:Math.max(node.data, Math.min(min(node.left), min(node.right)));
}
public static int max(Node node){
return node == null ? -(int)1e9:Math.max(node.data, Math.max(max(node.left),max(node.right)));

}
public static int height(Node node){
return node == null ?-1:Math.max(height(node.left),height(node.right))+1;
}
public static int countLeaves(Node node){
if(node == null){
    return 0;
}
if(node.left == null && node.right == null){
    return 1;
}
return countLeaves(node.left)+countLeaves(node.right);
}
public static int exactlyOneChild(Node node){
if(node== null || (node.left == null && node.right == null))return 0;
if(node.left == null || node.right == null )

int left = exactlyOneChild(node.left);
int right = exactlyOneChild(node.right);
int sum = left +right;

if(node.left == null || node.right == null){
    sum +=1;
    return sum;
}
}
}
