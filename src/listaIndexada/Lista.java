package listaIndexada;

public class Lista {
	Elemento primeiro; 
	Elemento ultimo;

	public boolean listaVazia(){
	    if(primeiro==null){
	        return true;
	    }else{
	        return false;
	    }
	}

	public boolean valorInexistente(String v){
	    String hash = "" + ((v.length() * 2) / 3)+ v.substring(0, 2);
	    
	    if(!listaVazia()){
	        Elemento atual = primeiro;	        
	        do{
	            if(!hash.equals(atual.hash)){
	               // System.out.println("	"+ v + " é diferente de " + atual.valor + " -->");
	                atual = atual.proximo;
	                continue;
	            }
	            else if(hash.equals(atual.hash)){
	                //System.out.println("	" + v + " é igual a: " + atual.valor + " portanto não foi criado");
	                atual = atual.proximo;
	                return false;
	            } else {
	            	System.out.println("	erro fatal");
	            }
	        }while (atual!=null);
	    } return true;
	}

	public void adicionarLista(String valor){
	    Elemento e = new Elemento(valor);
	    if(listaVazia()){
	        primeiro =e;
	        ultimo =e;
	        e.indice = 0;
	    }else if (valorInexistente(e.valor)){
	        ultimo.proximo = e;
	        e.anterior = ultimo;	        
	        ultimo= e;
	        e.indice = e.anterior.indice + 1;
	    }
	}

	public void removerLista(String valor){
		
	    if(!listaVazia()){
	        Elemento atual = primeiro;
	        do{
	            if(atual.valor.equals(valor)){
	                if(atual.anterior==null && atual.proximo==null){
	                    primeiro=null;
	                    ultimo=null;
	                    atual.indice = 0;
	                }
	                if(atual.anterior==null && atual.proximo!=null){
	                    atual.proximo.anterior=null;
	                    primeiro = atual.proximo;
	                    primeiro.indice = 0;
	                    
	                    Elemento i = primeiro.proximo;
	                    do {
	                    	i.indice = i.anterior.indice + 1;
	                    	i = i.proximo;
	                    }while(i != null);
	                }
	                if (atual.anterior!=null && atual.proximo==null){
	                    atual.anterior.proximo= null;
	                    ultimo = atual.anterior;
	                    
	                    Elemento i = ultimo.anterior;
	                    do {
	                    	i.indice = i.proximo.indice - 1;
	                    	i = i.anterior;
	                    }while(i != null);
	                }
	                if (atual.anterior!=null && atual.proximo!=null){
	                    atual.anterior.proximo= atual.proximo;
	                    atual.proximo.anterior = atual.anterior;
	                    
	                    Elemento i = atual.proximo;
	                    do {
	                    	i.indice = i.anterior.indice + 1;
	                    	i = i.proximo;
	                    }while(i != null);
	                }
	            }
	            atual = atual.proximo;
	        }while(atual!=null);
	    }
	}

	public void imprimirLista(){
	    if(!listaVazia()){
	        Elemento atual = primeiro;
	        do{
	            System.out.println(atual.valor + " indice " + atual.indice);
	            atual = atual.proximo;
	        }while (atual!=null);
	    }
	}
	
	public int getIndice(String valor) {
		if(!valorInexistente(valor)) {
			Elemento atual = primeiro;
			String hash = "" + ((valor.length() * 2) / 3)+ valor.substring(0, 2);
			
			do{
				if(atual.hash.equals(hash)) {
					System.out.printf("o indice do elemento %s é: %d", valor, atual.indice);
					return atual.indice;
				}
				
				atual = atual.proximo;
			} while(atual != null);
		}
		return -1;
	}

	public static void main(String[] args) {
	    
	}	
}
