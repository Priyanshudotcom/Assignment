package searching_Sorting_Complexity;

public class RecursiveBinarySearch {
	
	public static int recursiveBinarySearch(int[] arr, int key, int s, int e) {
		if(s>e) return -1; // key not found 
		int mid = s+(e-s)/2;
		if(arr[mid] == key) return mid;
		else if(arr[mid]< key)
			return recursiveBinarySearch(arr, key, mid+1, e);//start changes
		else
			return recursiveBinarySearch(arr, key, s, mid-1);// end changes
	}
	public static void main(String[] args) {
		int[] arr= {2,5,8,12,16,23,38,45};
		int key= 12;
		int result= recursiveBinarySearch(arr, key, 0, arr.length-1);
		System.out.println("element "+ key+ " found at index -> "+ result);
	}

}
