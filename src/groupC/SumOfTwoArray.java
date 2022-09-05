package groupC;

public class SumOfTwoArray {

	public static void main(String[] args) {

		 int a[]= {2,3,4};
		 int b[]= {2,5,6,7};
		 
		 int count=a.length;
		if(a.length<b.length)
		{
			count=b.length;
		}
		for(int i=0;i<count;i++)
		{
		try
		
		{
			System.out.print(a[i]+b[i]+" ");
		}
		
		catch(Exception e)
		{
			try
			{
			System.out.println(b[i]);
			}
			catch(ArrayIndexOutOfBoundsException c)
			{
				System.out.println(a[i]);
			}
			
			
		}
		}
		 
	}

}
