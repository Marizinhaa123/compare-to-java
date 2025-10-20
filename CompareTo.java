package aula1;

public class CompareTo {
	public static void main(String[] args) {
		String nome1 = "Ana";
		String nome2 = "Maria";
		String nome3 = "Ana";
		
		System.out.println("nome1 VS nome2: " + nome1.compareTo(nome2));
		System.out.println("nome2 VS nome1: " + nome2.compareTo(nome1));
		System.out.println("nome1 VS nome3: " + nome1.compareTo(nome3));
	}
}
