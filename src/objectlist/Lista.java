package objectlist;

/**
 *
 * @author manasses 
 * Email manasses.java@gmail.com
 */
public class Lista implements List {

    private Object[] listObjetos = null;
    private int posicaoLivre;
    private String type = null;

    Lista(Object obj) {
        listObjetos = new Obj[0];
        this.posicaoLivre = 0;
        this.type = obj.toString();
    }

    @Override
    public String typeObjectList() {
        return this.type;
    }

    /**
     *
     * @return tamanho da lista
     */
    @Override
    public int length() {
        return this.posicaoLivre;
    }

    /**
     *
     * @param objeto que sera adicionado a lista
     */
    @Override
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
    @Override
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
    @Override
    public Object getRef(int indice) {
        return this.listObjetos[indice];
    }

    /**
     *
     * @param indice da referencia a ser limpado
     */
    @Override
    public void cleanRef(int indice) {
        this.listObjetos[indice] = null;
    }
}