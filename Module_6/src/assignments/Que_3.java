package assignments;

public class Que_3 {
	    public static int[] getUpdatedArray(int[] original, int[][] updates) {
	        int n = original.length;
	        int[] diff = new int[n + 1];

	        for (int[] update : updates) {
	            int L = update[0];
	            int R = update[1];
	            int val = update[2];
	            
	            diff[L] += val;
	            if (R + 1 < n) {
	                diff[R + 1] -= val;
	            }
	        }      
	        int[] result = new int[n];
	        int runningSum = 0;
	        for (int i = 0; i < n; i++) {
	            runningSum += diff[i];
	            result[i] = original[i] + runningSum;
	        }
	        return result;
	    }
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40, 50};
	        int[][] updates = {{1, 3, 5}, {2, 4, 10}}; 
	        int[] finalArr = getUpdatedArray(arr, updates);
	        for (int val : finalArr) System.out.print(val + " ");
	    }
	}


