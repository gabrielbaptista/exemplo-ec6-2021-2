/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftt.meuprojeto;

/**
 *
 * @author gabriell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa gabriel = new Pessoa("Gabriel");
        gabriel.dizerOlaAoMundo();
        
        Pessoa danillo = new Pessoa("Danillo");
        danillo.dizerOlaAoMundo();
        
        Pessoa giovana = new Pessoa("Giovana");
        giovana.dizerOlaAoMundo();
    }
    
}
