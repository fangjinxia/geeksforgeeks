package geeksforgeeks;

import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * http://practice.geeksforgeeks.org/problems/find-k-th-missing-element/0/?ref=self
 */
public class Find_kth_missing_element {
	public static void main(String[] angs) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
			/* reading in data*/
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n1];
			int[] b = new int[n2];
			for(int i = 0; i < n1; ++i) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < n2; ++i) {
				b[i] = sc.nextInt();
			}
			
			Arrays.sort(b);
			List<Integer> res = new LinkedList<>();
			int i = 0, j = 0;
			for(; i < n1 && j < n2; ) {
				if(a[i] == b[j]) {
					++i;
				}
				else if(a[i] > b[j]){
					++j;
				}
				else {
					res.add(a[i++]);
				}
			}
			
			while(i < n1) {
				res.add(a[i++]);
			}
			
			if(k > res.size())
				System.out.println(-1);
			else
				System.out.println(res.get(k-1));
		}
	}
}
