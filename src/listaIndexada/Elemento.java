package listaIndexada;

public class Elemento {
	Elemento proximo; 
	Elemento anterior; 
	String valor; 
	Integer indice; 
	String hash;

	Elemento(String valor){
	    this.valor = valor;
	    this.hash = ((valor.length() *2)/ 3) + valor.substring(0, 2);	    
	}
}
