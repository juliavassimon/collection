package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoComportado {
	public static void main(String[] args) {

		// todos os dados do msm tipo - homogeneo
		SortedSet<String> listaAprovados = new TreeSet<String>(); // treeSet garante a ordem de inserção
		listaAprovados.add("Anna");
		listaAprovados.add("Roberto");
		listaAprovados.add("Julia");
		listaAprovados.add("Carol");

		for (String candidatos : listaAprovados) {
			System.out.println(candidatos);
		}
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		// nums.get(3); não é possível acessar pelo índice
		for (int n : nums) {
			System.out.println(n);
		}
	}
}