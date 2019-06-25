
package tabelahash;

public class No {
    private No proximo;
    private No anterior;
    private int Key;
    private int valor;

    public No(No proximo, No anterior, int Key, int valor) {
        this.proximo = proximo;
        this.anterior = anterior;
        this.Key = Key;
        this.valor = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public int getKey() {
        return Key;
    }

    public void setKey(int Key) {
        this.Key = Key;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
