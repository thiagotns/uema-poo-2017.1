package teste;

import java.util.Scanner;

public class GestorDeContas {

	public static void main(String[] args) {
				
		Cliente prop = new Cliente("João", "99999999999", "01/01/1900");
		prop.setEndereco("São Luís");
		prop.setTelefone("99999999999999");

		Conta c1 = new Conta(10, 99, prop);
		
		c1.deposita(200);
		c1.imprimeConta();
		
		System.out.println("-----------------------------");
		
		Cliente prop2 = new Cliente("Pedro", "88888888888", "01/01/1988");
		prop.setEndereco("São Luís");
		prop.setTelefone("8888888888");

		Conta c2 = new Conta(11, 99, prop2);
		
		c2.deposita(50);
		c2.imprimeConta();
		
		
		c1.transferePara(c2, 30);
		
		System.out.println("-----------------------------");
		c1.imprimeConta();
		System.out.println("-----------------------------");
		c2.imprimeConta();
		
		c2.transferePara(c1, 10);
		
		
		System.out.println("-----------------------------");
		c1.imprimeConta();
		System.out.println("-----------------------------");
		c2.imprimeConta();
				
	}
	
}
