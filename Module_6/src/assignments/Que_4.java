package assignments;

public class Que_4 {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int target= 14;
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			if (arr[left]+arr[right]==target) {
				System.out.println(arr[left] +","+arr[right]);
				left++;
				right--;
			}else if((arr[left]+arr[right])<target) {
				left++;
			}else {
				right++;
				
			}
		}
	}

}
