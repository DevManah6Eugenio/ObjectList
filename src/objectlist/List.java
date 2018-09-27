package objectlist;

public interface List {
	public int tamanho();

	public void adiciona(Object ob);

	public Object pega(int i);

	public void remove(int i);

	public boolean contem(Object ob);

	public String toString();
}
