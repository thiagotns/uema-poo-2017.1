

public class MdcRecusivo {

	public static void main(String[] args) {
		System.out.println(mdc(270,240));
	}
	
	
	static int mdc(int x, int y){
		
		if(x == y)
			return x;
		
		if(x > y)
			return mdc(x-y, y);
		
		return mdc(y, x);
	}
}
