import java.util.List; 
import java.util.ArrayList; 

public class BSTSearch {
  
  public static List<Integer> bstSearchTrace(TreeNode root, Integer k) { 
    // check if tree /subtree is empty  ://base con
    if ( root == null ) { 
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
       subNodesList  = bstSearchTrace(root.right, k)//pass right subtree as root
    } 
    //merge root and subnodes
    rootList.addAll(subNodesList ); 
    return rootList;    
  } 
  
// helper method which creates BST to test 
  public static TreeNode createBST(){
    TreeNode rootNode = new rootNode(15);
    rootNode.left = new rootNode (6);
    rootNode.right = new rootNode (18);

    rootNode.left.left = new rootNode(3);
    rootNode.left.right = new rootNode(7);

    rootNode.left.left.left = new rootNode(2);
    rootNode.left.left.right = new rootNode(4);

    rootNode.left.right.right = new rootNode(13);
    rootNode.left.right.right.left = new rootNode(9);

    rootNode.right.left = new rootNode(17);
    rootNode.right.right = new rootNode(20);
    
    return rootNode; 

  } 
  

}



