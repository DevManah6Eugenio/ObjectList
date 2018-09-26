package objectlist;

public interface List {
	
    public int length();
    public void adiciona(Object ob);
    public Object pega(int i);
    public void remove(int i);
    public String typeObjectList();
    public Object getRef(int i);
    public void cleanRef(int i);
}
