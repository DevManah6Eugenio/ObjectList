package objectlist;

public class ObjectList {
	public static void main(String[] args) {
		Obj objeto1 = new Obj();
		Obj objeto2 = new Obj("segundo");

		Lista lista = new Lista(Obj.class);

		System.out.println("tamanho da lista: " + lista.tamanho());
		lista.adiciona(objeto1);
		System.out.println("tamanho da lista: " + lista.tamanho());
		lista.adiciona(objeto2);
		System.out.println("tamanho da lista: " + lista.tamanho());

		System.out.println("contem objeto 1 :" + lista.contem(objeto1));

		System.out.println("contem novo objeto :" + lista.contem(new Obj()));

		Obj aux = (Obj) lista.pega(1);
		aux.print();
		Obj aux2 = (Obj) lista.pega(2);
		aux2.print();
		Obj aux3 = (Obj) lista.pega(3);
		aux3.print();
	}
}