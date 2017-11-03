package geeksforgeeks;


import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * http://practice.geeksforgeeks.org/problems/even-and-odd-elements-at-even-and-odd-positions/0/?ref=self
 */
public class Even_and_odd_elements_at_even_and_odd_positions {
	public static void main(String[] angs) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
			/* reading in data */
			int n = sc.nextInt();
			int[] nums = new int[n];
			for(int i = 0; i < n; ++i) {
				nums[i] = sc.nextInt();
			}
						
			List<Integer> odd = new LinkedList<>();
			List<Integer> even = new LinkedList<>();
			for(int i = 0; i < n; ++i) {
				if((nums[i] & 1) == 1)
					odd.add(nums[i]);
				else
					even.add(nums[i]);				
			}
			
			for(int i = 0, a = 0, b = 0; i < n; ++i) {
				if((i & 1) == 0) {
					nums[i] = (a < even.size()) ? even.get(a++) : odd.get(b++);
				}
				else
					nums[i] = (b < odd.size()) ? odd.get(b++) : even.get(a++);
			}
			
			for(int i = 0; i < n; ++i) {
				if(i == 0)
					System.out.print(i);
				else
					System.out.println(" " + i);
				
			}
			//System.out.println(Arrays.toString(nums));
		}
	}
}