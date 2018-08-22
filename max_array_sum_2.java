
// Sum of all possible subsets of an array such that no two elements are consecutive

public class max_array_sum_2{

	public static int FindMax(int[] arr)
	{
		int arr_len = arr.length;

		int incl = arr[0];

		int excl = 0;

		int excl_new;

		for(int i = 1; i < arr_len; i++)
		{
			excl_new = (incl > excl) ? incl : excl;

			incl = excl + arr[i];

			excl = excl_new;
		}

		return ((incl > excl) ? incl : excl); 
	}
}