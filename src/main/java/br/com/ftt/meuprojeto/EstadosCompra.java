package br.com.ftt.meuprojeto;

import br.com.ftt.meuprojeto.Entidades.Compra;
import br.com.ftt.meuprojeto.Maquina.ExecucaoEstadoCompraAprovada;
import br.com.ftt.meuprojeto.Maquina.ExecucaoEstadoCompraEfetuada;
import br.com.ftt.meuprojeto.Maquina.ExecucaoEstadoCompraEntregue;
import br.com.ftt.meuprojeto.Maquina.ExecucaoEstadoCompraEnviada;
import br.com.ftt.meuprojeto.Maquina.MaquinaEstadoConsole;

public enum EstadosCompra {
    EFETUADA("Efetuada", new ExecucaoEstadoCompraEfetuada()),
    APROVACAO("Aprovada", new ExecucaoEstadoCompraAprovada()),
    ENVIO("Enviada", new ExecucaoEstadoCompraEnviada()),
    ENTREGA("Entregue", new ExecucaoEstadoCompraEntregue());

    private String descricaoEstado;
    private MaquinaEstadoConsole maquina;
    
    EstadosCompra(String descricaoEstado, MaquinaEstadoConsole maquina ){
        this.maquina = maquina;
        this.descricaoEstado = descricaoEstado;
    } 

    public String getEntidade(){
        return this.descricaoEstado;
    }

    public Compra executa(Compra compra){
        maquina.setCompra(compra);
        return maquina.executa();
    }
}
