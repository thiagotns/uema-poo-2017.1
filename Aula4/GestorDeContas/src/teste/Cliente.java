package teste;

public class Cliente {

	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;
	private String dataNascimento;
	
	Cliente(String nome, String cpf, String dataNascimento){
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	
	public void setCpf(String cpf) {
		
		if(validaCpf(cpf)){
			this.cpf = cpf;
		} else {
			System.out.println("CPF Inválido");
		}
		
	}
	
	private boolean validaCpf(String cpf){
		
		if(cpf.length() != 11 ){
			return false;
		} else {
			return true;
		}
		
	}
	
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
	
}
