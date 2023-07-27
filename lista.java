package colecoes;

import java.util.ArrayList;

public class lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		Usuario u1 = new Usuario("Carlos");
		lista.add(u1);
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Leticia"));
		// obter resultado do index
		System.out.println(lista.get(3));
		// remover pelo indice
		// lista.remove(0);//retorna o objeto que foi excluido
		System.out.println("Removido: " + lista.remove(2));// retorna o objeto que foi excluido
		// remover a partir de um objeto
		// lista.remove(new Usuario("Manu"));
		System.out.println(lista.remove(new Usuario("Manu"))); // diz se removeu ou não
		// contido ou não
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		for (Usuario u : lista) {
			System.out.println(u.nome);
		}

	}

}
