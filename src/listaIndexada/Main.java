package listaIndexada;

public class Main {
	public static void main(String[] args) { 
		Lista l = new Lista(); 
		l.adicionarLista("aa"); 
		l.adicionarLista("bb"); 
		l.adicionarLista("cc"); 
		l.adicionarLista("aa"); 
		l.adicionarLista("dd");
		l.adicionarLista("ee");
		l.adicionarLista("ff");
		l.removerLista("cc"); 
		l.removerLista("bb"); 
		l.removerLista("gg"); 		
		l.imprimirLista();
		System.out.println("   indice teste: ");
		l.getIndice("ff");		
	}
}
