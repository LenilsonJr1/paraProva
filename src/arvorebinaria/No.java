
package arvorebinaria;

public class No {
   private int  valor;
   private No pai,filhoEsquerdo,filhoDireito;

    public No(int valor, No pai, No filhoEsquerdo, No filhoDireito) {
        this.valor = valor;
        this.pai = pai;
        this.filhoEsquerdo = filhoEsquerdo;
        this.filhoDireito = filhoDireito;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

    public No getFilhoEsquerdo() {
        return filhoEsquerdo;
    }

    public void setFilhoEsquerdo(No filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public No getFilhoDireito() {
        return filhoDireito;
    }

    public void setFilhoDireito(No filhoDireito) {
        this.filhoDireito = filhoDireito;
    }
   
    
   
   
   
   
   
   
   
   
   
   
   
   
}
