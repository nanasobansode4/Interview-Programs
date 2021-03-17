package StringProg;

import java.util.HashMap;

public class DuplicateWord {
	public static void main(String[] args) {
		String str = "I am am learing java java";
		HashMap<String,Integer> hm=new HashMap<>();
		String[] s = str.split(" ");
		for (String temp:s) {
			if(hm.get(temp)!=null) {
				hm.put(temp, hm.get(temp)+1);
			}
			else {
				hm.put(temp, 1);
			}
			
		}
		System.out.println(hm);
		for(String t:s)
		if(hm.get(t)>1) {
			System.out.println(t);
		}
	}
}
