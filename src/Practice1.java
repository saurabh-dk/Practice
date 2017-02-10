import java.util.ArrayList;
import java.util.Scanner; 

public class Practice1 {
	public static void main(String[] args) {
		
		int size = 0;
		//int totalCount = 0;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		ArrayList<String> al = new ArrayList<>();
		int i = 0;
		//String s = "";
		
		while(i<size){
			al.add(sc.next());
			i++;
		}
		sc.close();
		
		for(int j=0;j<size;j++){
			
			long count=al.get(j).chars().filter(character -> Character.isUpperCase(character)).count();
			
			/*s=al.get(j);
			totalCount=1;*/
			
			/*for(int x=0;x<s.length();x++){
				int ascii = (int) s.charAt(x);
				if(ascii>64 && ascii<91){
					totalCount++;
				}
			}*/
			
			System.out.println(count+1);
		}
	}
}
