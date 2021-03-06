package classic;

/*
 * 洗扑克牌
 * 
 * 考虑花色与效率
 */
public class Pork {
	private final static int N = 52;
	private static int[] porker = new int[N];
	
	
	private static void init(){				  // 先将牌按顺序将牌放好
		for (int i = 0; i < N; i++) {
			porker[i] = i+1;
		}
	}
	
	public static void shuffle(){              // 洗牌
		for (int i = 0; i < N; i++) {
			int magic = (int)(Math.random()*N);
			int temp = porker[i];
			porker[i] = porker[magic];
			porker[magic] = temp;
		}
	}
	
	public static void print(int[] porker) {  // 打印扑克牌
		for (int i = 0; i < N; i++) {
			switch (porker[i]/13) {
			case 0:	System.out.print("方 "); break;
			case 1:	System.out.print("梅 "); break;
			case 2:	System.out.print("桃 "); break;
			case 3:	System.out.print("黑 "); break;
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < N; i++) {
			switch (porker[i]%13) {
			case 0:	 System.out.print("K "); break;
			case 12: System.out.print("Q "); break;
			case 11: System.out.print("J "); break;	
			default: System.out.print(porker[i]%13+" "); break;
			}
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		init();
		print(porker);
		shuffle();
		print(porker);
	}
}
