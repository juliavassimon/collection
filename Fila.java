package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		// valores do tipo String
		Queue<String> fila = new LinkedList<>();
		// adicionar elemento na fila
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		// pegar elemento da fila
		System.out.println(fila.peek());
		System.out.println(fila.poll());
		// retorna o elemento já removendo
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		// saber o tamanho da fila
		System.out.println(fila.size());
		// saber se a fila ta vazia ou não
		System.out.println(fila.isEmpty());
		Queue<String> fila2 = new LinkedList<>();
		fila2.offer("Julia");
		fila2.offer("Marina");
		fila2.offer("Carol");
		// criar uma nova fila para juntar a fila
		LinkedList<String> novaFila = new LinkedList<>(fila);
		novaFila.addAll(fila2); // junção da fila2 com a nova
		Queue<String> filaFinal = new LinkedList<>(novaFila); //
		while (!filaFinal.isEmpty()) {
			System.out.print(filaFinal.poll() + " ");
		}

	}

}
