/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftt.meuprojeto;

import br.com.ftt.meuprojeto.Entidades.Compra;

/**
 *
 * @author gabriell
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Compra compraDoGabriel = new Compra(1234, "Compra de um mouse");
        do 
        {
            compraDoGabriel = compraDoGabriel.avalia();
            Thread.sleep(100);
        }
        while (!compraDoGabriel.getCompraConcluida());
        System.out.println("Fim do processo!");
    }

}
