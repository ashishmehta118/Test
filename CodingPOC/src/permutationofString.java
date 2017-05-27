import java.util.Arrays;

public class permutationofString {
	
	public static void main(String[] args) {
		String permutationString="abc";
		char[] secondString="bcaa".toCharArray();
		char[] firstString =permutationString.toCharArray();
		//System.out.println(firstString);
		//String restOfString =permutationString.substring(1);
		Arrays.sort(firstString);
		Arrays.sort(secondString);
		System.out.println(firstString);
		System.out.println(secondString);
		System.out.println(new String(firstString).equals(new String(secondString)));
		
		
		//
		//
		int[] letters = new int[128];
		//char[] s_array = s.toCharArray();
		for (char c : firstString) {
		letters[c]++;
		}
		//System.out.println(letters);
		
		for (char c : secondString) {
			letters[c]--;
			if(letters[c]<0){
				System.out.println("not a permutation");
				break;
			}
		}
		//System.out.println("permutation ");
		
	}

	
}
