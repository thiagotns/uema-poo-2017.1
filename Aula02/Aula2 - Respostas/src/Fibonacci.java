

public class Fibonacci {

	public static void main(String[] args) {
	
		int n = 10;
		int ant = 1;
		int atual = 0;
				
		for(int i=1; i<=n; i++){
			int aux = atual;
			atual = atual + ant;
			ant = aux;
			
			System.out.print(atual + " ");
		}
		
	}
}
