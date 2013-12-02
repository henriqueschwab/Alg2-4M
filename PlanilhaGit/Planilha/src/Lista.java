public class Lista<T> {

	private Nodo<T> primeiro;
	private Nodo<T> ultimo;

	public Lista() {
		primeiro = null;
		ultimo = primeiro;
	}

	public void set(T n, int linha, int coluna) {
		Nodo<T> novoNodo = new Nodo<T>(linha, coluna);
		novoNodo.setProximo(null);
		novoNodo.setAnterior(ultimo);
		novoNodo.setCelula(n);

		if (ultimo != null) {
			ultimo.setProximo(novoNodo);
		}

		if (primeiro == null)
			primeiro = novoNodo;
		ultimo = novoNodo;

	}

	public T get(int linha, int coluna) {
		Nodo<T> n = primeiro;
		while (n != null) {
			if (n.getLinha() == linha && n.getColuna() == coluna) {
				return n.getCelula();
			}
			n = n.getProximo();
		}
		return null;
	}

}
