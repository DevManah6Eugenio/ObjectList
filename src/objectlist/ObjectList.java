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
		
		Obj teste = new Obj("testando o adicionar com posiçao");
		
		lista.adiciona(1, teste);
		
		Obj aux = (Obj) lista.pega(1);
		aux.print();
		Obj aux2 = (Obj) lista.pega(2);
		aux2.print();
		Obj aux3 = (Obj) lista.pega(3);
		aux3.print();
		
		System.out.println("tamanho :" + lista.tamanho());
		
		lista.remove(3);
		
		System.out.println("tamanho :" + lista.tamanho());
		
	    aux = (Obj) lista.pega(1);
		aux.print();
		aux2 = (Obj) lista.pega(2);
		aux2.print();

	}
}