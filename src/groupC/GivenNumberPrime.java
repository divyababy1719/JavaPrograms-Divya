package groupC;

public class GivenNumberPrime {

	public static void main(String[] args) {
		int n=11;
		int j=2;
		while(n>j)
		{
			if(n%2==0)
			{
				break;
			}
			else
				j++;
		}
		if(n==j)
		{
			System.out.println("prime");
		}
		else
			System.out.println("not prime");
	}

}
