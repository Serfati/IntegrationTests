
public class Program {


	// Returns the size of the array
	public static int size(int[] arr) {
		return arr.length;
	}

	// Prints the array
	public static void printArr(int[] arr) {
		for(int val: arr)
			System.out.print(val+" ");
		System.out.println();
	}

	// Returns index of the minimum value in the array
	// Returns -1 if array is empty
	public static int minValueIndex(int[] arr) {
		if (arr==null) return -1;
		// FIXME: add:
		if (size(arr)<1) return -1;
		int res = arr[0];
		// FIXME: for (int val: arr)
		// FIXME:	if (val<res) res = val;
		int resValue = (int) Double.POSITIVE_INFINITY;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < resValue) {
				res = i;
				resValue = arr[i];
			}
		}
		return res;
	}

	// Returns index of the maximum value in the array
	// Returns -1 if array is empty
	public static int maxValueIndex(int[] arr) {
		// FIXME: add:
		if (arr==null) return -1;
		if (size(arr)<1) return -1;
		int res = arr[0];
		// FIXME: for (int val: arr)
		// FIXME:	if (val>res) res = val;
		int resValue = (int) Double.NEGATIVE_INFINITY;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > resValue) {
				res = i;
				resValue = arr[i];
			}
		}
		return res;
	}

	// Returns the maximum value in the array
	public static int maxValue(int[] arr) {
		int ind = maxValueIndex(arr);
		return arr[ind];
	}

	// Returns the minimum value in the array
	public static int minValue(int[] arr) {
		// FIXME: int ind = maxValueIndex(arr);
		int ind = minValueIndex(arr);
		return arr[ind];
	}

	// Returns sum of minimum and maximum values in the array
	public static int sumMinMax(int[] arr) {
		return minValue(arr) + maxValue(arr);
	}


	// Returns copy of the array "arr"
	public static int[] copyArr(int[] arr) {
		if (arr == null) return null;
		int[] res = new int[size(arr)];
		for(int i=0; i<size(arr); i++)
			// FIXME: res[i] = arr[0];
			res[i] = arr[i];
		return res;
	}


	// Return a copy of array. Swaps the minimum value in the array with maximum one
	public static int[] swapMinMax(int[] arr) {
		int[] res = copyArr(arr);
		int minInd = minValueIndex(arr);
		// FIXME: int maxInd = maxValue(arr);
		int maxInd = maxValueIndex(arr);
		if (minInd <0 || maxInd <0) return null;
		res[minInd] = arr[maxInd];
		res[maxInd] = arr[minInd];
		return res;
	}


	// Returns an ascending sorted copy of array "arr"
	public static int[] sortArray(int[] arr) {
		if (arr == null) return null;
		int[] res = copyArr(arr);
		for(int i=0; i<size(arr); i++)
			for (int j=0; j<size(arr)-i-1; j++)
				if (res[j]>res[j+1]) {
					int temp = res[j];
					res[j] = res[j+1];
					res[j+1] = temp;
				}
		return res;
	}


	// Returns true if arrays are equal
	public static boolean equalArrays(int[] arr1, int[] arr2) {
		if (arr1==null && arr2 == null) return true;
		if (arr1==null || arr2 == null) return false;
		if (size(arr1)!=size(arr2)) return false;
		for (int i=0; i<size(arr1); i++)
			// FIXME: if (arr1[i]==arr2[i]) return true;
			if (arr1[i]!=arr2[i]) return false;
		// FIXME: return false;
		return true;
	}


	// Returns true if array "arr" is sorted in ascending order
	public static boolean isSorted(int[] arr) {
		int[] sorted = sortArray(arr);
		return equalArrays(arr, sorted);
	}


	// Merges two arrays "ar1" and "ar2" into one sorted array and returns it
	public static int[] merge(int[] ar1, int[] ar2) {
		if (ar1==null && ar2==null) return null;
		if (ar1==null) return sortArray(ar2);
		if (ar2==null) return sortArray(ar1);
		int[] res = new int[ar1.length+ar2.length];
		int i = 0;
		for(int j=0; j<ar1.length; j++)
			res[i++] = ar1[j];
		for(int j=0; j<ar2.length; j++)
			res[i++] = ar2[j];
		return sortArray(res);
	}


	/* Prints arrays in the following order:
	 * arr
	 * sorted arr
	 * arr
	 *
	 * if arr is null prints:
	 * No array
	 */
	public static void printSorted(int[] arr) {
		if (arr==null) {
			System.out.println("No array");
			// FIXME: add:
			return;
		}
		printArr(arr);
		// FIXME: ERASED: arr = sortArray(arr);
		printArr(sortArray(arr));
		printArr(arr);
	}


}
