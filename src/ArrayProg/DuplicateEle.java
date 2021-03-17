package ArrayProg;

public class DuplicateEle {

	public static void main(String[] args) {
		int a=0;
		String[] str= {"1","2","1","3","1"};
		for(int i=0;i<str.length-1;i++) {
			for(int j=i+1;j<str.length;j++) {
				if((str[i].equals(str[j])) && (i!=j)){
					System.out.println("Duplicate element is"+str[j]);
					a=a+1;
				}
			}
		}

	}

}
