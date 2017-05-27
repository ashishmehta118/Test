
public class UniqueCharactor {

	public static void main(String[] args) {
		String checkString="44";
		boolean result=uniqueString(checkString);
		System.out.println(result);
	}
	public static boolean uniqueString(String userString){
		boolean[] duplicateString=new boolean[255];
		char arr[]=userString.toCharArray();
		for(char currentArray:arr){
			int byteCodeofCurrentArray=currentArray;
			if(duplicateString[byteCodeofCurrentArray]){
				return false;
			}else{
				duplicateString[byteCodeofCurrentArray]=true;
			}
		}
		return true;
	}
}
