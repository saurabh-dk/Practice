import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class framingOfArrayList {

	static int maxSize;
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		String s = "";
		int size = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter \"stop\" to finish ==>");
		
		while(!"stop".equalsIgnoreCase(s)){
			
			s = sc.next();
			al.add(s);
			
			size++;
			
		}
		
		sc.close();
		al.remove(size-1);
		al.trimToSize();
		
		String longest = al.stream().max(Comparator.comparing(str -> str.length())).get();
		
		/*String longestString = al.get(0);
		for (String temp : al){
	    
			if (temp.length() > longestString.length()){
	    
				longestString = temp;
	       
			}
		
		}*/
		
		maxSize = longest.length();
		
		printStars();
		
		System.out.println();
		
		al.forEach(
			str -> {System.out.print("* "+str);
			
						for(int i=str.length();i<=maxSize;i++){
							System.out.print(" ");
						}
					System.out.println("*");
					}
				);
		
		/*for(int x=0;x<al.size();x++){
		
			System.out.print("* "+al.get(x));
			
			for(int i=al.get(x).length();i<=maxSize;i++){
			
				System.out.print(" ");
			 
			} 
			
			System.out.println("*");
		
		}*/
		  
		printStars();
	
	}

	private static void printStars() {

		for(int i=0;i<maxSize+4;i++){
			
			System.out.print("*");
		
		}
	}

}