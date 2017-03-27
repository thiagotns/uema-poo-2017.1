

public class Mdc {

	public static void main(String[] args) {
		
		int x = 270;
		int y = 240;
		
		while(true){
			
			if(x == y){
				System.out.println(x);
				break;
			}
			
			if( x > y){
				x = x-y;
				continue;
			}
			
			int aux = x;
			x = y;
			y = aux;
		}
	}
}
