package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotationArray {

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, int queries) {
    // Write your code here
    List<Integer> updatedArray= new ArrayList<>(a.size());
    List<Integer> temp= new ArrayList<>();
    int i,j;
    int n=a.size();
    for(i=1;i<=k;i++)
    {
        updatedArray.add(a.get(n-1));
        for(j=1;j<=n-1;j++)
        {
            updatedArray.add(a.get(j-1));
        }
        //a.clear();
        Collections.copy(a, updatedArray);
        System.out.print("Array after rotaion "+i+" : ");
        for(int e:updatedArray)
		{
			System.out.print(e+" ");
		}
        
        updatedArray.clear();
        
        System.out.println();
    }
    //System.out.println(updatedArray.toArray());
    for(i=0;i<queries;i++)
    {
        temp.add(a.get(i));
    }
    return temp;
    }

    
	public static void main(String[] args) {
		
		List<Integer> a=new ArrayList<>(List.of(1,3,4,5,6));
		//a.clear();
		System.out.print("Original Array : ");		
		for(int e:a)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		int q=2;
		int k=4;
		List<Integer> result = circularArrayRotation(a,k,q);
		System.out.print("First "+q+" elemets of the array after rotaion : ");
		for(int e:result)
		{
			System.out.print(e+" ");
		}
	}

}

