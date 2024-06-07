package merryjane;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class arraylist1 {
	public static void mstwtrcntr() {
 		ArrayList<Integer> height = new ArrayList<>();
		height.add(1);
		height.add(8);
		height.add(6);
		height.add(2);
		height.add(5);
		height.add(4);
		height.add(8);
		height.add(3);
		height.add(7);
		System.out.println(height);
		int max_vol = Integer.MIN_VALUE;
		int vol = 1;
		for (int i = 0; i < height.size(); i++) {
			for (int j = 1; j < height.size(); j++) {
				int width = j - i ;
				int h;
				h=Math.min(height.get(i),height.get(j));
				 vol=width*h;
				}
			
			if(vol>max_vol) {
				
				max_vol=vol;
			}
		}
		System.out.println("The maximum vol container is " + max_vol);

	}
	// two pointer approach
	 

	public static void conmstwtr() {
	 		ArrayList<Integer> height = new ArrayList<>();
			int maxwtr=0;
	 		height.add(1);
			height.add(8);
			height.add(6);
			height.add(2);
			height.add(5);
			height.add(4);
			height.add(8);
			height.add(3);
			height.add(7);
			int lp=0;
			int rp=height.size()-1;
			while(lp<rp) {
				int h=Math.min(height.get(rp), height.get(lp));
				int w= rp-lp;
				int currwtr=w*h;
				maxwtr=Math.max(maxwtr, currwtr);
				if(lp<rp) {
					lp++;
				}
				else {
					rp--;
				}
			}
			System.out.println("The maximum vol container is " + maxwtr);
					}
	public static boolean pairsumal(ArrayList<Integer>list,int tsum) {
		int lp=0;
		int rp=list.size()-1;
		while(lp<=rp) {
		
			if(list.get(rp)+list.get(lp)==tsum) {
				return true;
			}
			else if(list.get(rp)+list.get(lp)<tsum) {
			lp++;}
			else {
			rp--;
			}
				}
		return false;
	}
	public static boolean pairsumal2(ArrayList<Integer>list,int tsum) {
		//for finding the pivot
		int lp=0;
		int rp=1;
		for(int i=0;i<list.size();i++) {
		if(list.get(i)>list.get(i+1)) {
			lp=i;
			rp=i+1;
			break;
		}
		}
		//for finding the target sum
		int n=list.size();
		while(lp<=rp) {
		
			if(list.get(rp)+list.get(lp)==tsum) {
				return true;
			}
			else if(list.get(rp)+list.get(lp)<tsum) {
			lp=(lp+1)%n;}
			else {
			rp=(n+rp-1)%n;
			}
				}
		return false;
	}
	public static void arrl(int n) {
		ArrayList<Integer> num = new ArrayList<>();
		int i = 0;
		while (i < n) {
			num.add(i);
			i++;
		}
		num.add(12);
		num.add(8);

		num.add(73);

		num.add(23);

		int j = num.size() - 1;
		int max = Integer.MIN_VALUE;
		while (j >= 0) {
			/*
			 * if(max<num.get(j)) { max=num.get(j); }
			 */
			max = Math.max(max, num.get(j));
			j--;
		}
//	System.out.println("the maximum value in arraylist num is "+max);
		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);
		Collections.sort(num, Collections.reverseOrder());
		System.out.println(num);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> height = new ArrayList<>();
 		height.add(11);
		height.add(15);
		height.add(5);
		height.add(6);
		height.add(8);
		height.add(9);
		height.add(10);
		
		
		System.out.println(pairsumal(height,16));
		//conmstwtr();
	}

}
