package gestorcomheranca;

import java.util.ArrayList;

public class Gestor {

	public static void main(String[] args) {

		ArrayList<ContaCorrente> contasCorrente = new ArrayList<>();
		ArrayList<ContaPoupanca> contasPoupanca = new ArrayList<>();
		
		Cliente c1 = new Cliente("João", "12345678901", "01/01/1990");
		ContaCorrente cc1 = new ContaCorrente(101, 99, c1, 50);
		cc1.depositar(100);
		cc1.sacar(40);
		contasCorrente.add(cc1);
		
		Cliente c2 = new Cliente("Maria", "32145678901", "01/01/1987");
		ContaCorrente cc2 = new ContaCorrente(102, 99, c2, 300);
		cc2.depositar(200);
		cc2.sacar(30);
		contasCorrente.add(cc2);
		
		Cliente c3 = new Cliente("Pedro", "10987654300", "31/01/1990");
		ContaPoupanca cp1 = new ContaPoupanca(103, 99, c3, 0.05);
		cp1.depositar(250);
		cp1.aplicaRendimento();
		cp1.sacar(20);		
		contasPoupanca.add(cp1);
		
		Cliente c4 = new Cliente("Marina", "10987654311", "10/08/1988");
		ContaPoupanca cp2 = new ContaPoupanca(104, 99, c4, 0.02);
		cp2.depositar(500);
		cp2.aplicaRendimento();
		cp2.sacar(35);
		contasPoupanca.add(cp2);

		//Imprime contas correntes
		for (ContaCorrente aux : contasCorrente) {
			aux.imprimeDetalhes();
		}
		
		//Imprime contas poupança
		for (ContaPoupanca aux : contasPoupanca) {
			aux.imprimeDetalhes();
		}
		
	}
}
