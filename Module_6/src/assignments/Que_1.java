package assignments;

public class Que_1 {
	
	static int KadaneAlg(int[] arr) {
		int cmax=arr[0];
		int gmax=arr[0];
		for(int i=1;i<arr.length;i++) {
			cmax= Math.max(arr[i],cmax +arr[i]);
			gmax=Math.max(cmax, gmax);
		}
		return gmax;
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,-5};
		System.out.println(KadaneAlg(arr));
	}
}
