package objectlist;

public class Lista implements List {

	private Object[] listObjetos = null;
	private int posicaoLivre;
	private int tamanhoLista;

	Lista(Object obj) {
		listObjetos = new Obj[0];
		this.tamanhoLista = 0;
		obj.toString();
	}

	@Override
	public void adiciona(Object objeto) {
		this.tamanhoLista++;
		Object[] listaAux = new Object[this.tamanhoLista];

		for (int i = 0; i < this.tamanhoLista - 1; i++) {
			listaAux[i] = listObjetos[i];
		}

		this.listObjetos = listaAux;
		this.listObjetos[(this.tamanhoLista - 1)] = objeto;
	}

	public void adiciona(int posicao, Object objeto) {
		for (int i = this.tamanhoLista; posicao >= i; i++) {

		}
	}

	@Override
	public void remove(int indice) {
		this.tamanhoLista--;
		Object[] listaAux = new Object[this.posicaoLivre];
		int cont = 0;

		for (int i = 0; i <= this.tamanhoLista; i++) {
			if (!(indice == i)) {
				listaAux[cont] = listObjetos[i];
				cont++;
			}
		}
		listObjetos = listaAux;
	}

	@Override
	public Object pega(int i) {
		if (this.tamanhoLista < i) {
			throw new ObjectlistException("indice não existe");
		}
		if (this.listObjetos[--i] == null) {
			throw new ObjectlistException("referencia nula");
		}
		return this.listObjetos[--i];
	}

	@Override
	public boolean contem(Object ob) {
		for (Object objeto : this.listObjetos) {
			if (objeto != null) {
				if (ob.equals(objeto)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return this.listObjetos.toString();
	}

	@Override
	public int tamanho() {
		return this.tamanhoLista;
	}
}