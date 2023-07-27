package colecoes;

import java.util.HashMap;
import java.util.Map;

public class map {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Roberta");
		usuarios.put(3, "Rafael");
		usuarios.put(4, "Robson");
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Robson"));
		// percorrer a chave
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		// percorrer o valor
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}
		// percorrer ambos
		// usa o entry
		for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
	}
}
