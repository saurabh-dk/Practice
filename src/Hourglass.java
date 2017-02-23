import java.util.Scanner;

public class Hourglass {

	public static void main(String[] args) {
		int j,i=1;
		int count=1;
		boolean isEqualToNine = false;
		
		System.out.print("Enter the length = ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		System.out.println();
		
		while(i<=length && i>0){
			
			if(i<=length-1 && !isEqualToNine){
				
				for(j=1;j<=length;j++){
					
					if(j>=i){
						
						if(j>=count){
							System.out.print(j);
						}
						
						count++;
						System.out.print(" ");
					}
					
					else{
						System.out.print(" ");
					}	
				}
				
				i++;
				count=i;
				System.out.println();
				
				if(i==length){
					isEqualToNine = true;
				}
			}
			
			else{
				
				for(j=1;j<=length;j++){
					
					if(j>=i){
						System.out.print(j);
						System.out.print(" ");
					}
					
					else{
						System.out.print(" ");
					}
				}
				i--;
				System.out.println();
			}
		}
	}
}