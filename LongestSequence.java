
public class LongestSequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "aaabbbb";
		int[] re =  LongestSeq(string);
		System.out.println("at index "+re[0] + "length of repeating index is"+re[1]);
		
		 

	}
	static int[] LongestSeq(String s){
		int LongestIndex = -1;
		int LongestLength = 0;
		
		for(int i=0;i<s.length()-1;i++){
			
			
			int j = i+1;
			int sub_length=1;
				while(s.charAt(i) == s.charAt(j) && j<=s.length()){
					sub_length = sub_length+1;
					j++;
					
				}
			if(LongestLength < sub_length ){
			
				LongestLength = sub_length;
				LongestIndex = i;
				
			}
			i=j-1;	
			
		}
		
		return new int[]{LongestIndex,LongestLength};
		
		
	}

}
