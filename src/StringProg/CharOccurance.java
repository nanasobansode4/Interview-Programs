package StringProg;

import java.util.HashMap;
import java.util.Set;

public class CharOccurance {

	public static void main(String[] args) {
		String str="Jayant";
		HashMap<Character, Integer> hm=new HashMap<>();
		char[] arr=str.toCharArray();
		for(Character temp:arr) {
			if(hm.get(temp)!=null) {
				hm.put(temp,hm.get(temp)+1);
			System.out.println(temp);
	
			}
			else {
				hm.put(temp, 1);
			}
		}
//		Set<Character> st=hm.keySet();
//		for(Character ch:st) {
//			if(hm.get(ch)>1) {
//				System.out.println(ch+"="+hm.get(ch));
//			}
//		}
		
	}

}
