import java.util.Arrays; 
 
public class CountingSortetters{ 
  public static void main (String args[]){

    char[] alphabetArr = { 'A','A','Z','B','H','K','L','Z','W','X','P'} ;
    int[] count = new int[26]; 
    for(int i = 0 ; i < alphabetArr.length ; i ++ ){ 
       count[alphabetArr[i]-'A']=count[alphabetArr[i]-'A']+1; 
    } 

  }   
System.out.println("The count array is " + Arrays.toString(count));

// build the cumulative count array.


  
} 

