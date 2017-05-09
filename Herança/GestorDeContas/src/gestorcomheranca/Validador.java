package gestorcomheranca;

public class Validador {

	public static boolean validaCpf(String cpf){
		
		if(cpf == null){
			return false;
		}
		
		if(cpf.isEmpty()){
			return false;
		}
		
		if(cpf.length() != 11){
			return false;
		}
		
		return true;
	}
}
