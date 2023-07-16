package maximum_Subarray;

import java.util.Scanner;

/*
 * You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
 *  But the sum must not exceed B.
 */
public class Maximum_Subarray 
{
	private static int maximum_subarray_length(int[] array,int sum) {
		int left=0;
		int current_sum=0;
		int max_sum=Integer.MIN_VALUE;
		for(int right=0;right<array.length;right++)
		{
			current_sum+=array[right];
			while(current_sum>sum)
			{
				current_sum-=array[left];
				left++;
			}
			max_sum=Math.max(max_sum,current_sum);
		}
		return max_sum;
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int array_size=scanner.nextInt();
		int sum=scanner.nextInt();
		int array[]=new int[array_size];
		for(int i=0;i<array_size;i++)
		{
			array[i]=scanner.nextInt();
		}
		System.out.println(maximum_subarray_length(array,sum));
	}

	
}
/*
  Input
	A = 5
	B = 12
	C = [2, 1, 3, 4, 5]

	Output
	12
	
	Input
	A = 3
	B = 1
	C = [2, 2, 2]

	Output
	0
*/

