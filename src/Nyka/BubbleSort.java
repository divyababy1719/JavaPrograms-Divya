package Nyka;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {3,6,8,4,2,1,9};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.print(a[i]+" ");
		}
	}
}
