package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo_Stream {
	public static void main(String[] args) {
		
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo", "São Paulo",
				"Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
								
		System.out.println("Estados em Maiúsculo: ");
		System.out.println("\nEstados sem Repetição: ");
		System.out.println("\nEstados que começam com a letra O: ");
	}	
}
