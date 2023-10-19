
public class Stringwithcount {
	public static void main(String[] args) {
		String n="nani";
		
		StringBuilder s=new StringBuilder();
		s.append(n.length()).append(n).append("=");
		System.out.println(s);
		 m1();
	}
	public static void m1() {
		String []q= {"dhan","ai"};
		StringBuilder s=new StringBuilder();
		for(String temp:q) {
			s.append(temp.length()).append(temp).append("=");
			
		}
		System.out.println(s);
		
		
	}

}
