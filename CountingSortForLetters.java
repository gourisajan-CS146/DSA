import java.util.Arrays; 
 
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
   
System.out.println("The count array is " + Arrays.toString(count));

// build the cumulative count array. which will give count of element and elements less than that

for ( int i = 1; i < 26 ; i++){

   count[i] = count[i] + count[i-1]; 
   

} 
System.out.println("Cumulative count array: ");
System.out.println(Arrays.toString(count));

char[]sorted = new char[alphabetArr.length];

for( int i = alphabetArr.length-1; i >=0 ; i --){
   int index =  alphabetArr[i]-'A'; 

 int pos =  count[index]-1 ; 
  sorted[pos] = alphabetArr[i]; 

count[index]--;
 
} 
  
System.out.println("Final Sorted Array: "); 
System.out.println(Arrays.toString(sorted));
  
} 
}
