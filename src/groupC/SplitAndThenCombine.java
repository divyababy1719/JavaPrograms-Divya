package groupC;

public class SplitAndThenCombine {

	public static void main(String[] args) {
		//String s="abc";
		//s=s+"xyz";      //abcxyz  o/p=axbycz

	//	String s="aabbcredu";
		String s="aabb";
		
		
		int n=s.length()/2;  //3
		for(int i=0;i<n;i++)
		{
			System.out.print(s.charAt(i)+""+s.charAt(i+n));  //x position is 3.append a with i+n .
			//if we are not putting empty string it will take ascii vale 
		}
//System.out.println(s.charAt(s.length()-1));  //need to append the last odd character

	}

}
