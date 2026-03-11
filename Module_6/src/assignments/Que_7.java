package assignments;

public class Que_7 {
		public static void main(String[] args) {
			int[] arr= {-3,8,5,-12,7,6};
			int left=0;
			int right=arr.length-1;
			while(left < right) {
				while(arr[left]< 0) {
					left++; 				}
				while(arr[right]>=0) {
					right--; 
				}
				if(left<right) { 
					int temp= arr[left];
					arr[left]=arr[right];
					arr[right]=temp;
				}
			}
			for (int x : arr) {
			System.out.print(x+" ");
			}
		}

	}


