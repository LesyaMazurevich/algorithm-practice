package numerical;

/*
 *	ABCDEF * 3  = BCDEFA 
 * 
 */


public class Solve_02 {

	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				for(int k = 0; k < 10; k++){
					for(int l = 0; l < 10; l++){
						for(int m = 0; m < 10; m++){
							for(int n = 0; n < 10; n++){
								int A = i * 100000;
								int B = j * 10000;
								int C = k * 1000;
								int D = l * 100;
								int E = m * 10;
								int F = n;
								
								int expectA = i;
								int expectB = j * 100000;
								int expectC = k * 10000;
								int expectD = l * 1000;
								int expectE = m * 100;
								int expectF = n * 10;
								
								int ABCDEF = A+B+C+D+E+F;
								int BCDEFA = expectA + expectB+expectC+expectD+expectE+expectF;
								
								if(ABCDEF * 3 == BCDEFA){
									System.out.println(""+i+j+k+l+m+n);
								}
							}
						}
					}
				}
			}
		}
	}
}
