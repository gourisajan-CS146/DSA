import java.util.List; 
import java.util.ArrayList; 

public class BSTSearch {
  
  public static List<Integer> bstSearchTrace(TreeNode root, Integer k) { 
    // check if tree /subtree is empty  ://base con
    if ( root == null || k== null) { 
      return  new ArrayList<Integer>();
    } 
  //an arraylist to hold only root
   List <Integer> rootList =  new ArrayList <Integer> () ;
   rootList.add( root.key );
    if (root.key == k ){
        return rootList; 
    } 

  //an arralist to store subtree  keys traversed while searching the K
   List <Integer> subNodesList;  
    if( k < root.key){
         subNodesList  = bstSearchTrace(root.left, k) ; //pass leftsubtree
    }
    else { 
       subNodesList  = bstSearchTrace(root.right, k);//pass right subtree as root
    } 
    //merge root and subnodes
    rootList.addAll(subNodesList ); 
    return rootList;    
  } 
  
// helper method which creates BST to test 
  public static TreeNode createBST(){
    TreeNode rootNode = new TreeNode(15);
    rootNode.left = new TreeNode (6);
    rootNode.right = new TreeNode (18);

    rootNode.left.left = new TreeNode(3);
    rootNode.left.right = new TreeNode(7);

    rootNode.left.left.left = new TreeNode(2);
    rootNode.left.left.right = new TreeNode(4);

    rootNode.left.right.right = new TreeNode(13);
    rootNode.left.right.right.left = new TreeNode(9);

    rootNode.right.left = new TreeNode(17);
    rootNode.right.right = new TreeNode(20);
    
    return rootNode; 

  } 

  public static voin main(String args[]){
    TreeNode root  = createBST();
    System.out.println(bstSearchTrace(root, 13));
    System.out.println(bstSearchTrace(root, 14));
    System.out.println(bstSearchTrace(root, 15));
    System.out.println(bstSearchTrace(root, 2));
    System.out.println(bstSearchTrace(root, 20));
  }

}



