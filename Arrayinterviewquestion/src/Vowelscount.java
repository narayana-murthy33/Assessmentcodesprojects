
import java.util.*;

public class Vowelscount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your name");
		String name=sc.next();
		//vowelscount1(name);
		//System.out.println("vowels present in that string:"+vowelscount(name));

	}
    //vowel count only number
	private static int vowelscount( String name) {
		
		Set<Character> name1= new LinkedHashSet();
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u') {
		     name1.add(name.charAt(i));
	}
		}
		return name1.size();
	}
	//vowel count with each letter count
private static void vowelscount1( String name) {
		
		HashMap<Character,Integer> name1= new HashMap();
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u') {
		     if(name1.get(name.charAt(i))==null) {
		    	 name1.put(name.charAt(i), 1);
		     }
		     else {
		    	 int count=name1.get(name.charAt(i));
		    	 name1.put(name.charAt(i), count+1);
		    	 
		    	 
		     }
		    	 
		    	 
		     }
	}
		System.out.println(name1);
		}
		
}
