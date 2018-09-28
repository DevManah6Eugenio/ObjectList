package objectlist;

public class Obj {

	private String mensagem = null;

	Obj() {

	}

	Obj(String m) {
		this.mensagem = m;
	}

	
	public void print() {
		if (this.mensagem == null) {
			System.out.println("to aqui");
		} else {
			System.out.println(this.mensagem);
		}
	}
}
