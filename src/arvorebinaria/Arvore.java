
package arvorebinaria;

import java.util.ArrayList;

public class Arvore {
    
    private No raiz;
    private ArrayList<No> listaPreOrder, listaInOrder, listaPosOrder;
    private int tamanho;

    public Arvore() {
        this.tamanho = 0;
        
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public ArrayList<No> getListaPreOrder() {
        return listaPreOrder;
    }

    public void setListaPreOrder(ArrayList<No> listaPreOrder) {
        this.listaPreOrder = listaPreOrder;
    }

    public ArrayList<No> getListaInOrder() {
        return listaInOrder;
    }

    public void setListaInOrder(ArrayList<No> listaInOrder) {
        this.listaInOrder = listaInOrder;
    }

    public ArrayList<No> getListaPosOrder() {
        return listaPosOrder;
    }

    public void setListaPosOrder(ArrayList<No> listaPosOrder) {
        this.listaPosOrder = listaPosOrder;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
    public boolean isInternal(No no){
        if(no.getFilhoDireito() !=null  || no.getFilhoEsquerdo() != null){
            return true;
            
        }
        return false;    
    }
    
    public boolean isExternal(No no){
        if(no.getFilhoDireito() == null &&  no.getFilhoEsquerdo() == null){
            return true;
        }
        return false;
    }
    
    public int altura(No no){
        if(no == null || this.isExternal(no)){
            return 0;
        }else{
            int alturaEsquerdo =  altura(no.getFilhoEsquerdo());
            int alturaDireito  =  altura(no.getFilhoDireito());
            
            if(alturaDireito > alturaEsquerdo){
                 return alturaDireito+1;
            }
            return alturaEsquerdo+1;
            
        }
        
    }
    
    public int depth(No no) {
		if(no == null) return -1;
		if(this.isRoot(no)) return 0;
		else return 1 + depth(no.getPai());
	}
    
    
    
    
    
    
    
    
    
    
    public  ArrayList<No> fihlos(No pai){
        ArrayList<No> filhos = new ArrayList<No>();
        if(pai.getFilhoDireito() != null ){
            filhos.add(pai.getFilhoDireito());  
        }
        
        if(pai.getFilhoEsquerdo() != null){
            filhos.add(pai.getFilhoEsquerdo());
        }
        return filhos;
        
    }
    
    public boolean isRoot(No no){
        if(no == raiz){
            return true;
        }else{
            return false;
            
        }
        
    }
    
    public No parent(No filho){
        return filho.getPai();
        
    }
    
    
    public int size(){
        return this.tamanho;
    }
    
    public boolean isEmpty(){
        if(raiz ==  null){
            return true;
        }
        
        return false;
    }
    
    public void insert(No no, int valor){
        if(raiz == null){
            raiz = new No(valor,null,null,null);
            tamanho++;
            
        }else{
            if(valor < no.getValor()){
                
                if(no.getFilhoEsquerdo() != null){
                     insert(no.getFilhoEsquerdo(),valor);
                    
                }else{
                No novoNo = new No(valor,no,null,null);
                no.setFilhoEsquerdo(novoNo);
                tamanho++;
            }
               
                
            }else{
                if(no.getFilhoDireito() != null){
                    insert(no.getFilhoDireito(),valor);
                }else{
                    No novoNo =  new No(valor,no,null,null);
                    no.setFilhoDireito(novoNo);
                    tamanho++;
                }
            }      
        } 
    }
    
    
   // public void insert(No no, int valor) {
	//	if(raiz == null) {
		//	raiz =  new No(valor, null, null, null);
		//}
		//else {
		//	if(valor < no.getValor()) {
		//		if(no.getFilhoEsquerdo() != null) {
		//			insert(no.getFilhoEsquerdo(), valor);
		//		}
		//		else {
		//			No novo = new No(valor,no, null, null);
		//			no.setFilhoEsquerdo(novo);
                  //                      tamanho++;
		//		}
		//	}
		//	else {
		//		if(no.getFilhoDireito() != null) {
		//			insert(no.getFilhoDireito(), valor);
		//		}
		//		else {
		//			No novo = new No(valor,no, null, null);
		//			no.setFilhoDireito(novo);
          ///                              tamanho++;
	//			}
	//		}
	//	}
	//}
    
    public No busca(No no, int valorAprocura){
        No aux = null;
        if(raiz == null){
            return null;
            
        }else{
            if(no.getValor() == valorAprocura){
                return no;
            }
            if(valorAprocura < no.getValor()){
                    if(no.getFilhoEsquerdo() != null){
                       aux = this.busca(no.getFilhoEsquerdo(), valorAprocura);
                    }else{
                        return null;
                    }
                
            }else{
               if(no.getFilhoDireito() != null){
                   aux = this.busca(no.getFilhoDireito(), valorAprocura);
               }else{
                   return null;
               }
                
            }
 
        }
        no =  aux;
        return no;
    }
    
    
 public ArrayList<No> preOrder(No no, boolean visitou){
     if(visitou == true){
         listaPreOrder =  new ArrayList<No>();
     }
     listaPreOrder.add(no);
     if(this.isInternal(no) == true){
        if(no.getFilhoEsquerdo() != null){
            this.preOrder(no.getFilhoEsquerdo(),false);    
        }
        if(no.getFilhoDireito() != null){
            this.preOrder(no.getFilhoDireito(),false);
        }    
     }
    
     return listaPreOrder;
     
 }  

    public ArrayList<No> inOrder(No no, boolean visitou){
        if(visitou == true){
            listaInOrder =  new ArrayList<No>();
        }
        
        if(no.getFilhoEsquerdo() != null){
            this.inOrder(no.getFilhoEsquerdo(),false);
        }
        listaInOrder.add(no);
        
        if(no.getFilhoDireito() != null){
            this.inOrder(no.getFilhoDireito(),false);
        }
        
      return listaInOrder;
    }
    
    public ArrayList<No>posOrder(No no,boolean visitou){
        if(visitou == true){
            listaPosOrder =  new ArrayList<No>();       
        }
        if(no.getFilhoDireito() != null){
            this.posOrder(no.getFilhoDireito(),false);
        }
        if(no.getFilhoEsquerdo() != null){
            this.posOrder(no.getFilhoEsquerdo(),false);
        }
        listaPosOrder.add(no);
        
        return listaPosOrder;
    }
    
    
    
}