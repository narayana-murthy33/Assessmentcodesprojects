import java.util.ArrayList;

public class Arrayreverse {
	public static void main(String[] args) {
		 int[]org= {2,5,6,7,8,9};
		
	
		System.out.println(reversearray(org));
		 reversearray(org);
		
		
			
		}

	private static ArrayList<Integer> reversearray(int[] org) {
		ArrayList<Integer> rev= new ArrayList();
		for(int i=org.length-1;i>=0;i--) {
			rev.add(org[i]);
			
		}
		return rev;
	}
	

}
