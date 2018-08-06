package com.algoconcepts.backtracking.combinationsforstring;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public ArrayList<String> computeC(String os) {
		ArrayList<String> sols = new ArrayList<String>();
		helperC(os, "", sols);
		return sols;
	}
	
	public void helperC(String os, String cs, ArrayList<String> sols) {
		System.out.println(cs);
		if(os.isEmpty()) {
			System.out.println("------ SOLUTION ------");
			System.out.println("\t\t" + cs);
			System.out.println("------ SOLUTION ------");
			sols.add(cs);
		}else {
			for(int i=0;i<os.length();i++) {
				char ch = os.charAt(i);
				cs = cs + ch;
				os = os.substring(0, i) + os.substring(i+1, os.length());
				helperC(os,cs,sols);
				cs = cs.substring(0, cs.length()-1);
				os = ch + os;
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		Solution s1 = new Solution();
		String s = "ABCD";
		List<String> sol = s1.computeC(s);
		for (String s2 : sol) {
			System.out.println(s2);
		}
		System.out.println(sol.size());
	}

}
