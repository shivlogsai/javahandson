import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LIS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of inputs you want to enter in the array: ");
		int n=sc.nextInt();
		System.out.println("Enter the inputs in the array: ");
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
		//array[i]=random.nextInt(100);
			array[i] = sc.nextInt();
		   }
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> longestList = new ArrayList<Integer>();
		int currentMax;
		int highestCount = 0;
		for(int i = 0; i < array.length;i++)
		{
			currentMax = Integer.MIN_VALUE;
			for(int j = i;j < array.length; j++)
			{
				if(array[j] > currentMax)
				{
					list.add(array[j]);
					currentMax = array[j];
				}
			}
			
			
			
			if(highestCount < list.size())
			{
				highestCount = list.size();
				longestList = new ArrayList<Integer>(list);
			}
			list.clear();
		}
		System.out.println();
		
		//Print list
		Iterator<Integer> itr = longestList.iterator();
		System.out.println("The Longest subsequence");
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println("Length of LIS: " + highestCount);
	}
	
}
