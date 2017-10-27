package geeksforgeeks;

import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * An array is said to be perfect if it's reverse array matches the original array
 */
public class Perfect_Arrays {
	public static void main(String[] angs) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
			int n = sc.nextInt();
			int[] nums = new int[n];
			for(int i = 0; i < n; ++i) {
				nums[i] = sc.nextInt();
			}
			
			int i = 0, j = n-1;
			for(; i < j; ++i, --j) {
				if(nums[i] != nums[j]) {					
					break;
				}				
			}
			
			if(i < j)
				System.out.println("NOT PERFECT");
			else
				System.out.println("PERFECT");
		}
		
	}
}
