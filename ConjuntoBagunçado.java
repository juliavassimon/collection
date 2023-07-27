package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
	@SuppressWarnings({ "rawtypes", "unchecked" }) // silenciar os erros

	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		// primeiro metodo = adicionar

		conjunto.add(1.2); // add double --> Double
		conjunto.add(true); // add boolean --> Boolean
		conjunto.add("Teste"); // add String --> já é objeto
		conjunto.add(1); // add int --> Integer
		conjunto.add('x');
		// saber o tamanho
		System.out.println("Tamanho é: " + conjunto.size());
		// remover elementos de dentro do conjunto
		System.out.println(conjunto.remove('x'));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove(1));
		System.out.println("Tamanho é: " + conjunto.size());
		// verificar se o elemento esta ou não contido dentro do conjunto
		System.out.println(conjunto.contains('x'));
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		// união dos conjuntos
		conjunto.addAll(nums);
		System.out.println(conjunto);
		// interseção dos conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		// limpar o conteudo do conjunto
		conjunto.clear();
		System.out.println(conjunto);
	}
}
