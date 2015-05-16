
public static void(String args[]){

	      String s = new String ();
	      
	      System.out.println("Enter a string");
	      s = new Scanner(System.in).nextLine();
	      
	    
	      int count=0;
	      
	      
	      for (int i=0;i<s.length();i++)
	    	  if (s.charAt(i)=='a' || s.charAt(i)=='A' ||
    			  s.charAt(i)=='e' || s.charAt(i)=='E' ||
    			  s.charAt(i)=='i' || s.charAt(i)=='I' ||
    			  s.charAt(i)=='o' || s.charAt(i)=='O' ||
    			  s.charAt(i)=='u' || s.charAt(i)=='U' ||
    			  s.charAt(i)=='y' || s.charAt(i)=='Y' )
	    	count ++;  
	    	  
	      
	      System.out.println("The number of vowel is : "+count);
}
