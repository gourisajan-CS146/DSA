import java.util.List; 
import java.util.ArrayList; 

public class BSTSearch { 

  

  public static List<Integer> bstSearchTrace(TreeNode root, Integer k) { 

    // check if tree is empty 
    
    if ( root == null ) { 

      return  new ArrayList<Integer>();

    } 

   List <Integer> rootList =  new  List <Integer> () ;
    rootList.add( root.key );

    List <Integer> subNodes;  
    if( k < root.key){

   subNodes  = bstSearchTrace(root.left, k) ; 

    }
    else { 
       subNodes  = bstSearchTrace(root.right, k)
    } 


    
      
    


    

    
    
    

    
       
    



  } 


}

