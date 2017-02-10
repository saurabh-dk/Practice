import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SleepingPyramid {

	public static void main(String[] args) {
		
		System.out.print("Max length of pyramid = ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
        
        //Sachin's code
        /*
        int n = size;
        int count=1;
        for(int i=1;i<=n;i++){
               
               for(int j=1;j<=n;j++){
                     if(i<=((n/2)+1)){
                            if(j<=((2*i)-1))System.out.print("*");
                            else break;
                     }
                     else{
                            if(j<=(n-(2*count))) System.out.print("*");
                            else break;
                     }
                     
               }
               
               if(i>((n/2)+1))count++;
                     
               
               System.out.println();
               
        }*/

      //My code
        ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=size;i>=1;i=i-2){
			arr.add(i);
		}
		
		/*Without reversing ArrayList
		 * for(int j=0;j<arr.size()-1;j++){
			for(int k=0;k<arr.get(arr.size()-(j+1));k++){
				System.out.print("*");
			}
			System.out.print("\n");
		}*/
		
		Collections.reverse(arr);
		for(int i=0;i<arr.size()-1;i++){
			for(int j=0;j<arr.get(i);j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* Alternative to lambda expressions without reversing an ArrayList
		int x=1;
		for(int j=arr.size()-1;j>=0;j--){
			if(!(x==arr.size())){
				for(int k=0;k<arr.get(x);k++){
					System.out.print("*");
				}
				x++;
			System.out.print("\n");
			}
        }*/
		
		Collections.reverse(arr);
		arr.forEach(item -> {
			for(int i=1;i<=item;i++){
				System.out.print("*");
			}
			System.out.println();
		});
		sc.close();
	}
}