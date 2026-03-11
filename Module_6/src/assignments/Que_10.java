package assignments;
import java.util.Arrays;

public class Que_10 {

	    public static void rearrange(int[] nums) {
	        int n = nums.length;
	        int even = 0; 
	        int odd = 1;  
	        while (even < n && odd < n) {
	            if (nums[even] % 2 == 0) {
	                even += 2;
	            } 
	            else if (nums[odd] % 2 != 0) {
	                odd += 2;
	            } 
	            else {
	                int temp = nums[even];
	                nums[even] = nums[odd];
	                nums[odd] = temp;
	                even += 2;
	                odd += 2;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {3, 2, 5, 4, 1, 6};
	        rearrange(arr);
	        System.out.println("Rearranged Array: " + Arrays.toString(arr));
	  
	    }
	

}
