package br.com.ftt.meuprojeto.Entidades;

import br.com.ftt.meuprojeto.EstadosCompra;

public class Compra {

    private EstadosCompra estado;
    private int id;
    private String descricao;
    private boolean compraConcluida;
    
    public Compra(int id, String descricao){
        setEstado(EstadosCompra.EFETUADA);
        this.id = id;
        this.descricao = descricao;
    }
    
    public EstadosCompra getEstado() {
        return estado;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setEstado(EstadosCompra estado) {
        this.estado = estado;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCompraConcluida(boolean compraConcluida) {
        this.compraConcluida = compraConcluida;
    } 

    public Compra avalia(){
        return estado.executa(this);
    }

    public boolean getCompraConcluida(){
        return this.compraConcluida;

    }
}
