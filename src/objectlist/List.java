package objectlist;

public interface List {
    public int length();
    public void add(Object ob);
    public void remove(int indice);
    public String typeObjectList();
    public Object getRef(int indice);
    public void cleanRef(int indice);
}
