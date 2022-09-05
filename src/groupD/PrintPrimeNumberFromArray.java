package groupD;

public class PrintPrimeNumberFromArray {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,7,8,9};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int j=2;     //prime number starting from 2
			while(n>j)     //or n>0 or j<=n
			{
				if(n%j==0)
				{
					break;
				}
				else
					j++;
			}
			if(n==j)
			{
				System.out.print(a[i]+" ");
			}
		}
		

	}
}


//r2 3 5 7 
