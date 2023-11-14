package aula.collections2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exemplo01_LinkedList {

	public static void main(String[] args) {
		
		// Cria uma LinkedList, uma estrutura Queue, na qual o primeiro elemento inserido é o primeiro a ser removido (FIFO - First In First Out)
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for(int i=0;i<=10;i++) {
			fila.add(i); // Adiciona elementos à linkedlist
		}
		
		System.out.println("\nElementos da fila: "+fila);
		System.out.println("\nRemovendo elemento: "+fila.remove()); // Remove o primeiro elemento da fila
		System.out.println("\nElementos da fila depois de remover: "+fila);
		System.out.println("\nAdicionando o elemento 11: "+fila.add(11));
		System.out.println("\nElementos da fila depois de adicionado: "+fila);
		System.out.println("\nPegar o primeiro elemento da fila: "+fila.peek()); // Mostra o primeiro elemento da fila (não funciona para outros elementos)
		System.out.println("\nPegar o tamanho da fila: "+fila.size());
		System.out.println("\nVerificar um elemento da fila: "+fila.contains(37));
		System.out.println("\nExibir e retirar o primeiro elemento da fila: "+fila.poll()); // Exibe e retira o primeiro elemento da fila (não funciona para outros elementos)
		System.out.println();
		Iterator<Integer> iterator = fila.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nLimpar a fila: ");
		fila.clear(); // Remove todos os elementos da fila
		System.out.println("\nVerificar se a fila está vazia: "+fila.isEmpty()); // Checha se a lista está vazia
		System.out.println("\nMostrar a fila: "+fila);
		

	}

}
