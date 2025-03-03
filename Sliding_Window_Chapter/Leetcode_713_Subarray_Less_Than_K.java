package Sliding_Window_Chapter;
public class Leetcode_713_Subarray_Less_Than_K {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]arr= {10,5,2,6};
        int k=100;
        System.out.println(Countof_SubArray(arr,k));
	}
	public static int Countof_SubArray(int[]arr,int k) {
		int si=0;
		int ei=0;
		int p=1;
		int ans=0;
		while(ei<arr.length) {
			// Growing
			p*=arr[ei];
			// Shrinking
			while(p>=k) {
				p/=arr[si];
				si++;
			}
			// ans calculate
			ans+=(ei-si+1);
			ei++;
		}
		return ans;
		
	}
}
