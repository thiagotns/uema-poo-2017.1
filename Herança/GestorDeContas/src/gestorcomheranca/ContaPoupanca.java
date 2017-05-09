package gestorcomheranca;

import java.util.Date;

public class ContaPoupanca extends Conta{

	private double taxaRendimento;
	
	public ContaPoupanca(int numero, int agencia, Cliente proprietario, double taxa) {
		super(numero, agencia, proprietario);
		this.taxaRendimento = taxa;
	}
	
	public double getTaxaRendimento(){
		return this.taxaRendimento;
	}
	
	public void setTaxaRendimento(double taxa){
		this.taxaRendimento = taxa;
	}

	public boolean aplicaRendimento(){
		saldo += saldo*taxaRendimento;
		return true;
	}
	
	public void imprimeDetalhes() {
		System.out.println("------------------------");
		System.out.println("--   Conta Poupança   --");
		
		super.imprimeDetalhes();
		
		System.out.println("Taxa de Rendimento: " + taxaRendimento);
	}	
}
