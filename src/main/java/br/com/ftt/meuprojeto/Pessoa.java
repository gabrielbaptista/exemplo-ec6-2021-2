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
public class Pessoa {
    
    private String nome;
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public void dizerOlaAoMundo(){
        System.out.println(nome + ": Olá Mundo!");
    }
}
