public class Sunday {
	
	// 只针对所有ascii码的情况
	private final static int ASSIZE = 256;
	
	public int[] preProcess(String pattern){
		
		int m = pattern.length();
		
		int[] next = new int[ASSIZE];
		
		for (int i = 0; i < ASSIZE; i++) {
			next[i] = m + 1;
		}
		
		for (int i = 0; i < m; i++) {
			next[pattern.charAt(i)] = m - i;
		}
		
		return next;
	}
	
	public int indexOf(String source,String pattern){
		int[] next = preProcess(pattern);
		
		int index = 0;
		
		while (index + pattern.length() <= source.length()) {
			int cur = index + pattern.length() - 1;
			int m = pattern.length()-1;
			
			for (; 		
				 m >= 0 &&
				 source.charAt(cur) == pattern.charAt(m); 
				 m--,cur--){
			}
			
			if (m == -1) {		//找到一个匹配
				return index;
			}
			
			index += next[source.charAt(index+pattern.length())];
			
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		Sunday sunday = new Sunday();
		String source = "sfababcasfbabcabcabababcabababbabcabg";
		String pattern = "abc";
		
		int index = sunday.indexOf(source, pattern);
		
		if(index >= 0){
			System.out.println(index);
		}
		else{
			System.out.println("No contain");
		}
	}
	
}
