
import java.util.Scanner;

public class launcher {
    
    public static void main(String[] args){
        System.out.println("Enter a string");
        numberOfVowels(new Scanner(System.in).nextLine());
    }

    public static void numberOfVowels(String word) {
        int count = 0 , vList[];
        vList = new int [5];
        
        int flag=0;// java ternary conditional expression result need to be assigned into a variable 
        //this is an usual for loop , but it works fine 
        for (int i = -1; // initializing loop variable ... 
        	 i++ <  word.length()-1; //incrementing (post incrementing) and comparing it word length
        		//this is the fun part . All of this is really equal to a bunch of if else if 
        	 flag = word.charAt(i) == 'a' || word.charAt(i) == 'A' ? vList[0]++: 
        	   	 	word.charAt(i) == 'e' || word.charAt(i) == 'E' ? ++vList[1]:
        	   	 	word.charAt(i) == 'i' || word.charAt(i) == 'I' ? ++vList[2]: 
        	   	 	word.charAt(i) == 'o' || word.charAt(i) == 'O' ? ++vList[3]:
        	   	 	word.charAt(i) == 'u' || word.charAt(i) == 'U' ? ++vList[4]: 
        	   	 	-1// -1 off        		 	
        	 )
        {
        	int check = flag != -1 ? count++:0;//check is not used it is just a way to increment count depending on certain conditions
        }
        
        System.out.println("The number of vowels is : "+ count);
 
        System.out.println(" a = "+ vList[0]+
        				   " e = "+ vList[1]+
        				   " i = "+ vList[2]+
        				   " o = "+ vList[3]+
        				   " u = "+ vList[4]);
    }    
}
