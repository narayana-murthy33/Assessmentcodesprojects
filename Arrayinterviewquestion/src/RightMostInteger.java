import java.util.ArrayList;
import java.util.List;

public class RightMostInteger {
    public static void main(String[] args) {
        

    	
        
       ArrayList<Integer> e=new ArrayList<>();
        
        
         int []a= {6, 8, 10, 4,2,1};
         int max=a[a.length-1];
         for(int i=a.length-2;i>=0;i--) {
        	 
        	 if(a[i]>max) {
        		 e.add(a[i]);
        		 max=a[i];
        		 
        	 }
        	 
         }
         System.out.println(e);
    }

    
}

