package conta;

public class CorUtils {

	public static final String ROXO = "\033[35m";
	public static final String RESET = "\033[0m";

	public static String roxo(String texto) {
		return ROXO + texto + RESET;
	}

	public static void imprimirRoxo(String... linhas) {
		for (String linha : linhas) {
			System.out.println(roxo(linha));
		}
	}
}
