package groupD;

public class SumOfFirstThreeMinimumElementsInArray2 {

	public static void main(String[] args) {
		int a[]= {20,10,40,30,50};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
			}
	}
	for(int i=0;i<3;i++)
	{
		sum=sum+a[i];
	}
	System.out.println(sum);
	}
}

