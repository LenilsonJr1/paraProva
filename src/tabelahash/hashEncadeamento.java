
package tabelahash;

public class hashEncadeamento {
    
    private No mapa[];
    private int tamanho;

    public hashEncadeamento() {
        this.mapa = new No[100];
        this.tamanho = 0;
    }

    public No[] getMapa() {
        return mapa;
    }

    public void setMapa(No[] mapa) {
        this.mapa = mapa;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
    public boolean isEmpty(){
        if(tamanho == 0){
            return true;
        }
        return false;
    }
    
    
    public int size(){
        return this.tamanho;
    }
    
    public void insert(int key, int valor){
       int  hashKey =  key%mapa.length;
       if(mapa[hashKey] ==  null){
           No novoNo =  new No(null,null,key,valor);
           mapa[hashKey] = novoNo; 
           this.tamanho++;
       }else{
           No aux = mapa[hashKey];
           while(aux.getProximo() != null){
               aux = aux.getProximo();
           }
           No novoNo =  new No(null,aux,key,valor);
           novoNo.setAnterior(aux);
           novoNo.setProximo(null);
           aux.setProximo(novoNo);
           this.tamanho++;
           
       }
        
        
    }
    
    
    public No find(int key){
        int hashKey =  key%this.mapa.length;
        
        if(this.mapa[hashKey] == null){
            System.out.println("deu erro");
            return null;
        }
        No aux = mapa[hashKey];
        while(aux.getKey() != key ){
            aux =  aux.getProximo();
        }
        return aux;
        
    }
    
    public No remove(int key){
        int hashKey =  key%mapa.length;
        
        if(this.isEmpty() == false){
            if(mapa[hashKey].getKey() ==  key){
                if(mapa[hashKey].getProximo() != null){
                    No aux = mapa[hashKey];
                    mapa[hashKey] =  mapa[hashKey].getProximo();
                            return aux;
                }else{
                    No aux = mapa[hashKey];
                    mapa[hashKey] = null;
                    return aux;
                }
            }else{
                No aux = mapa[hashKey];
                while(aux.getKey() != key){
                    aux = aux.getProximo();
                    
                }
                aux.getAnterior().setProximo(aux.getProximo());
                aux.setAnterior(null);
                aux.setProximo(null);
                return(aux);
            }
            
            
        }
        return null;
        
    }
    
    
    
    
    
    
    
    
}
