package objectlist;

/**
 *
 * @author manasses 
 * Email manasses.java@gmail.com
 */
//public class Lista implements List {
public class Lista {

    private Object[] listObjetos = null;
    private int posicaoLivre;
    private String type = null;

    Lista(Object obj) {
        listObjetos = new Obj[0];
        this.posicaoLivre = 0;
        this.type = obj.toString();
    }

    public String typeObjectList() {
        return this.type;
    }

    /**
     *
     * @return tamanho da lista
     */
    public int length() {
        return this.posicaoLivre;
    }

    /**
     *
     * @param objeto que sera adicionado a lista
     */
    public void add(Object objeto) {
        this.posicaoLivre++;
        Object[] listaAux = new Object[this.posicaoLivre];

        for (int i = 0; i < this.posicaoLivre - 1; i++) {
            listaAux[i] = listObjetos[i];
        }

        this.listObjetos = listaAux;
        this.listObjetos[(this.posicaoLivre - 1)] = objeto;
        
    }

    /**
     *
     * @param indice que sera excluido da lista
     */
    public void remove(int indice) {
        this.posicaoLivre--;
        Object[] listaAux = new Object[this.posicaoLivre];
        int cont = 0;
        
        for (int i = 0; i <= this.posicaoLivre; i++) {
            if (!(indice == i)) {
                listaAux[cont] = listObjetos[i];
                cont++;
            }
        }
        listObjetos = listaAux;
    }

    /**
     *
     * @param indice da referencia a ser acessado
     * @return referencia
     */
    public Object getRef(int indice) {
        return this.listObjetos[indice];
    }

    /**
     *
     * @param indice da referencia a ser limpado
     */
    public void cleanRef(int indice) {
        this.listObjetos[indice] = null;
    }
}