package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();

		livros.add("O pequeno principe");
		livros.push("Don Quixote");
		livros.push("Hobit");
		System.out.print(livros.peek()); // ultimo a entrar, primeiro a sair
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.isEmpty());
		System.out.println(livros.size());

	}
}
