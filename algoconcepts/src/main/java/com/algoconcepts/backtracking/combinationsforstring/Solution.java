package com.algoconcepts.backtracking.combinationsforstring;

import java.util.ArrayList;

public class Solution {

	public void computeC(String s) {
		ArrayList<String> sols = new ArrayList<String>();
		helperC(s, "", sols);
	}
	
	public void helperC(String s, String cs, ArrayList<String> sols) {
		if(s.isEmpty()) {
			System.out.println(cs);
			sols.add(cs);
		}else {
			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				cs = cs + ch;
				s = s.substring(0, i) + s.substring(i+1, s.length()-1);
				helperC(s,cs,sols);
				cs = cs.substring(0, i);
				s = s.substring(0, i) + ch + s.substring(i+1, s.length()-1);
			}
		}
	}
	
	public static void main(String[] args) {
		Solution s1 = new Solution();
		String s = "ABCD";
		s1.computeC(s);

	}

}
