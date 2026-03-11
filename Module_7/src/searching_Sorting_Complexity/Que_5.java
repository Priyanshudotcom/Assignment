package searching_Sorting_Complexity;
import java.util.Arrays;

public class Que_5 {

	    public static void selectionSort(int[] arr) {
	        for(int i = 0; i < arr.length - 1; i++) {
	            int minIndex = i;

	            for(int j = i + 1; j < arr.length; j++) {
	                if(arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            if(minIndex != i) {   
	                int temp = arr[i];
	                arr[i] = arr[minIndex];
	                arr[minIndex] = temp;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {5, 8, -1, 2, 4, 6, 8};

	        System.out.println(Arrays.toString(arr));
	        selectionSort(arr);
	        System.out.println(Arrays.toString(arr));
	    }
	

}
