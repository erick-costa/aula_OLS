package lambda;
import java.util.Arrays;
import java.util.List;

public class Exemplo_Lambda {

	public static void main(String[] args) {
		
		// Criando uma Collection do Tipo List de números
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		System.out.println("Exibir os itens\n");
				
		// Exibir os itens da Lista
		numeros.forEach(n -> System.out.println(n)) ;
				
		for(int n = 0; n < 9; n++) {
			System.out.println(n);
		}

		System.out.println("\nExibir os itens somados com eles mesmos\n");
		
		// Exibir os itens da Lista dobrados
		numeros.forEach(n -> System.out.println(n + n));
		
		for(Integer n : numeros) {
			System.out.println(n + n);
		}
		
	}
}
