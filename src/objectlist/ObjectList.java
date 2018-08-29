package objectlist;

/**
 *
 * @author manasses Email manasses.java@gmail.com
 *
 */
public class ObjectList {

    // metodo construtor
    ObjectList() {

    }

    public static void main(String[] args) {

        Obj objeto1 = new Obj();
        Obj objeto2 = new Obj("segundo");

        Lista lista = new Lista(Obj.class);

        lista.add(objeto1);
        System.out.println("tamanho da lista: " + lista.length());
        lista.add(objeto2);
        System.out.println("tamanho da lista: " + lista.length());

        Obj aux = (Obj) lista.getRef(0);
        aux.print();
        Obj aux2 = (Obj) lista.getRef(1);
        aux2.print();

        System.out.println("tipo da lista: " + lista.tipeObjetList());

        lista.remove(0);

        Obj aux3 = (Obj) lista.getRef(0);
        aux3.print();
        
        System.out.println(lista.length());
    }
}
