import java.util.Scanner;
import static java.lang.System.*;

public class Principal {
	public static void main(String[] args) {
		Planilha obj = new Planilha('j', 100);
		Scanner ler = new Scanner(in);
		String x;

		do {
			out.println("Digite as coordenadas: ");
			x = ler.next();
			char n1 = Character.toUpperCase(x.charAt(0));
			int n2 = Integer.parseInt(x.substring(1));

			out.println("Digite o valor: ");
			String valor = ler.next();
			obj.setValor(n1, n2, valor);
		} while (!x.equalsIgnoreCase("sair"));
	}

}