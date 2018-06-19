import java.util.Scanner;
import java.time.*;

public class Part_2{

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		LocalDate ld1;
		LocalDate ld2;
		
		System.out.println("Please enter two dates in the 'yyyy-mm-dd' format:");
			
		String date1 = scnr.nextLine();
		
		try {
			ld1 = LocalDate.parse(date1);
		}
		catch (Exception e) {
			System.out.println("Couldn't make a date out of '" + date1 + "'");
			return;
		}
		String date2 = scnr.nextLine();
		
		try {
			ld2 = LocalDate.parse(date2);
		}
		catch (Exception e) {
			System.out.println("Couldn't make a date out of '" + date2 + "'");
			return;
		}
	    
		
	    Period p = Period.between( ld1 , ld2 ) ;
	    if (p.isNegative()) {
	    	p = Period.between(ld2 , ld1);
	    }
	 
	 
	    System.out.print(p.getYears() + " years, ");
	    System.out.print(p.getMonths() + " months, ");
	    System.out.println(p.getDays() + " days");
	    
		}
}
		
		
		
	
