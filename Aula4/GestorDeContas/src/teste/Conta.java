package teste;

public class Conta {

	private int numero;
	private int agencia;
	private double saldo;
	private double limiteSaque;
	
	private Cliente proprietario;
	
	
	public Conta(int num, int ag, Cliente prop){
		numero = num;
		agencia = ag;
		proprietario = prop;
	}
	
	
	public void setLimiteSaldo(double limite){
		limiteSaque = limite;
	}
	
	public int getNumero(){
		return numero;
	}
	
	public int getAgencia(){
		return agencia;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public double getLimiteSaque(){
		return limiteSaque;
	}
	
	public Cliente getProprietario(){
		return proprietario;
	}
	
	
	public void deposita(double valor){
		saldo += valor;
	}
	
	public boolean saca(double valor){
		
		if(verificaSaldo(valor)){
			saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo Insuficiente");
			return false;
		}
		
	}
	
	private boolean verificaSaldo(double valor){
		if( saldo >= valor ){
			return true;
		} else {
			return false;
		}
	}
	
	public void imprimeSaldo(){
		System.out.println("Seu saldo é: " + saldo);
	}
	
	public void imprimeConta(){
		System.out.println("Nº: " + getNumero() + "\n" + 
				 "Agencia: " + getAgencia() + "\n" +
				 "Proprietario: " + getProprietario().getNome() + " " 
				 + getProprietario().getDataNascimento());
		
		imprimeSaldo();
	}
	
	public void transferePara(Conta destino, double valor){
		
		if(this.saca(valor)){
			destino.deposita(valor);
		}
		
	}
	
	
	
	
}
