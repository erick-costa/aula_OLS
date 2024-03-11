package optional;

import java.util.Optional;

public class Exemplo_Optional {
	public static void main(String[] args) {

		String[] palavras = new String[10];
		
		palavras[5] = "GENERATION";		
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		
		if(checaNulo.isPresent()) {
			System.out.println("Valor dentro do optional: " + checaNulo.get());
			
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		} else {
			System.out.println("A posição do Array está vazia!");
		}
		
		// void -> tipagem específica de métodos
		// null -> tipo de retorno
	}
}
