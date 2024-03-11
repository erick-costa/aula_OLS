package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo_Stream {
	public static void main(String[] args) {
		
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo", "São Paulo",
				"Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		// Constrói a nossa Stream chamada estadosEmMaiusculo
		List<String> estadosEmMaiusculo = estados.stream()
				.map(estado -> estado.toUpperCase())     // .map(): Percorre a Collection executando uma Função/Lambda para cada item
				.collect(Collectors.toList());   		 // .collect(): Finaliza as operações e transforma a Stream em Collection novamente
		
		// Constrói a nossa Stream chamada estadosSemRepeticao
		List<String> estadosSemRepeticao = estados.stream()
				.distinct()								// .distinct(): Retira valores repetidos
				.sorted()								// .sorted(): Organiza em ordem crescente os valores
				.collect(Collectors.toList());			// .collect(): Finaliza as operações e transforma a Stream em Collection novamente
		
		// Construi a nossa Stream chamada numeroEstadosR
		long numeroEstadosR = estados.stream()				 
				.filter(estado -> estado.toString().startsWith("R")) 	// .filter(): Percorre a Collection e guarda apenas os valores que passaram na condição	
				.count();												// .count(): Conta os valores registrados dentro da Collection
		
		System.out.println("Estados em Maiúsculo: " + estadosEmMaiusculo);
		System.out.println("\nEstados sem Repetição: " + estadosSemRepeticao);
		System.out.println("\nEstados que começam com a letra R: " + numeroEstadosR);
	}	
}
