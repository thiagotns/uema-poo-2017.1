
public class Testador {

	public static void main(String[] args){
		
		Conta c1 = new Conta();
		c1.proprietario = "Elton";
		
		Conta c2 = new Conta();
		c2.proprietario = "Mateus";
				
		c1.imprimeProprietario();
		c2.imprimeProprietario();
	}
	
}
