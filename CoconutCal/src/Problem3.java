import java.util.Arrays;
import java.util.List;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(0,1,5,8,14,15,1,44,81,89,99,102);

		problem3(list);

	}
	public static void problem3(List<Integer> list) {
		int count=0;
		for(Integer temp: list) {
			if(temp>=10 && temp<=20) {
				count++;
			}
		}
		System.out.println(count);
	}

}