import java.util.Arrays; 
/**
  Implement Counting Sort specifically for uppercase letters A–Z.
  **/ 
public class CountingSortetters{ 
 
  public static void main (String args[]){
         char[] alphabetArr = { 'A','A','Z','B','H','K','L','Z','W','X','P'} ;
         int[] count = new int[26]; 
        //convert letter to index letter-'A' and increase count when we see same letter
        //count array will have count of each element in alphabet array
         for(int i = 0 ; i < alphabetArr.length ; i ++ ){ 
            count[alphabetArr[i]-'A']=count[alphabetArr[i]-'A']+1; 
          
         } 
      //print count array
        
       System.out.println("The  frequency array after counting." + Arrays.toString(count));
     
       // build the cumulative count array. which will give count of element and elements less than that
     
       for ( int i = 1; i < 26 ; i++){
           count[i] = count[i] + count[i-1];  
     
       } 
       System.out.println("the cumulative count array.: ");
       System.out.println(Arrays.toString(count));
       //create an array to put elements after sorting alphaber rray
       char[]sorted = new char[alphabetArr.length];
       //loop from last to first element
       for( int i = alphabetArr.length-1; i >=0 ; i --){
           //take each alphabet and convert to index
         int index =  alphabetArr[i]-'A'; 
        //use this as index to take element from cumulative array .use  that as index for sorted array to put element
         int pos =  count[index]-1 ; 
         //place each element in that position
          sorted[pos] = alphabetArr[i]; 
          //decrease count of that letter 
          count[index]--;
      
      }  
     System.out.println("Final Sorted Array: "); 
     System.out.println(Arrays.toString(sorted));
  
} 
}
