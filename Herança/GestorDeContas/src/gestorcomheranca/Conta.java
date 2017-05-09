package gestorcomheranca;


public class Conta {

	private int numero;
	private int agencia;
	protected double saldo;
	
	private Cliente proprietario;
	
	Conta(int numero, int agencia, Cliente proprietario){
		this.numero = numero;
		this.agencia = agencia;
		this.proprietario = proprietario;
		this.saldo = 0;
	}
	
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setProprietario(Cliente proprietario) {
		this.proprietario = proprietario;
	}

	public int getAgencia(){
		return this.agencia;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public Cliente getProprietario(){
		return this.proprietario;
	}
	
	public boolean depositar(double valor){
		
		if(valor <= 0){
			return false;
		}
		
		saldo += valor;
		
		return true;
	}
	
	public boolean sacar(double valor){
		
		if(valor <= 0){
			return false;
		}
		
		if(valor > saldo){
			return false;
		}
		
		saldo -= valor;
		return true;
	}
	
	public void imprimeDetalhes(){
		System.out.println("------------------------");
		System.out.println("Proprietário: " + proprietario.getNome());
		System.out.println("Ag.: " + agencia + " Conta:" + numero);
		System.out.println("Saldo: " + getSaldo());
	}
	
	
}
