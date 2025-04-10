package interviewquestionsString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Removeduplicates {

	public static void main(String[] args) {

		String ss = "ramanan";
		
		//1st method

		HashSet<Character> ls = new LinkedHashSet<>();

		for (char vv : ss.toCharArray()) {

			if (!ls.contains(vv)) {
				ls.add(vv);
			}

			
		}
		System.out.print(ls);
		
		// 2nd method 
		
	String []van=	ss.split("");
	
	
	HashSet<String> hs = new LinkedHashSet<String>();
	
	for(String iter : van) {
		
		
		if(!hs.contains(iter)) {
			
			hs.add(iter);
		}
	}
	
	System.out.println(hs);
	}

	
	
}
