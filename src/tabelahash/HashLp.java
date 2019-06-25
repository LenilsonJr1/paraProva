package tabelahash;
public class HashLp {
     private No mapa[];
    private int tamanho;
    private int tamanhoArray;

    public HashLp(int tamanhoArray) {
        this.mapa = new No[tamanhoArray];
        this.tamanho = 0;
        this.tamanhoArray = tamanhoArray;
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
        if(this.tamanho == 0){
            return true;
        }
        return false;
        
    }
    
    public void insert(int key, int valor){
        
    if(this.isEmpty() ==  false){  
        if(mapa.length == tamanhoArray){
            No novoMp[] = new No[mapa.length*2];
            for(int i=0 ; i<mapa.length ; i++){
                int hash = i;
                if(mapa[hash] != null){
                    hash =  mapa[i].getKey()%novoMp.length;
                }
                novoMp[hash] =  mapa[i];
            }
            mapa =  novoMp;
        }
    }
    
        int hashKey = key%this.mapa.length;
        if(mapa[hashKey] == null){
            No novoNo = new No(null,null,key,valor);
           mapa[hashKey] =  novoNo;
           tamanho++;
        }else{

            while(mapa[hashKey] != null){
                hashKey= (key+1)%this.mapa.length;
                
            }
            No novoNo = new No(null,null,key,valor);
            mapa[hashKey] = novoNo;
            tamanho++;
            
        }
    }
    
    
    
    
    public No find(int key){
        int hashKey = key%this.mapa.length;
        No noBuscado = mapa[hashKey];
        int k = key;
        int tam = 0;
        while(tam<mapa.length){
            k++;
            if(noBuscado == null){
                hashKey = k%mapa.length;
                noBuscado = mapa[hashKey];
                tam++;
            }else{
                if(noBuscado.getKey() == key){
                    break;
                }else{
                    hashKey = k%mapa.length;
                    noBuscado = mapa[hashKey];
                    tam++;
                }
            }
        }
        
         if(noBuscado == null || noBuscado.getKey() != key){
            return null;
            
            
        }
        return noBuscado;
    }
    
    public No Remove(int key){
        int hashKey = key%this.mapa.length;
        No noRemover = mapa[hashKey];
        int k = key;
        int tam = 0;
        No aux = null;
        while(tam<mapa.length){
            k++;
            if(noRemover == null){
                hashKey = k%mapa.length;
                noRemover = mapa[hashKey];
                tam++;
            }else{
                if(noRemover.getKey() == key){
                     aux = noRemover;
                    mapa[hashKey] =  null;
                    tamanho--;
                    break;
                }else{
                    hashKey = k%mapa.length;
                    noRemover = mapa[hashKey];
                    tam++;
                }
            }
        }
        if(noRemover == null || noRemover.getKey() != key){
            return null;
            
            
        }
        
        
        return aux;
    }
    
    
    
    
    
    
    
    
    
    
    
}
