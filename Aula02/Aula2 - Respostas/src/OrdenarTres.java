

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarTres {

	public static void main(String[] args) {
		
		ArrayList<Integer> vetor  = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		vetor.add(x);
		
		x = sc.nextInt();
		vetor.add(x);
		
		x = sc.nextInt();
		vetor.add(x);
		
		Collections.sort(vetor);
		
		for(int i=0; i<vetor.size(); i++){
			System.out.print(vetor.get(i) + " ");
		}
			
		sc.close();
	}
}
