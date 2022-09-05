package groupC;

public class SwapTwoStringsWithout3rdVariable {

	public static void main(String[] args) {
		String s1="divya";
		String s2="baby";   //toatal 9 s1=5 s2=4
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());//   //9-4=5 start from 0 till 5 
		
		
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
	}

}


