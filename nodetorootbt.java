// Node to root path binary tree 
import java.io.*;
import java.util.*;

public class nodetorootbt {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
static ArrayList<Integer> path;
  public static boolean find(Node node, int data){
    // write your code here
    // 1) base case
    if(node==null){
      return false;
    }
    // agar yeh node hmara root par present h 
    if(node.data==data){
path.add(node.data);
      return true;
    }
    // if this node is present in the left part of the tree
    boolean filc = find(node.left, data);
    if(filc){
      // jaha jaha se hme node ka data mil ra h vha se hma node ka data return krte rhenege
      path.add(node.data);
      return true;
    }
    // we will go on the right part of the tree
    boolean firc = find(node.right, data);
      if(firc){
        // jaha jaha se hme path milra h vha se hm node ka data return krte rhenge
path.add(node.data);
// jha jha true h hmne vha vha add kra h 
        return true;
// iss cheez se hmara adha euler chalta h 
      }

    return false;
  }



  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    int data = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    path= new ArrayList<>();
    boolean found = find(root, data);
    System.out.println(found);

    
    System.out.println(path);
  }

}