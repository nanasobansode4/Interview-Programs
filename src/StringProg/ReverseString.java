package StringProg;

public class ReverseString {

	public static void main(String[] args) {
		String str="Nana Saheb Bansode";
		String[] arr=str.split(" ");
		for(int j=0;j<arr.length;j++) {
			char[] ch=arr[j].toCharArray();
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
			
		}

		
	}

}
