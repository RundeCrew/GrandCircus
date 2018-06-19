import java.util.Scanner;

public class Part_1 {

	public static void main(String[] args) {
		
		int userInput1;
		int userInput2;
		boolean isEqual = true;
		
		Scanner scnr = new Scanner(System.in);
		
	    System.out.println("Enter two numbers with an equal number of digits:");
	    userInput1 = scnr.nextInt();	
	    userInput2 = scnr.nextInt();
	    
	    int i = 0;
	    int targetTotal;
	    int newTargetTotal;
	    String userInput1String;
	    String userInput2String;
	    
	    	
	    	userInput1String = Integer.toString(userInput1);
	    	userInput2String = Integer.toString(userInput2);
	    
	    	// convert input to string
	    char c1 = userInput1String.charAt(0);
	    char c2 = userInput2String.charAt(0);
	    	
	    	// convert string back to integer
	    int i1 = Integer.parseInt(String.valueOf(c1));
	    int i2 = Integer.parseInt(String.valueOf(c2));
	    targetTotal = i1 + i2;
	    
	    	//loop for numbers entered
	    for (i = 1; i <= (userInput1String.length() - 1); ++i) {
	    	c1 = userInput1String.charAt(1);
		    c2 = userInput2String.charAt(1);
		    	
		    i1 = Integer.parseInt(String.valueOf(c1));
		    i2 = Integer.parseInt(String.valueOf(c2));
		    newTargetTotal = i1 + i2;
		    
		    if (newTargetTotal == targetTotal) {
		  
		    }
		    else {
		    	isEqual = false;
		    }
		    
	    	
	    }
	    	System.out.println(isEqual);
	    	
	    	}
	   	
}

