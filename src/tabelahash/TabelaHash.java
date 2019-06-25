
package tabelahash;
public class TabelaHash {

    public static void main(String[] args) {
       hashEncadeamento hash =  new hashEncadeamento();
       
       //hash.insert(889, 1);
      // hash.insert(989, 2);
      // hash.insert(789, 3);
       
      // System.out.println(hash.isEmpty());
      // System.out.println(hash.size());
       
      
        
       //No aux =  hash.remove(789);
       
      // System.out.println("no removido:"+ aux.getValor() +" "+ aux.getKey());
       
        //No hashMp[] = hash.getMapa();
       //No objeto = hashMp[789%hashMp.length];
       
      // while(objeto != null){
       //   System.out.println(objeto.getValor());
        //   System.out.println(objeto.getKey());
        //   objeto = objeto.getProximo();
           
      // }
       
       
       HashLp hashlp =  new HashLp(3);
       
       hashlp.insert(889, 1);
       hashlp.insert(789, 2);
       hashlp.insert(989, 3);
       
       //System.out.println(hashlp.isEmpty());
       //System.out.println(hashlp.getTamanho());
       
       
        hashlp.insert(689, 4);
     
      No no = hashlp.Remove(689);
      System.out.println(no.getValor());
       No no1 = hashlp.find(689);
       System.out.println(no1.getValor());
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
