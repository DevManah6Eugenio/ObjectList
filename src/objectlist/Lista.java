package objectlist;

/**
 *
 * @author manasses Email manasses.java@gmail.com
 *
 */
public class Lista implements List {

    private Object[] listObjetos;
    private Object[] listObjetosAuxiliar;
    int cont = 0;

    Lista(Object obj) {
        listObjetos = new obj[0];
    }
    
    public Object tipeClass() {
      return listObjetos.getClass();
    }
        
    public int length() {
        return listObjetos.length;
    }

    public void add(Object ob) {
        listObjetosAuxiliar = listObjetos;
        listObjetos = new Object[(listObjetosAuxiliar.length + 1)];
        cont = 0;
        
        for (Object lobj : listObjetosAuxiliar) {
            cont++;
            listObjetos[cont] = lobj;
        }
        
        listObjetos[listObjetosAuxiliar.length] = ob;
    }
    
    public void remove(int idice) {
        
    }
    
    public void clear(){
        
    }

}