# meusovokkkk
jeguelson

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
    
    public boolean valorInexistente( String v){
        String hash = "" + ((v.length() * 2) / 3);
        
        if(!listaVazia()){
            Elemento atual = primeiro;
            atual.hash = "" + ((v.length() * 2) / 3);
            do{
                if(!hash.equals(atual.hash)){
                    System.out.println(atual.valor + "diferente");
                    atual = atual.proximo;
                    continue;
                }
                else {
                    System.out.println(atual.valor + "igual");
                    atual = atual.proximo;
                    return true;
                }
            }while (atual!=null);
        }else{
            return false;
        }
    }

    public void adicionarLista(String valor){
        Elemento e = new Elemento(valor);
        if(listaVazia()){
            primeiro =e;
            ultimo =e;
        }else if (valorInexistente(e.valor)){
            ultimo.proximo = e;
            e.anterior = ultimo;
            ultimo= e;
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
                    }
                    if(atual.anterior==null && atual.proximo!=null){
                        atual.proximo.anterior=null;
                        primeiro = atual.proximo;
                    }
                    if (atual.anterior!=null && atual.proximo==null){
                        atual.anterior.proximo= null;
                        ultimo = atual.anterior;
                    }
                    if (atual.anterior!=null && atual.proximo!=null){
                        atual.anterior.proximo= atual.proximo;
                        atual.proximo.anterior = atual.anterior;
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
                System.out.println(atual.valor);
                atual = atual.proximo;
            }while (atual!=null);
        }
    }

    public static void main(String[] args) {
        
    }

}


public class Elemento {
    Elemento proximo;
    Elemento anterior;
    String valor;
    Integer indice;
    String hash;
    
    Elemento(String valor){
        this.valor = valor;
        this.hash = ((valor.length() *2)/ 3) + valor.substring(0, 2);
        System.out.println(this.hash);
    }
}



public class Main
{
	public static void main(String[] args) {
		Lista l = new Lista();
        l.adicionarLista("brasil");
        l.adicionarLista("china");
        l.adicionarLista("portugual");
        l.adicionarLista("espanha");
        l.adicionarLista("japao");
        l.removerLista("brasil");
        l.removerLista("japao");
        l.removerLista("portugual");
        l.imprimirLista();
        System.out.println("fodase");
	}
}

