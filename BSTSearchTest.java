import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BSTSearchTest{ 

        @Test 
        public void  testSearchExistingKey(){
            TreeNode root = BSTSearch.createBST();
            List<Integer> expList = Arrays.asList(15,6,7,13);
            List<Integer>   actualList = BSTSearch.bstSearchTrace(root, 13);
            assertEquals(expList,actualList,"Trace to find 13 is incorrect");
        } 
        
        
       @Test 
        public void testsearchNonExistingKey(){
            TreeNode root = BSTSearch.createBST();
            List<Integer> expList = Arrays.asList(15,6,7,13);
            List<Integer>   actualList = BSTSearch.bstSearchTrace(root, 14);
            assertEquals(expList,actualList,"Trace to find 14 which doesnot exist is incorrect");
        } 
        
        @Test 
        public void testsearchforRoot(){
            TreeNode root = BSTSearch.createBST();
            List<Integer> expList = Arrays.asList(15);
            List<Integer>   actualList = BSTSearch.bstSearchTrace(root, 15);
            assertEquals(expList,actualList,"Trace to find root 15 is incorret " );
        } 
        
       @Test 
        public void testsearchforleftMostKey(){
            TreeNode root = BSTSearch.createBST();
            List<Integer> expList = Arrays.asList(15,6,3,2);
            List<Integer>   actualList = BSTSearch.bstSearchTrace(root, 2);
            assertEquals(expList,actualList,"Trace to find root 2 is incorret " );
        } 
        
        @Test 
        public void testsearchforRightMostKey(){
            TreeNode root = BSTSearch.createBST();
            List<Integer> expList = Arrays.asList(15,18,20);
            List<Integer>   actualList = BSTSearch.bstSearchTrace(root, 20);
            assertEquals(expList,actualList,"Trace to find root 20 is incorret " );
        } 
        
          
        

  


} 
