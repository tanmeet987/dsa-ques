// construct a generic tree
import java.util.*;
public class constructgt{
    private static class Node{
int data;
ArrayList<Node> children = new ArrayList<>();

    }
    public  static void display(Node node){
        // using recursion
        // display 20 apni family sahit apne aap ko pura print krna janta h
        String str = node.data+"->";
        for(Node child:node.children){

        
            str += child.data +",";

        }
        str+=".";
        System.out.println(str);
for(Node child:node.children){
    display(child);

}

    }
    public static void main(String[] args){
        int[] arr = {12,20,52,-1,60,-1,-1,30,70,-1,80,110,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
 Node root = null;
 Stack<Node> st = new Stack<>();
 for(int i=0;i<arr.length;i++){
     if(arr[i]==-1){
st.pop();

     }else{
         Node t = new Node();
         t.data = arr[i];
         if(st.size() > 0){
             st.peek().children.add(t);
         }else{
             root=t;

         }
         st.push(t);
     }
 }
 display(root);
    }
}