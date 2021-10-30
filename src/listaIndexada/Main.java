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
		l.imprimirLista();
		l.removerLista("bb"); 
		l.removerLista("cc"); 
		l.removerLista("gg");		
		l.imprimirLista();		
		l.getIndice("ff");
		l.removerLista(3);
		l.imprimirLista();
		l.getValor(1);
	}
}
