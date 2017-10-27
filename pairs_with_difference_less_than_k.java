package geeksforgeeks;

import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * http://practice.geeksforgeeks.org/problems/pairs-with-difference-less-than-k/0/?ref=self
 */
public class pairs_with_difference_less_than_k {
	public static void main(String[] angs) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
			/* reading in data */
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] nums = new int[n];
			for(int i = 0; i < n; ++i) {
				nums[i] = sc.nextInt();
			}
			
			Arrays.sort(nums);
			int res = 0;
			for(int i = 0; i < n; ++i) {
				for(int j = i+1; j < n; ++j) {
					if(nums[j] - nums[i] < k)
						++res;
					else {
						break;
					}
				}
			}
			
			System.out.println(res);
		}
	}
}
