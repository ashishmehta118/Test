
public class convertspcetoother {
	public static void main(String[] args) {
		String s="hi how r u  ";
		char[] charactor=s.trim().toCharArray();
		int location = 0;
		boolean check = false;
		for(int i=0;i<charactor.length;i++){
			if(charactor[i]==' '){
				location=i+1;
				check=true;
			}
			if(check){
				for(int j=charactor.length-1;j>location;j--){
					charactor[j+3]=charactor[j];
				}
				charactor[location-1]='%';
				charactor[location]='2';
				charactor[location+1]='0';
			}
		}
		System.out.println(charactor);
	}
}
