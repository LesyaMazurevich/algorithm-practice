package numerical;

public class Fast2One {
	public static int one(int n){
		if (n == 1) {
			System.out.println(n);
			return 0;
		}
		if (n % 2 == 0) {
			return 1 + one(n/2);
		}
		else {
			return 2 + Math.min(one((n+1)/2),one((n-1)/2));
		}
		
	}
	public static void main(String[] args) {
		one(100);
	}
}
