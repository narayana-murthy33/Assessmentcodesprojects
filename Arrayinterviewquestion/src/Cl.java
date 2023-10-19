import java.util.ArrayList;
import java.util.Arrays;

public class Cl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hii");
		System.out.println("hello");
		 ArrayList arr1=new ArrayList();
		 ArrayList arr2=new ArrayList();
	     int arr[]={0,1,0,1,0,0};
	    for (int temp:arr){
	         
	         if(arr[0]<temp){
	             arr1.add(arr[1]);
	             
	             
	         }
	         else {
	        	 arr2.add(temp);
	         }
	         
	         
	         
	        
	    }
	    arr2.addAll(arr1);
	    System.out.println(arr2);
	    Arrays.sort(arr);
	    for(int temp:arr) {
	    	System.out.println(temp);
	    }

	}

}
