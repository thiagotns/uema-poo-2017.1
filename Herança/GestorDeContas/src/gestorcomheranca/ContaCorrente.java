package gestorcomheranca;

public class ContaCorrente extends Conta{

	private double limiteSaque;
	
	
	ContaCorrente(int numero, int agencia, Cliente prop, double limite){
		super(numero, agencia, prop);	
		this.limiteSaque = limite;
	}
	
	public double getLimiteSaque(){
		return this.limiteSaque;
	}
	
	
	public boolean transferePara(ContaCorrente destino, double valor){
		
		if(valor <= 0){
			return false;
		}
		
		if(valor <= super.saldo){
			return false;
		}
		
		if(destino == null){
			return false;
		}
		
		super.saldo -= valor;
		
		return destino.depositar(valor);
	}
	
	
	public boolean sacar(double valor){

		if(valor > limiteSaque)
			return false;
				
		return super.sacar(valor);
	}
	

	public void imprimeDetalhes() {
		System.out.println("------------------------");
		System.out.println("--   Conta Corrente   --");
		
		super.imprimeDetalhes();
		
		System.out.println("Limite de Saque: " + limiteSaque);
	}
	
}
