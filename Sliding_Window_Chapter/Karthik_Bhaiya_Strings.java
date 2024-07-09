package Sliding_Window_Chapter;
import java.util.*;
public class Karthik_Bhaiya_Strings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String s=sc.next();
        int flip_a=MaxLenofString(s,'a',k);
        int flip_b=MaxLenofString(s,'b',k);
        System.out.println(Math.max(flip_a,flip_b));
	}
	public static int MaxLenofString(String str,char ch, int k) {
		int si=0;
		int ei=0;
		int ans=0;
		int flip=0;
		while(ei<str.length()) {
			// Growing
			if(str.charAt(ei)==ch) {
				flip++;
			}
			// Shrink
			while(flip>k&&si<=ei) {
				if(str.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
			// Ans Calculate
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}
}
