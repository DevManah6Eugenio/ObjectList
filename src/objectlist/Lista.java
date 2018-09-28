package objectlist;

public class Lista implements List {

	private Object[] listObjetos = null;
	private Object[] listaAux = null;
	private int tamanhoLista;

	Lista(Object obj) {
		listObjetos = new Obj[0];
		this.tamanhoLista = 0;
		obj.toString();
	}

	private boolean validarPosicao(int posicao) {
		if (posicao < 0) {
			throw new ObjectlistException("Posição Nula");
		}
		if (posicao > this.tamanhoLista) {
			throw new ObjectlistException("Posição Invalida");
		}
		return true;
	}

	private boolean validarObjeto(Object objeto) {
		if (objeto == null) {
			throw new ObjectlistException("Objeto nullo");
		}
		return true;
	}

	@Override
	public void adiciona(Object objeto) {

		this.validarObjeto(objeto);

		listaAux = new Object[this.tamanhoLista + 1];

		for (int i = 0; i < this.tamanhoLista; i++) {
			listaAux[i] = listObjetos[i];
		}

		this.listObjetos = listaAux;
		this.listObjetos[(this.tamanhoLista)] = objeto;
		this.listaAux = null;
		this.tamanhoLista++;
	}

	@Override
	public void adiciona(int posicao, Object objeto) {

		validarObjeto(objeto);
		validarPosicao(posicao - 1);

		if (posicao != (this.tamanhoLista + 1)) {
			listaAux = new Object[this.tamanhoLista + 1];
			for (int i = 0; i < this.tamanhoLista; i++) {
				if (i < posicao - 1) {
					listaAux[i] = listObjetos[i];
				} else {
					if (i == posicao - 1) {
						listaAux[i] = objeto;
					}
					listaAux[i + 1] = listObjetos[i];
				}
			}

			this.listObjetos = listaAux;
			this.listaAux = null;
			this.tamanhoLista++;
		} else {
			this.adiciona(objeto);
		}
	}

	@Override
	public void remove(int posicao) {
		validarPosicao(posicao - 1);

		Object[] listaAux = new Object[this.tamanhoLista];
		int cont = 0;

		for (int i = 0; i <= this.tamanhoLista - 1; i++) {
			if (!(posicao == (i + 1))) {
				listaAux[cont] = listObjetos[i];
				cont++;
			}
		}
		listObjetos = listaAux;
		this.tamanhoLista--;
		listaAux = null;
	}

	@Override
	public Object pega(int posicao) {
		validarPosicao(posicao - 1);

		if (this.listObjetos[posicao - 1] == null) {
			throw new ObjectlistException("referencia nula");
		}
		return this.listObjetos[posicao - 1];
	}

	@Override
	public boolean contem(Object objeto) {
		validarObjeto(objeto);
		for (Object ob : this.listObjetos) {
			if (ob != null) {
				if (objeto.equals(ob)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Lista:".concat(this.listObjetos.toString());
	}

	@Override
	public int tamanho() {
		return this.tamanhoLista;
	}
}