package aula.collections2;

import java.util.Iterator;
import java.util.Stack;

public class Exemplo02_Stack {

	public static void main(String[] args) {
		
		// Cria uma Stack, uma estrutura na qual o último elemento inserido é o primeiro a ser removido (LIFO - Last In First Out)
		Stack<String> pilha = new Stack<String>();
		
		// O método .push(x) insere x no final da lista
		pilha.push("Abacate");
		pilha.push("Limão");
		pilha.push("Melão");
		pilha.push("Tomate");
		pilha.push("Kiwi");
		pilha.push("Lichia");
		
		System.out.println("\nElementos da pilha: "+pilha);
		System.out.println("\nRetirar elemento: "+pilha.pop()); // O método .pop() remove o último elemento inserido na lista
		System.out.println("\nElementos da pilha: "+pilha);
		System.out.println("\nElemento no topo da pilha: "+pilha.peek()); // Mostra o último elemento inserido
		System.out.println("\nAdicionar elemento na pilha: "+pilha.push("Maracujá"));
		System.out.println("\nExibir a pilha atualizada: "+pilha);
		System.out.println("\nTamanho da pilha: "+pilha.size());
		System.out.println("\nVerificar se existe um elemento chamado Kiwi "
				+ "na minha pilha: "+pilha.contains("Kiwi")); // O método .contains(x) checa se x está na lista
		
		Iterator<String> iterator = pilha.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		pilha.clear(); // Remove todos os elementos da lista
		
		System.out.println("\nA pilha está vazia? "+pilha.isEmpty()); // Checa se a lista está vazia

	}

}
