package Interview;

public class RainPouringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {3,0,1,0,4,0,2};
		//int arr[]= {1,2,3,4};//output=0
		int arr[]= {2,1,5,3,1,0,4};//output=9
		int n=arr.length,i,output=0;
		int l[]=new int[n];
		int r[]=new int[n];
		l[0]=arr[0];
		r[n-1]=arr[n-1];
		for( i=1;i<n;i++)
		{
			l[i]=Math.max(l[i-1], arr[i]);
		}
		
		System.out.print("Left array -->");
		for(i=0;i<n;i++)
			System.out.print(l[i]+" ");
		
		System.out.println();
		
		for( i=n-2;i>=0;i--)
		{
			r[i]=Math.max(r[i+1], arr[i]);
		}
		
		System.out.print("Right array -->");
		for(i=0;i<n;i++)
			System.out.print(r[i]+" ");
		
		for(i=0;i<n;i++)
			{
			output+=Math.min(l[i],r[i])-arr[i];
			}
		System.out.println();
		System.out.println("Total unit of water trapped :"+output);
	}

}
