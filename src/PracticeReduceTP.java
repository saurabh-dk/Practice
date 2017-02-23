import java.util.ArrayList;
import java.util.IntSummaryStatistics;

public class PracticeReduceTP {
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<>();
		
		final int size = 10;
		
		for(int i=1;i<=size;i++){
			al.add(i);
		}
		
		IntSummaryStatistics stats = al.stream().mapToInt(x -> x).summaryStatistics();
		//int tot = al.stream().reduce(0,(accumulator,element) -> accumulator+element);
		System.out.print(stats.getCount()+" "+stats.getSum());
	}
}
