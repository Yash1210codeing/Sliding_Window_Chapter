package Sliding_Window_Chapter;
public class SubArraySum_Of_Size_K {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr= {2,1,3,4,5,6,7,8,9,2,3};
        int k=3;
        System.out.println(MaxSum_of_Size_k(arr, k));
	}
	public static int MaxSum_of_Size_k(int[]arr,int k) {
		int sum=0;
		int ans=0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];			
		}
		ans=sum;
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i]; // Grow
			sum-=arr[i-k]; // Shrink
			ans=Math.max(ans, sum);
		}
		return ans;
	}
}
