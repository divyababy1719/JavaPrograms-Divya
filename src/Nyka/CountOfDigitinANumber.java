package Nyka;

public class CountOfDigitinANumber {

	public static void main(String[] args) {
		int n=-12346;
		int count=0;
		while(n!=0)
		{
			int rem=n%0;
		
			if(rem>=-9 && rem<=9)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}

}
