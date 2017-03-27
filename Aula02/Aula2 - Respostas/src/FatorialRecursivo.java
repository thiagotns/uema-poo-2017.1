

public class FatorialRecursivo {

	public static void main(String[] args) {
		System.out.println(fatorial(5));
	}
	
	static int fatorial(int n){
		
		if(n==1 || n==0){
			return 1;
		}
		
		return n*fatorial(n-1);
	}
	
}