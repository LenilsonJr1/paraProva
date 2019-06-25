/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

import java.util.ArrayList;

/**
 *
 * @author priscila06
 */
public class ArvoreBInaria {

    public static void main(String[] args) {
        Arvore arv = new Arvore();
        arv.insert(arv.getRaiz(),10);
        
        arv.insert(arv.getRaiz(),5);//pai
        arv.insert(arv.getRaiz(),1);//filho esquerdo
        arv.insert(arv.getRaiz(),8);// filho direito
        
       arv.insert(arv.getRaiz(),15);//pai
       arv.insert(arv.getRaiz(),12);// filho esquerdo
       arv.insert(arv.getRaiz(),18);// filho direito
       
     //  System.out.println(arv.getRaiz().getFilhoEsquerdo().getFilhoDireito().getValor());
       
      //No noBusca = arv.busca(arv.getRaiz(),6);
       
     // System.out.println("elemento achado o seu valor é "+noBusca.getValor()+"seu pai é "+noBusca.getPai().getValor()+" seu irmão "+noBusca.getPai().getFilhoEsquerdo().getValor());
        
     ArrayList<No> preOrdem =  new ArrayList<No>();
     preOrdem = arv.preOrder(arv.getRaiz(),true);
     System.out.println("preOrdem");
      for(int i = 0 ; i<preOrdem.size() ; i++){
          System.out.print(preOrdem.get(i).getValor());
          System.out.print("--->");
      }
      System.out.println(" ");
      System.out.println("InOrdem");
      ArrayList<No> inOrdem =  new ArrayList<No>();
     inOrdem = arv.inOrder(arv.getRaiz(),true);
      for(int i = 0 ; i<inOrdem.size() ; i++){
          System.out.print(inOrdem.get(i).getValor());
          System.out.print("--->");
      }
      
      System.out.println(" ");
      System.out.println("PosOrdem");
      ArrayList<No> PosOrdem =  new ArrayList<No>();
     PosOrdem = arv.posOrder(arv.getRaiz(),true);
      for(int i = 0 ; i<PosOrdem.size() ; i++){
          System.out.print(PosOrdem.get(i).getValor());
          System.out.print("--->");
      }
      System.out.println(" ");
      System.out.println(arv.altura(arv.getRaiz()));
      
      System.out.println(arv.depth(arv.getRaiz()));
      
      
    }
     
}
