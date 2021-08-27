package br.com.ftt.meuprojeto.Maquina;

import br.com.ftt.meuprojeto.Entidades.Compra;

public abstract class MaquinaEstadoConsole {
    public abstract void setCompra(Compra compra);
    public abstract Compra executa();
}
